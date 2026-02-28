package com.example.drug.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.drug.entity.Crown;
import com.example.drug.entity.Transit;
import com.example.drug.mapper.CrownMapper;
import com.example.drug.mapper.TransitMapper;
import com.example.drug.service.ICrownService;
import com.example.drug.service.ITransitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TransitImpl extends ServiceImpl<TransitMapper, Transit> implements ITransitService {
    @Autowired
    private  TransitMapper transitMapper;

    @Override
    public int addTransit(Transit transit) {
        return transitMapper.insert(transit);
    }

    @Override
    public Transit queryTransitByMedicalrecordid(Integer medicalrecordid) {
        return transitMapper.queryTransitByMedicalrecordid(medicalrecordid);
    }

    @Override
    public int editTransit(Transit transit) {
        return transitMapper.updateById(transit);
    }
}
