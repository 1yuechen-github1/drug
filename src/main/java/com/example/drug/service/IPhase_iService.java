package com.example.drug.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.example.drug.entity.Crown;
import com.example.drug.entity.Firstmedical;
import com.example.drug.entity.Phase_i;

public interface IPhase_iService extends IService<Phase_i> {

    public int addPhase_i(Phase_i phase_i);

    /**
     * 根据medicalrecordid查询
     * @param medicalrecordid
     * @return
     */
    public Phase_i queryPhase_iByMedicalrecordid(Integer medicalrecordid);

    /**
     * 根据id查询
     * @param id
     * @return
     */
    public Phase_i queryPhase_iById(Integer id);

    /**
     * 根据id编辑
     * @param phase_i
     * @return
     */
    public int editPhase_i(Phase_i phase_i);



}
