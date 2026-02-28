package com.example.drug.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.example.drug.dto.HandoverRecordDto;
import com.example.drug.entity.HandoverRecord;

import java.util.List;

/**
 * 交班记录（代替原来的就医记录）
 */
public interface HandoverRecordService extends IService<HandoverRecord> {
    public List<HandoverRecord> getHandoverRecord(Integer patientId);

    public void saveHandoverRecordDto(HandoverRecordDto handoverRecordDto);

    public List<HandoverRecordDto> getHandoverRecordDto(Integer patientId, String stage);
}
