package com.example.drug.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.example.drug.entity.Plan;
import com.example.drug.entity.Subsequent;
import com.example.drug.entity.Transit;

public interface ISubsquentService extends IService<Subsequent> {

    public int addSubsquent(Subsequent subsequent);
    /**
     * 根据medicalrecordid查询
     *
     * @param medicalrecordid
     * @return
     */
    public Subsequent querySubsequentByMedicalrecordid(Integer medicalrecordid);

    /**
     * 编辑谈方案
     * @param
     * @return
     */
    public int editSubsequent(Subsequent subsequent);
}
