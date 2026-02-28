package com.example.drug.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.drug.entity.Crown;
import com.example.drug.entity.MedicalRecord;
import com.example.drug.mapper.CrownMapper;
import com.example.drug.mapper.MedicalRecordMapper;
import com.example.drug.service.ICrownService;
import com.example.drug.service.IMedicalRecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CrownImpl extends ServiceImpl<CrownMapper, Crown> implements ICrownService {

    @Autowired
    private CrownMapper crownMapper;


    @Override
    public int addCrown(Crown crown) {
        return crownMapper.insert(crown);
    }

    @Override
    public Crown queryCrownByMedicalrecordid(Integer medicalrecordid) {
        return crownMapper.queryCrownByMedicalrecordid(medicalrecordid);
    }

    @Override
    public int editCrown(Crown crown) {
        return crownMapper.updateById(crown);
    }
}
