package com.example.drug.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.drug.entity.MedicalRecord;
import com.example.drug.entity.Patient;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface MedicalRecordMapper extends BaseMapper<MedicalRecord> {

    @Select("SELECT * FROM medical_record WHERE patientid = #{patientid}")
    public List<MedicalRecord> queryMedicalRecordByPatientid(int patientid);


}
