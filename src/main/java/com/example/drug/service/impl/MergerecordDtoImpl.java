package com.example.drug.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.drug.dto.MedicalRecordDto;
import com.example.drug.dto.MergeRecordDto;
import com.example.drug.entity.Firstmedical;
import com.example.drug.entity.MedicalRecord;
import com.example.drug.mapper.*;
import com.example.drug.service.IMedicalrecordDtoService;
import com.example.drug.service.IMergerecordDtoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * MergeRecordDto实现类
 */




@Service
public class MergerecordDtoImpl extends ServiceImpl<MergeRecordDtoMapper, MergeRecordDto> implements IMergerecordDtoService {

    @Autowired
    MedicalRecordMapper medicalRecordMapper ;

    @Autowired
    FirstmedicalMapper firstmedicalMapper;

    @Autowired
    PlanMapper planMapper;

    @Autowired
    Phase_iMapper phase_iMapper;

    @Autowired
    Phase_iiMapper phase_iiMapper;

    @Autowired
    ImpressionMapper impressionMapper;

    @Autowired
    CrownMapper crownMapper;

    @Autowired
    TransitMapper transitMapper;

    @Autowired
    SubsquentMapper subsquentMapper;

    @Autowired
    MergeRecordDtoMapper mergeRecordDtoMapper;

    @Autowired
    PatientMapper patientMapper;


    @Override
    public boolean save(MergeRecordDto entity) {
        return super.save(entity);
    }

    @Override
    public MergeRecordDto mergrecordDtobyMedicalrecord(MedicalRecord medicalRecord) {
        MergeRecordDto mergeRecordDto = new MergeRecordDto();
        mergeRecordDto.setFirstmedicalrecord(firstmedicalMapper.selectById(medicalRecord.getFirstmedicalid()).getFirstRecord());
        mergeRecordDto.setPlanrecord(planMapper.selectById(medicalRecord.getPlanid()).getPlanRecord());
        mergeRecordDto.setPhaseirecord(phase_iMapper.selectById(medicalRecord.getPhaseIid()).getiRecord());
        mergeRecordDto.setPhaseiirecord(phase_iiMapper.selectById(medicalRecord.getPhaseIIid()).getIiRecord());
        mergeRecordDto.setImpressionrecord(impressionMapper.selectById(medicalRecord.getImpressionid()).getImpressionRecord());
        mergeRecordDto.setCrownrecord(crownMapper.selectById(medicalRecord.getCrownid()).getCrownRecord());
        mergeRecordDto.setTransitrecord(transitMapper.selectById(medicalRecord.getTransitid()).getTransitRecord());
        mergeRecordDto.setSubsequentrecord(subsquentMapper.selectById(medicalRecord.getSubsequentid()).getSubsequentRecord());
        mergeRecordDto.setPatientname(medicalRecord.getPatientname());
        mergeRecordDto.setPatientdoctor(patientMapper.selectById(medicalRecord.getPatientid()).getPatientdoctor());
        mergeRecordDto.setSex(patientMapper.selectById(medicalRecord.getPatientid()).getSex());
        mergeRecordDto.setTelephone(patientMapper.selectById(medicalRecord.getPatientid()).getBirthday());
        return mergeRecordDto;
    }
}
