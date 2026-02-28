package com.example.drug.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.drug.entity.Crown;
import com.example.drug.entity.Firstmedical;
import com.example.drug.entity.Impression;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface ImpressionMapper extends BaseMapper<Impression> {

    @Select("SELECT * FROM impression WHERE medicalrecordid = #{medicalrecordid}")
    public Impression queryImpressionByMedicalrecordid(int medicalrecordid);
}
