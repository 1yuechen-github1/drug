package com.example.drug.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.IService;
import com.example.drug.entity.Patient;

import java.util.List;

/**
 * 患者表的service接口
 */
public interface IPatientService extends IService<Patient> {



    public IPage<Patient> selectPatientPage(int pageNum,int pageSize,String patientname,String idcard,String birthday,String hospitalcode);


    /**
     * 新增患者
     * @param patient
     * @return
     */
    public int addPatient(Patient patient);

    /**
     * 修改患者
     * @param patient
     * @return
     */
    public int editPatient(Patient patient);

    /**
     * 根据主键id查询患者
     * @param id
     * @return
     */
    public Patient queryPatientById(Integer id);

    /**
     * 根据idcard查询患者
     * @param idcard
     * @return
     */
    public Patient queryPatientByIdcard(String idcard);

    /**
     * 根据主键id删除患者
     *
     * @param id
     * @return
     */
    public int delPatientById(Integer id);

    /**
     * 查询所有患者
     * @return
     */
    public List<Patient> queryPatientList();

    /**
     * 更新hospitalcode
     */
    public  void updateHospitalcodeById(int id,String hospitalcode);

    //public List<Patient> QueryByID(int id);
}
