package com.example.drug.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.drug.dto.MedicalRecordDto;
import com.example.drug.entity.*;
import com.example.drug.entity.Firstmedical;
import com.example.drug.mapper.*;
import com.example.drug.service.IMedicalrecordDtoService;
import com.example.drug.service.IPlanService;
import com.example.drug.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

/**
 * MedicalRecordDto实现类
 */




@Service
public class MedicalrecordDtoImpl extends ServiceImpl<MedicalRecordDtoMapper, MedicalRecordDto> implements IMedicalrecordDtoService {

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




    @Override
    public List<MedicalRecordDto> selectMedicalRecordDtoPage(int patientId) {
        List<MedicalRecord> medicalRecordList = medicalRecordMapper.queryMedicalRecordByPatientid(patientId);
        int size = medicalRecordList.size();
        System.out.println("size: " + size); // 打印size的值
        List<MedicalRecordDto> dtoList = new ArrayList<>(size);

        String[] tableNames = {"firstmedical", "plan", "phase_i", "phase_ii", "impression", "transit", "crown", "subsequent"};





        for (MedicalRecord medicalRecord : medicalRecordList) {

            // 创建一个新的MedicalRecordDto对象并添加到dtoList中
            MedicalRecordDto dto = new MedicalRecordDto();

            for (String tableName : tableNames) {
                Integer id = null;
                String date = null;
                switch (tableName) {
                    case "firstmedical":
                        id = medicalRecord.getFirstmedicalid();
                        date = firstmedicalMapper.selectById(id).getFirstDate();
                        if(date!=null && !isOnlySpaces(date)){
                            dto.setPresent("初诊");
                        }
                        break;
                    case "plan":
                        id = medicalRecord.getPlanid();
                        date = planMapper.selectById(id).getPlanDate();
                        if(date!=null&& !isOnlySpaces(date)){
                            dto.setPresent("谈方案");
                        }
                        break;
                    case "phase_i":
                        id = medicalRecord.getPhaseIid();
                        date = phase_iMapper.selectById(id).getiDate();
                        if(date!=null&& !isOnlySpaces(date)){
                            dto.setPresent("一期");
                        }
                        break;
                    case "phase_ii":
                        id = medicalRecord.getPhaseIIid();
                        date = phase_iiMapper.selectById(id).getIiDate();
                        if(date!=null&& !isOnlySpaces(date)){
                            dto.setPresent("二期");
                        }
                        break;
                    case "impression":
                        id = medicalRecord.getImpressionid();
                        date = impressionMapper.selectById(id).getImpressionDate();
                        if(date!=null&& !isOnlySpaces(date)){
                            dto.setPresent("取模");
                        }
                        break;
                    case "transit":
                        id = medicalRecord.getTransitid();
                        date = transitMapper.selectById(id).getTransitDate();
                        if(date!=null&& !isOnlySpaces(date)){
                            dto.setPresent("过渡义齿");
                        }
                        break;
                    case "crown":
                        id = medicalRecord.getCrownid();
                        date = crownMapper.selectById(id).getCrownDate();
                        if(date!=null&& !isOnlySpaces(date)){
                            dto.setPresent("戴牙");
                        }
                        break;
                    case "subsequent":
                        id = medicalRecord.getSubsequentid();
                        date = subsquentMapper.selectById(id).getSubsequentDate();
                        if(date!=null&& !isOnlySpaces(date)){
                            dto.setPresent("戴牙后复诊");
                        }
                        break;
                }

            }
            if(dto.getPresent()==null)
                dto.setPresent("无");

            int firstMedicalId = medicalRecord.getFirstmedicalid();

            String patientname = medicalRecord.getPatientname();

            int medicalrecordid = medicalRecord.getId();

            Firstmedical firstmedical = firstmedicalMapper.selectById(firstMedicalId);

            String firstDate = firstmedical.getFirstDate();
            String missingtooth = firstmedical.getPatientMissingTooth();
            if (firstDate==null||isOnlySpaces(firstDate))
                firstDate="无";

            if (missingtooth==null||isOnlySpaces(missingtooth))
                missingtooth="未输入";

            dto.setId(medicalrecordid);
            dto.setPatientid(medicalRecord.getPatientid());
            dto.setCrownid(medicalRecord.getCrownid());
            dto.setFirstmedicalid(medicalRecord.getFirstmedicalid());
            dto.setImpressionid(medicalRecord.getImpressionid());
            dto.setPhaseIid(medicalRecord.getPhaseIid());
            dto.setPhaseIIid(medicalRecord.getPhaseIIid());
            dto.setPlanid(medicalRecord.getPlanid());
            dto.setSubsequentid(medicalRecord.getSubsequentid());
            dto.setTransitid(medicalRecord.getTransitid());
            dto.setPatientname(patientname);
            dto.setVisittime(firstDate);
            dto.setMissingtooth(missingtooth);

            dtoList.add(dto); // 将dto添加到dtoList中
        }


        return dtoList;
    }

    public static boolean isOnlySpaces(String date) {
        return date != null && date.trim().isEmpty();
    }
}
