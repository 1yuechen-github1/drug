package com.example.drug.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.drug.entity.Crown;
import com.example.drug.entity.Phase_i;
import com.example.drug.mapper.CrownMapper;
import com.example.drug.mapper.Phase_iMapper;
import com.example.drug.service.ICrownService;
import com.example.drug.service.IPhase_iService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Phase_iImpl extends ServiceImpl<Phase_iMapper, Phase_i> implements IPhase_iService {
    @Autowired
    private Phase_iMapper phase_iMapper;

    @Override
    public int addPhase_i(Phase_i phase_i) {
        return phase_iMapper.insert(phase_i);
    }

    @Override
    public Phase_i queryPhase_iByMedicalrecordid(Integer medicalrecordid) {
        return phase_iMapper.queryPhase_iByMedicalrecordid(medicalrecordid);
    }

    @Override
    public Phase_i queryPhase_iById(Integer id) {
        return phase_iMapper.selectById(id);
    }

    @Override
    public int editPhase_i(Phase_i phase_i) {
        return phase_iMapper.updateById(phase_i);
    }
}
