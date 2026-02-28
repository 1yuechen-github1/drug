package com.example.drug.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.example.drug.entity.Crown;
import com.example.drug.entity.Plan;
import com.example.drug.entity.Transit;

public interface ITransitService extends IService<Transit> {

    public int addTransit(Transit transit);

    /**
     * 根据medicalrecordid查询
     *
     * @param medicalrecordid
     * @return
     */
    public Transit queryTransitByMedicalrecordid(Integer medicalrecordid);


    /**
     * 编辑戴牙
     * @param transit
     * @return
     */
    public int editTransit(Transit transit);
}
