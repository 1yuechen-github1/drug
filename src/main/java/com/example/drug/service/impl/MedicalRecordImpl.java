package com.example.drug.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.core.toolkit.StringUtils;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.drug.dto.MedicalRecordDto;
import com.example.drug.entity.Firstmedical;
import com.example.drug.entity.MedicalRecord;
import com.example.drug.mapper.FirstmedicalMapper;
import com.example.drug.mapper.MedicalRecordMapper;
import com.example.drug.mapper.PatientMapper;
import com.example.drug.service.IMedicalRecordService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MedicalRecordImpl extends ServiceImpl<MedicalRecordMapper, MedicalRecord> implements IMedicalRecordService {

    @Autowired
    private MedicalRecordMapper medicalRecordMapper;

    @Autowired
    private FirstmedicalMapper firstmedicalMapper;

    @Autowired
    private PatientMapper patientMapper;



    @Override
    public IPage<MedicalRecord> selectMedicalRecordPage(int pageNum, int pageSize, String patientid) {
        QueryWrapper<MedicalRecord> queryWrapper=new QueryWrapper<>();
        if (StringUtils.isNotEmpty(patientid)) {
            queryWrapper.eq("patientid", patientid);

        }

        Page<MedicalRecord> page = new Page<>(pageNum, pageSize);
        //medicalRecordMapper.selectPage(page, queryWrapper);
        return medicalRecordMapper.selectPage(page, queryWrapper);
    }

    @Override
    public int addMedicalRecord( MedicalRecord medicalRecord) {return medicalRecordMapper.insert(medicalRecord);}

/*    @Override
    public MedicalRecordDto queryMedicalRecordByPatientid(int patientid) {
       MedicalRecord medicalRecord=medicalRecordMapper.queryMedicalRecordByPatientid(patientid);
       int medicalRecordid=medicalRecord.getId();
       String patientName=medicalRecord.getPatientname();

        Firstmedical firstmedical=firstmedicalMapper.queryFirstmedicalByMedicalrecordid(medicalRecordid);
        String firstDate = firstmedical.getFirstDate();

        MedicalRecordDto medicalRecordDto=new MedicalRecordDto();

        medicalRecordDto.setVisittime(firstDate);
        medicalRecordDto.setPatientid(patientid);
        medicalRecordDto.setPatientname(patientName);
        return medicalRecordDto;
    }*/

    @Override
    public List<MedicalRecord> queryMedicalRecordByPatientid(int patientid) {
        return medicalRecordMapper.queryMedicalRecordByPatientid(patientid);
    }

    @Override
    public int editMedicelRecord(MedicalRecord medicalRecord) {
        return medicalRecordMapper.updateById(medicalRecord);
    }

    @Override
    public MedicalRecord queryMedicalRecordById(Integer id) {
        return medicalRecordMapper.selectById(id);
    }


}
