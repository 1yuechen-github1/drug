package com.example.drug.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.example.drug.entity.Crown;
import com.example.drug.entity.Phase_i;
import com.example.drug.entity.Phase_ii;

public interface IPhase_iiService extends IService<Phase_ii> {

    public int addPhase_ii(Phase_ii phase_ii);

    /**
     * 根据medicalrecordid查询
     * @param medicalrecordid
     * @return
     */
    public Phase_ii queryPhase_iiByMedicalrecordid(Integer medicalrecordid);

    /**
     * 编辑戴牙
     * @param phase_ii
     * @return
     */
    public int  editPhase_ii(Phase_ii phase_ii);

    /**
     * 根据id查询
     * @param id
     * @return
     */
    public Phase_ii queryPhase_iiById(Integer id);

}
