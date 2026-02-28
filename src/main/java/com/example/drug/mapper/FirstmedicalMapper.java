package com.example.drug.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.drug.entity.Firstmedical;
import com.example.drug.entity.MedicalRecord;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface FirstmedicalMapper extends BaseMapper<Firstmedical> {

    @Select("SELECT * FROM first_medical WHERE medicalrecordid = #{medicalrecordid}")
    public Firstmedical queryFirstmedicalByMedicalrecordid(Integer medicalrecordid);
}
