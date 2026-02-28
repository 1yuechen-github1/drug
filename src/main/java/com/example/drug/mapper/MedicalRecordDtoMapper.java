package com.example.drug.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.drug.dto.MedicalRecordDto;
import com.example.drug.entity.User;
import org.apache.ibatis.annotations.Mapper;

/**
 * MedicalRecordDto的增删改查mapper
 */
@Mapper
public interface MedicalRecordDtoMapper extends BaseMapper<MedicalRecordDto> {
}
