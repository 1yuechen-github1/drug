package com.example.drug.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.drug.entity.Plan;
import com.example.drug.entity.Subsequent;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface SubsquentMapper extends BaseMapper<Subsequent> {
    @Select("SELECT * FROM subsequent WHERE medicalrecordid = #{medicalrecordid}")
    public Subsequent querySubsequentByMedicalrecordid(int medicalrecordid);
}
