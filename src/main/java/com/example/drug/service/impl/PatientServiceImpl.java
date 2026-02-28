package com.example.drug.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.core.toolkit.StringUtils;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.drug.entity.MedicalRecord;
import com.example.drug.entity.Patient;
import com.example.drug.mapper.MedicalRecordMapper;
import com.example.drug.mapper.PatientMapper;
import com.example.drug.service.IPatientService;
import com.sun.corba.se.spi.ior.IdentifiableFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * 患者service实现类
 */

@Service
public class PatientServiceImpl extends ServiceImpl<PatientMapper, Patient> implements IPatientService {
    @Autowired
    private PatientMapper patientMapper;




    /**
     * 分页查询患者
     * @param pageNum 第几页
     * @param pageSize 每页数据条数
     * @return
     */
    @Override
    public IPage<Patient> selectPatientPage(int pageNum, int pageSize, String patientname, String idcard,String birthday,String hospitalcode) {
        QueryWrapper<Patient> queryWrapper = new QueryWrapper<>();
        if (StringUtils.isNotEmpty(patientname)) {
            queryWrapper.like("patientname", patientname);
        }
        if (StringUtils.isNotEmpty(idcard)) {
            queryWrapper.like("idcard", idcard);
        }
        if (StringUtils.isNotEmpty(birthday)) {
            queryWrapper.like("birthday", birthday);
        }
        if (StringUtils.isNotEmpty(hospitalcode)) {
            queryWrapper.like("hospitalcode", hospitalcode);
        }
        Page<Patient> page = new Page<>(pageNum, pageSize);
        return patientMapper.selectPage(page, queryWrapper);
    }




    /**
     * 新增患者
     * @param patient
     * @return
     */
    @Override
    public int addPatient(Patient patient) { return patientMapper.insert(patient);}


    /**
     * 修改患者
     * @param patient
     * @return
     */
    @Override
    public int editPatient(Patient patient) { return patientMapper.updateById(patient); }

    /**
     * 根据主键id查询患者
     * @param id
     * @return
     */
    @Override
    public Patient queryPatientById(Integer id) {
        return patientMapper.selectById(id);
    }

    @Override
    public Patient queryPatientByIdcard(String idcard) {
        return patientMapper.queryPatientByIdcard(idcard);
    }

    /**
     * 根据主键id删除患者
     * @param id
     * @return
     */
    @Override
    public int delPatientById(Integer id) {
        return patientMapper.deleteById(id);
    }

    /**
     * 查询所有患者
     * @return
     */
    @Override
    public List<Patient> queryPatientList() {
        return patientMapper.selectList(null);
    }

    @Override
    public void updateHospitalcodeById(int id, String hospitalcode) {
        patientMapper.updateHospitalcodeById(id,hospitalcode);
    }

//    @Override
//    public List<Patient> QueryByID(int id) {
//        Patient byId = iPatientService.getById(id);
//        return patientMapper.insert(byId);
//    }
}
