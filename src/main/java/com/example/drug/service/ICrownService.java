package com.example.drug.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.example.drug.entity.Crown;
import com.example.drug.entity.Firstmedical;
import com.example.drug.entity.MedicalRecord;

public interface ICrownService extends IService<Crown> {

    public int addCrown(Crown crown);
    /**
     * 根据medicalrecordid查询
     * @param medicalrecordid
     * @return
     */
    public Crown queryCrownByMedicalrecordid(Integer medicalrecordid);

    /**
     * 编辑戴牙
     * @param crown
     * @return
     */
    public int editCrown(Crown crown);

}
