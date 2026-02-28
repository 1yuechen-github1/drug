package com.example.drug.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.example.drug.entity.Crown;
import com.example.drug.entity.Firstmedical;
import com.example.drug.entity.Plan;

public interface IPlanService extends IService<Plan> {

    public int addPlan(Plan plan);

    /**
     * 根据medicalrecordid查询
     * @param medicalrecordid
     * @return
     */
    public Plan queryPlanByMedicalrecordid(Integer medicalrecordid);

    /**
     * 编辑谈方案
     * @param
     * @return
     */
    public int editPlan(Plan plan);

    /**
     * 根据id查询plan对象
     * @param id
     * @return
     */
    public Plan queryPlanById(Integer id);

}
