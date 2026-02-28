package com.example.drug.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.drug.dto.MedicalRecordDto;
import com.example.drug.dto.MergeRecordDto;
import org.apache.ibatis.annotations.Mapper;

/**
 * MergeRecordDto的增删改查mapper
 */
@Mapper
public interface MergeRecordDtoMapper extends BaseMapper<MergeRecordDto> {
}
