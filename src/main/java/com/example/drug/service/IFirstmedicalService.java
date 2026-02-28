package com.example.drug.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.example.drug.entity.Firstmedical;
import com.example.drug.entity.Patient;
import org.springframework.transaction.annotation.Transactional;

/**
 * 初诊表的service接口
 */
public interface IFirstmedicalService extends IService<Firstmedical> {
    /**
     * 新增初诊记录
     * @param firstmedical
     * @return
     */
    public int addFirstmedical(Firstmedical firstmedical);

    /**
     * 修
     * @param firstmedical
     * @return
     */
    public int editFirstmedical(Firstmedical firstmedical);

    /**
     * 根据主键id查询
     * @param id
     * @return
     */
    public Firstmedical queryFirstmedicalById(Integer id);

    /**
     * 根据medicalrecordid查询
     * @param medicalrecordid
     * @return
     */
    public Firstmedical queryFirstmedicalByMedicalrecordid(Integer medicalrecordid);

    /**
     * 根据主键id删除
     *
     * @param id
     * @return
     */
    public int delFirstmedicalById(Integer id);




}
