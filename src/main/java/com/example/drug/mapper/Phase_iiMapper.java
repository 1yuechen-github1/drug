package com.example.drug.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.drug.entity.Crown;
import com.example.drug.entity.Phase_i;
import com.example.drug.entity.Phase_ii;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface Phase_iiMapper extends BaseMapper<Phase_ii> {
    @Select("SELECT * FROM phase_ii WHERE medicalrecordid = #{medicalrecordid}")
    public Phase_ii queryPhase_iiByMedicalrecordid(int medicalrecordid);

}
