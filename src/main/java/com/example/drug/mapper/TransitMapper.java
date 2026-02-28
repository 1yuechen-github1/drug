package com.example.drug.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.drug.entity.Crown;
import com.example.drug.entity.Firstmedical;
import com.example.drug.entity.Transit;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface TransitMapper extends BaseMapper<Transit> {

    @Select("SELECT * FROM transit WHERE medicalrecordid = #{medicalrecordid}")
    public Transit queryTransitByMedicalrecordid(int medicalrecordid);
}
