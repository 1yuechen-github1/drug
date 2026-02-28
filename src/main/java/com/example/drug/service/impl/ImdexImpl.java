package com.example.drug.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.drug.entity.Crown;
import com.example.drug.entity.Index;
import com.example.drug.mapper.CrownMapper;
import com.example.drug.mapper.IndexMapper;
import com.example.drug.service.ICrownService;
import com.example.drug.service.IIndexService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ImdexImpl extends ServiceImpl<IndexMapper, Index> implements IIndexService {
    @Autowired
    private IndexMapper indexMapper;

    @Override
    public int addIndex(Index index) {
        return indexMapper.insert(index);
    }

    @Override
    public Index queryIndexByPatientid(Integer patientid) {
        return indexMapper.queryIndexByPatientid(patientid);
    }
}
