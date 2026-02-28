package com.example.drug.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.drug.entity.Crown;
import com.example.drug.entity.Firstmedical;
import com.example.drug.entity.Impression;
import com.example.drug.entity.MedicalRecord;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface CrownMapper extends BaseMapper<Crown> {
    @Select("SELECT * FROM crown WHERE medicalrecordid = #{medicalrecordid}")
    public Crown queryCrownByMedicalrecordid(int medicalrecordid);
}

