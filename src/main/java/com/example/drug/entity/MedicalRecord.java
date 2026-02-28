package com.example.drug.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.example.drug.service.IFirstmedicalService;
import lombok.Data;


@Data
@TableName(value = "medical_record")
public class MedicalRecord{


    /*主键*/
   // @TableField(value = "id")
    @TableId(value = "id",type = IdType.AUTO)
    private  Integer id;

    /**
     * 初诊id
     */
    private Integer firstmedicalid;

    /**
     *
     */
    private Integer impressionid;

    private Integer crownid;

    private Integer indexid;

    @TableField(value = "phase_iid")
    private Integer phaseIid;

    @TableField(value = "phase_iiid")
    private Integer phaseIIid;

    private Integer planid;

    private Integer subsequentid;

    private Integer transitid;


    private Integer patientid;

    private String patientname;

    public String getPatientname() {
        return patientname;
    }

    public void setPatientname(String patientname) {
        this.patientname = patientname;
    }

    public  Integer getId() {
        return id;
    }

    public  void setId(Integer id) {
        this.id = id;
    }

    public Integer getFirstmedicalid() {
        return firstmedicalid;
    }

    public void setFirstmedicalid(Integer firstmedicalid) {
        this.firstmedicalid = firstmedicalid;
    }

    public Integer getImpressionid() {
        return impressionid;
    }

    public void setImpressionid(Integer impressionid) {
        this.impressionid = impressionid;
    }

    public Integer getCrownid() {
        return crownid;
    }

    public void setCrownid(Integer crownid) {
        this.crownid = crownid;
    }

    public Integer getIndexid() {
        return indexid;
    }

    public void setIndexid(Integer indexid) {
        this.indexid = indexid;
    }

    public Integer getPhaseIid() {
        return phaseIid;
    }

    public void setPhaseIid(Integer phaseIid) {
        this.phaseIid = phaseIid;
    }

    public Integer getPhaseIIid() {
        return phaseIIid;
    }

    public void setPhaseIIid(Integer phaseIIid) {
        this.phaseIIid = phaseIIid;
    }

    public Integer getPlanid() {
        return planid;
    }

    public void setPlanid(Integer planid) {
        this.planid = planid;
    }

    public Integer getSubsequentid() {
        return subsequentid;
    }

    public void setSubsequentid(Integer subsequentid) {
        this.subsequentid = subsequentid;
    }

    public Integer getTransitid() {
        return transitid;
    }

    public void setTransitid(Integer transitid) {
        this.transitid = transitid;
    }


    public Integer getPatientid() {
        return patientid;
    }
    public void setPatientid(Integer patientid) {
        this.patientid = patientid;
    }

    public MedicalRecord() {
        this.firstmedicalid = null;
        this.impressionid = null;
        this.crownid = null;
        this.indexid = null;
        this.phaseIid = null;
        this.phaseIIid = null;
        this.planid = null;
        this.subsequentid = null;
        this.transitid = null;
        this.patientid = null;
        this.patientname = null;
    }



}
