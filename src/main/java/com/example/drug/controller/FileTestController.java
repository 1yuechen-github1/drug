package com.example.drug.controller;

import com.example.drug.common.ResultMapUtil;
import com.example.drug.entity.*;
import com.example.drug.service.*;
import org.apache.commons.io.FilenameUtils;
import org.apache.commons.io.IOUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.ResourceUtils;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.URLEncoder;
import java.text.SimpleDateFormat;
import java.util.*;

import static com.example.drug.common.ResultMapUtil.getHashMapDel;
// 未启用
/**
 * 文件相关的controller
 */
@Controller
@RequestMapping(value = "file")
public class FileTestController {

    //ubuntu:/usr/projects/datas/patientDatas
    //windows:D:\wjk\Projects\IDEAProjects\drug_iframe\drug_v1\src\main\resources\static\files
    private static final String UPLOAD_DIR = "/usr/projects/datas/patientDatas";

    @Autowired
    private IPatientService patientService;

    @Autowired
    private IMedicalRecordService medicalRecordService;

    @Autowired
    private IFirstmedicalService firstmedicalService;

    @Autowired
    private IPlanService planService;

    @Autowired
    private IPhase_iService  phase_iService;

    @Autowired
    private IPhase_iiService phase_iiService;

    @Autowired
    private IImpressionService impressionService;

    @Autowired
    private ITransitService transitService;

    @Autowired
    private ICrownService crownService;

    @Autowired
    private ISubsquentService subsquentService;

    @Autowired
    private IAppointmentService appointmentService;

    @Autowired
    private IMedicalrecordDtoService medicalrecordDtoService;

    @Autowired
    private IMergerecordDtoService mergerecordDtoService;

    @Autowired
    private  IFileInfoService fileInfoService;


    @Autowired
    private IUploadFileService fileService;

    @GetMapping("/uploadfileindex")
    public String toIndex(Model model) {
        List<UploadFile> list = fileService.list();
        model.addAttribute("fileList",list);
        return "/file/filetext";
    }

    @PostMapping("/upload")
    @ResponseBody
    public Map<String, Object> uploadMultipleFiles(@RequestParam("file") List<MultipartFile> files,
                                                   @RequestParam("medicalrecordid") int medicalrecordid,
                                                   @RequestParam("stage") String stage) {
        Map<String, Object> response = new HashMap<>();

        try {
        // 创建目录，如果不存在

        //创建文件路径
        //1.确定患者姓名patientname
        Patient patient = patientService.queryPatientById(medicalRecordService.queryMedicalRecordById(medicalrecordid).getPatientid());
        String patientname = patient.getPatientname();
        //2.确定患者第几次就诊index
        List<MedicalRecord> medicalRecordList = medicalRecordService.queryMedicalRecordByPatientid(patient.getId());
            int index = -1; // 初始化索引为-1，表示未找到

            for (int i = 0; i < medicalRecordList.size(); i++) {
                MedicalRecord medicalRecord = medicalRecordList.get(i);
                if (medicalRecord.getId().equals(medicalrecordid)) {
                    index = i+1; // 找到匹配的medicalrecordid，设置索引
                    break; // 可以选择在找到匹配后退出循环
                }
            }
        //3.构建文件保存路径
        String staticpath =UPLOAD_DIR + File.separator + patientname + File.separator + index + File.separator +stage;

            //获取文件信息


            File uploadDirectory = new File(staticpath);
            if (!uploadDirectory.exists()) {
                uploadDirectory.mkdirs();
            }


        for (MultipartFile file : files) {
            String fileName = file.getOriginalFilename();
            String filePath = staticpath + File.separator + fileName;
            long size = file.getSize();
            String type = file.getContentType();

            //保存文件
            file.transferTo(new File(filePath));

            //保存文件信息到数据库
            FileInfo fileInfo = new FileInfo();
            fileInfo.setFileName(fileName);
            fileInfo.setUrlPath(staticpath);
            fileInfo.setFileType(type);
            fileInfo.setSize(String.valueOf(size));
            fileInfoService.addFileInfo(fileInfo);


        }
            // 上传成功的情况
            response.put("code", 0); // 0 表示成功
            response.put("msg", "文件上传成功");
        } catch (IOException e) {
            // 上传失败的情况
            response.put("code", 1); // 非0 表示失败
            response.put("msg", "文件上传失败");
        }
        return response;
    }

    @GetMapping("/download")
    public void download(@RequestParam("id") int id, HttpServletResponse response) throws IOException {
        // 文件信息
        FileInfo fileInfo = fileInfoService.getById(id);

        // 获取项目根路径
        String realpath = fileInfo.getUrlPath();
        // 获得文件输入流
        FileInputStream inputStream = new FileInputStream(new File(realpath, fileInfo.getFileName()));
        // 设置文件下载方式：附件下载
        response.setHeader("content-disposition", "attachment;fileName=" + URLEncoder.encode(fileInfo.getFileName(), "UTF-8"));
        // 获取响应输出流
        ServletOutputStream outputStream = response.getOutputStream();
        // 下载文件
        IOUtils.copy(inputStream, outputStream);
        IOUtils.closeQuietly(inputStream);
        IOUtils.closeQuietly(outputStream);
    }

    /**
     * 查询文件列表
     */
    @RequestMapping(value = "/queryFiles")
    @ResponseBody
    public Object queryfiles(@RequestParam("medicalrecordid") int medicalrecordid,
                             @RequestParam("stage") String stage) {
        try {
            //1.确定患者姓名patientname
            Patient patient = patientService.queryPatientById(medicalRecordService.queryMedicalRecordById(medicalrecordid).getPatientid());
            String patientname = patient.getPatientname();
            //2.确定患者第几次就诊index
            List<MedicalRecord> medicalRecordList = medicalRecordService.queryMedicalRecordByPatientid(patient.getId());
            int index = -1; // 初始化索引为-1，表示未找到

            for (int i = 0; i < medicalRecordList.size(); i++) {
                MedicalRecord medicalRecord = medicalRecordList.get(i);
                if (medicalRecord.getId().equals(medicalrecordid)) {
                    index = i+1; // 找到匹配的medicalrecordid，设置索引
                    break; // 可以选择在找到匹配后退出循环
                }
            }
            //3.构建文件保存路径
            String staticpath =UPLOAD_DIR + File.separator + patientname + File.separator + index + File.separator +stage;

            List<FileInfo> list = fileInfoService.queryFiles(staticpath);

            return ResultMapUtil.getHashMapListResult(list);
        } catch (Exception e) {
            return ResultMapUtil.getHashMapException(e);
        }
    }

    @GetMapping("/delete")
    @ResponseBody
    public Object delete(@RequestParam("id") int id) throws FileNotFoundException {
        try {
            // 文件信息
            FileInfo fileInfo = fileInfoService.getById(id);
            // 获取项目根路径
            String realpath = fileInfo.getUrlPath();
            File file = new File(realpath, fileInfo.getFileName());
            file.delete();
            int i = fileInfoService.delFilebyId(id);
            // 返回一个成功的响应
            return getHashMapDel(i);
        }catch (Exception e){
            return ResultMapUtil.getHashMapException(e);
        }
    }

    /**
     * 根据medicalrecordid和就诊阶段stage查找对应的文件类型为image的文件并返回给前端
     */
    @RequestMapping(value = "/queryImages")
    @ResponseBody
    public Object queryImages(@RequestParam("medicalrecordid") int medicalrecordid,
                             @RequestParam("stage") String stage){
        try {
            //1.确定患者姓名patientname
            Patient patient = patientService.queryPatientById(medicalRecordService.queryMedicalRecordById(medicalrecordid).getPatientid());
            String patientname = patient.getPatientname();
            //2.确定患者第几次就诊index
            List<MedicalRecord> medicalRecordList = medicalRecordService.queryMedicalRecordByPatientid(patient.getId());
            int index = -1; // 初始化索引为-1，表示未找到

            for (int i = 0; i < medicalRecordList.size(); i++) {
                MedicalRecord medicalRecord = medicalRecordList.get(i);
                if (medicalRecord.getId().equals(medicalrecordid)) {
                    index = i+1; // 找到匹配的medicalrecordid，设置索引
                    break; // 可以选择在找到匹配后退出循环
                }
            }
            //3.构建文件保存路径
            String staticpath =UPLOAD_DIR + File.separator + patientname + File.separator + index + File.separator +stage;

            //查询对应文件路径的文件
            List<FileInfo> list = fileInfoService.queryFiles(staticpath);

            //查询文件类型为jpg或png的文件
            List<FileInfo> imageList = new ArrayList<>();

            for (FileInfo fileInfo : list) {
                String fileName = fileInfo.getFileName();
                // 检查文件名是否以.jpg或.png结尾（不区分大小写）
                if (fileName.toLowerCase().endsWith(".jpg") || fileName.toLowerCase().endsWith(".png")) {
                    imageList.add(fileInfo);
                }
            }
            // 现在，imageList中包含了所有后缀为.jpg或.png的FileInfo对象
            return ResultMapUtil.getHashMapListResult(imageList);
        } catch (Exception e) {
            return ResultMapUtil.getHashMapException(e);
        }

        }


}
