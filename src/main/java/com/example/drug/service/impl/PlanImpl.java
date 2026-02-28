package com.example.drug.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.drug.entity.Crown;
import com.example.drug.entity.Plan;
import com.example.drug.mapper.CrownMapper;
import com.example.drug.mapper.PlanMapper;
import com.example.drug.service.ICrownService;
import com.example.drug.service.IPlanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PlanImpl extends ServiceImpl<PlanMapper, Plan> implements IPlanService {

    @Autowired
   private  PlanMapper planMapper;

    @Override
    public int addPlan(Plan plan) {
        return planMapper.insert(plan);
    }

    @Override
    public Plan queryPlanByMedicalrecordid(Integer medicalrecordid) {
        return planMapper.queryPlanByMedicalrecordid(medicalrecordid);
    }

    @Override
    public int editPlan(Plan plan) {
        return planMapper.updateById(plan);
    }

    @Override
    public Plan queryPlanById(Integer id) {
        return planMapper.selectById(id);
    }
}
