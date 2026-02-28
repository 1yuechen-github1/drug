package com.example.drug.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.example.drug.entity.Admin;
import com.example.drug.entity.FileInfo;

import java.util.List;

/**
 * 文件信息表的service接口
 */
public interface IFileInfoService extends IService<FileInfo> {

    public void addFileInfo(FileInfo fileInfo);

    public List<FileInfo> queryFiles(String urlPath);

    public int delFilebyId(int id);

}
