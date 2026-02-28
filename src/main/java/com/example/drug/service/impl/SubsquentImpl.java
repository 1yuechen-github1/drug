package com.example.drug.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.drug.entity.Subsequent;
import com.example.drug.mapper.SubsquentMapper;
import com.example.drug.service.ISubsquentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SubsquentImpl extends ServiceImpl<SubsquentMapper, Subsequent> implements ISubsquentService {
    @Autowired
    private  SubsquentMapper subsquentMapper;

    @Override
    public int addSubsquent(Subsequent subsequent) {
        return subsquentMapper.insert(subsequent);
    }

    @Override
    public Subsequent querySubsequentByMedicalrecordid(Integer medicalrecordid) {
        return subsquentMapper.querySubsequentByMedicalrecordid(medicalrecordid);
    }

    @Override
    public int editSubsequent(Subsequent subsequent) {
        return subsquentMapper.updateById(subsequent);
    }
}
