package com.example.drug.controller;

import com.example.drug.common.ResultMapUtil;
import com.example.drug.entity.UploadFile;
import com.example.drug.service.IUploadFileService;
import org.apache.commons.io.FilenameUtils;
import org.apache.commons.io.IOUtils;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.IncorrectCredentialsException;
import org.apache.shiro.authc.UnknownAccountException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.ResourceUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.URLEncoder;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.UUID;
// 未启用
/**
 * 文件相关的controller
 */
@Controller
public class FileUploadController {

    public static final String FILE_FOLDER = "/static/files/";

    @Autowired
    private IUploadFileService fileService;

    @GetMapping("/uploadfile")
    public String toIndex(Model model) {
        List<UploadFile> list = fileService.list();
        model.addAttribute("fileList",list);
        return "/uploadfile";
    }

    @PostMapping("/uploadfile/upload")
    public String upload(MultipartFile multipartFile) throws IOException {

        // 文件原名称
        String oldName = multipartFile.getOriginalFilename();
        // 文件后缀
        String extension = "." + FilenameUtils.getExtension(multipartFile.getOriginalFilename());
        // 新文件名
        String newName = UUID.randomUUID().toString().replace("-", "").substring(8) + extension;
        // 文件尺寸
        long size = multipartFile.getSize();
        // 文件类型
        String type = multipartFile.getContentType();
        // 获取编译后项目根路径
        String basePath = ResourceUtils.getURL("classpath:").getPath();
        // 按照时间分类
        String timePath = new SimpleDateFormat("yyyy-MM-dd").format(new Date());
        // 根路径/static/files/20xx-xx-xx/
        String finalPath = basePath + FILE_FOLDER + timePath;
        // 创建文件夹
        File finalFile = new File(finalPath);
        if (!finalFile.exists()) {
            finalFile.mkdirs();
        }
        // 上传文件: 核心代码
        multipartFile.transferTo(new File(finalFile, newName));
        // 保存文件信息到数据库
        UploadFile uploadFile = new UploadFile();
        uploadFile.setOldName(oldName);
        uploadFile.setNewName(newName);
        uploadFile.setSize(String.valueOf(size));
        uploadFile.setFileType(type);
        uploadFile.setUrlPath(FILE_FOLDER + timePath);
        //将文件存入数据库
        fileService.save(uploadFile);
        return "redirect:/uploadfile";
    }

    @GetMapping("/uploadfile/download")
    public void download(Integer id, HttpServletResponse response) throws IOException {
        // 文件信息
        UploadFile uploadFile = fileService.getById(id);
        fileService.updateById(uploadFile);
        // 获取项目根路径
        String realpath = ResourceUtils.getURL("classpath:").getPath() + uploadFile.getUrlPath();
        // 获得文件输入流
        FileInputStream inputStream = new FileInputStream(new File(realpath, uploadFile.getNewName()));
        // 设置文件下载方式：附件下载
        response.setHeader("content-disposition", "attachment;fileName=" + URLEncoder.encode(uploadFile.getOldName(), "UTF-8"));
        // 获取响应输出流
        ServletOutputStream outputStream = response.getOutputStream();
        // 下载文件
        IOUtils.copy(inputStream, outputStream);
        IOUtils.closeQuietly(inputStream);
        IOUtils.closeQuietly(outputStream);
    }

    // 删除文件
    @GetMapping("/uploadfile/delete")
    public String delete(int id) throws FileNotFoundException {
        //根据Id查询信息
        UploadFile uploadFile = fileService.getById(id);
        // 删除文件
        String finalPath = ResourceUtils.getURL("classpath:").getPath() + uploadFile.getUrlPath();
        File file = new File(finalPath, uploadFile.getNewName());
        if (file.exists()) {
            file.delete();
        }
        // 删除数据库信息
        fileService.removeById(id);
        return "redirect:/uploadfile";
    }


}
