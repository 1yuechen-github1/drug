package com.example.drug.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.drug.entity.Admin;
import com.example.drug.entity.Appointment;
import com.example.drug.entity.FileInfo;
import com.example.drug.entity.Phase_ii;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * 文件信息表的增删改查mapper
 */
@Mapper
public interface FileInfoMapper extends BaseMapper<FileInfo> {

    @Select("SELECT * FROM fileinfo WHERE url_path = #{urlPath}")
    public List<FileInfo> queryFileInfoByurlPath(String urlPath);


}
