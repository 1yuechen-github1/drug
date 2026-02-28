package com.example.drug.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.drug.entity.Crown;
import com.example.drug.entity.Firstmedical;
import com.example.drug.entity.Phase_i;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface Phase_iMapper extends BaseMapper<Phase_i> {
    @Select("SELECT * FROM phase_i WHERE medicalrecordid = #{medicalrecordid}")
    public Phase_i queryPhase_iByMedicalrecordid(int medicalrecordid);
}
