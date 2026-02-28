package com.example.drug.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.example.drug.entity.Crown;
import com.example.drug.entity.Index;
import com.example.drug.entity.Phase_i;

public interface IIndexService extends IService<Index> {

    public int addIndex(Index index);

    /**
     * 根据medicalrecordid查询
     * @param patientid
     * @return
     */
    public Index queryIndexByPatientid(Integer patientid);
}
