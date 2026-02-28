package com.example.drug.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.drug.entity.Firstmedical;
import com.example.drug.entity.Impression;
import com.example.drug.mapper.FirstmedicalMapper;
import com.example.drug.mapper.ImpressionMapper;
import com.example.drug.service.IFirstmedicalService;
import com.example.drug.service.IImpressionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 */

@Service
public class ImpressionServiceImpl extends ServiceImpl<ImpressionMapper, Impression> implements IImpressionService {
    @Autowired
    private ImpressionMapper impressionMapper;
    @Override
    public int addImpression(Impression impression) {
        return impressionMapper.insert(impression);
    }

    @Override
    public Impression queryImpressionByMedicalrecordid(Integer medicalrecordid) {
        return impressionMapper.queryImpressionByMedicalrecordid(medicalrecordid);
    }

    @Override
    public Impression queryImpressionById(Integer id) {
        return impressionMapper.selectById(id);
    }

    @Override
    public int editImpression(Impression impression) {
        return impressionMapper.updateById(impression);
    }
}
