package com.example.drug.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.drug.entity.Admin;
import com.example.drug.entity.FileInfo;
import com.example.drug.mapper.AdminMapper;
import com.example.drug.mapper.FileInfoMapper;
import com.example.drug.service.IAdminService;
import com.example.drug.service.IFileInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


/**
 * 文件信息service实现类
 */

@Service
public class FileInfoServiceImpl extends ServiceImpl<FileInfoMapper, FileInfo> implements IFileInfoService {

    @Autowired
    FileInfoMapper fileInfoMapper;

    @Override
    public void addFileInfo(FileInfo fileInfo) {
        fileInfoMapper.insert(fileInfo);
    }

    @Override
    public List<FileInfo> queryFiles(String urlPath) {
        return fileInfoMapper.queryFileInfoByurlPath(urlPath);
    }

    @Override
    public int delFilebyId(int id) {
        return fileInfoMapper.deleteById(id);
    }
}
