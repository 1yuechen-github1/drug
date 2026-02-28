package com.example.drug.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.example.drug.entity.Crown;
import com.example.drug.entity.Firstmedical;
import com.example.drug.entity.Impression;
import com.example.drug.entity.Phase_i;

public interface IImpressionService extends IService<Impression> {

    public int addImpression(Impression impression);

    /**
     * 根据medicalrecordid查询
     * @param medicalrecordid
     * @return
     */
    public Impression queryImpressionByMedicalrecordid(Integer medicalrecordid);

    /**
     * 根据id查询
     * @param id
     * @return
     */
    public Impression queryImpressionById(Integer id);

    /**
     * 根据id编辑
     * @param impression
     * @return
     */
    public int editImpression(Impression impression);
}
