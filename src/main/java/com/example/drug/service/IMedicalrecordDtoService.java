package com.example.drug.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.IService;
import com.example.drug.dto.MedicalRecordDto;
import com.example.drug.entity.User;

import java.util.List;

/**
 * MedicalrecordDto的service接口
 */
public interface IMedicalrecordDtoService extends IService<MedicalRecordDto> {
    /**
     * 根据patientid查询患者记录列表
     */
    List<MedicalRecordDto> selectMedicalRecordDtoPage(int patientId);
}
