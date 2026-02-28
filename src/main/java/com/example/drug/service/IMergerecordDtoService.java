package com.example.drug.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.example.drug.dto.MedicalRecordDto;
import com.example.drug.dto.MergeRecordDto;
import com.example.drug.entity.MedicalRecord;

import java.util.List;

/**
 * MergerecordDto的service接口
 */
public interface IMergerecordDtoService extends IService<MergeRecordDto> {



     MergeRecordDto mergrecordDtobyMedicalrecord(MedicalRecord medicalRecord);

}
