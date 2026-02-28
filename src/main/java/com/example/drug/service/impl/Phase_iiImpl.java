package com.example.drug.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.drug.entity.Phase_i;
import com.example.drug.entity.Phase_ii;
import com.example.drug.mapper.Phase_iMapper;
import com.example.drug.mapper.Phase_iiMapper;
import com.example.drug.service.IPhase_iService;
import com.example.drug.service.IPhase_iiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Phase_iiImpl extends ServiceImpl<Phase_iiMapper, Phase_ii> implements IPhase_iiService{
    @Autowired
    private Phase_iiMapper phase_iiMapper;

    @Override
    public int addPhase_ii(Phase_ii phase_ii) {
        return phase_iiMapper.insert(phase_ii);
    }

    @Override
    public Phase_ii queryPhase_iiByMedicalrecordid(Integer medicalrecordid) {
        return phase_iiMapper.queryPhase_iiByMedicalrecordid(medicalrecordid);
    }

    @Override
    public int editPhase_ii(Phase_ii phase_ii) {
        return phase_iiMapper.updateById(phase_ii);
    }

    @Override
    public Phase_ii queryPhase_iiById(Integer id) {
        return phase_iiMapper.selectById(id);
    }
}
