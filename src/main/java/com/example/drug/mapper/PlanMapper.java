package com.example.drug.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.drug.entity.Crown;
import com.example.drug.entity.Firstmedical;
import com.example.drug.entity.Plan;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface PlanMapper extends BaseMapper<Plan> {
    @Select("SELECT * FROM plan WHERE medicalrecordid = #{medicalrecordid}")
    public Plan queryPlanByMedicalrecordid(int medicalrecordid);
}
