package com.example.drug.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.IService;
import com.example.drug.dto.MedicalRecordDto;
import com.example.drug.entity.MedicalRecord;
import com.example.drug.entity.Patient;

import java.util.List;

public interface IMedicalRecordService extends IService<MedicalRecord> {

    public IPage<MedicalRecord> selectMedicalRecordPage(int pageNum, int pageSize, String patientid);

    public int addMedicalRecord(MedicalRecord medicalRecord);

    public List<MedicalRecord> queryMedicalRecordByPatientid(int patientid);

    /**
     * 修改就诊记录
     * @param medicalRecord
     * @return
     */
    public int editMedicelRecord(MedicalRecord medicalRecord);

    /**
     * 根据主键id查询患者就诊记录
     * @param id
     * @return
     */
    public MedicalRecord queryMedicalRecordById(Integer id);




}
