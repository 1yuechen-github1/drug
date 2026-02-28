package com.example.drug.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.drug.entity.Crown;
import com.example.drug.entity.Index;
import com.example.drug.entity.Phase_ii;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface IndexMapper extends BaseMapper<Index> {

    @Select("SELECT * FROM patientindex WHERE patientid = #{patientid}")
    public Index queryIndexByPatientid(int patientid);

}
