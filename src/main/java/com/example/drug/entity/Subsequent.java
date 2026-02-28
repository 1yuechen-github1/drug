package com.example.drug.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;

/**
 *
 */
@Data
@TableName(value = "subsequent")
public class Subsequent implements Serializable {
    /*主键*/
    //@TableField(value = "id")
    @TableId(value = "id", type = IdType.AUTO)
    private  Integer id;

    @TableField(value = "subsequent_record")
    private String subsequentRecord;

    @TableField(value = "subsequent_date")
    private String subsequentDate;

    @TableField(value = "subsequent_symptom")
    private String subsequentSymptom;

    @TableField(value = "subsequent_occlusal")
    private String subsequentOcclusal;

    @TableField(value = "subsequent_treatment")
    private String subsequentTreatment;

    @TableField(value = "subsequent_cbct")
    private String subsequentCbct;

    @TableField(value = "subsequent_apical_xray")
    private String subsequentApicalXray;

    @TableField(value = "subsequent_panoramic_xray")
    private String subsequentPanoramicXray;

    @TableField(value = "subsequent_clinical_photo")
    private String subsequentClinicalPhoto;

    @TableField(value = "subsequent_medical_record")
    private String subsequentMedicalRecord;

    @TableField(value = "medicalrecordid")
    private Integer medicalRecordId;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getSubsequentRecord() {
        return subsequentRecord;
    }

    public void setSubsequentRecord(String subsequentRecord) {
        this.subsequentRecord = subsequentRecord;
    }

    public String getSubsequentDate() {
        return subsequentDate;
    }

    public void setSubsequentDate(String subsequentDate) {
        this.subsequentDate = subsequentDate;
    }

    public String getSubsequentSymptom() {
        return subsequentSymptom;
    }

    public void setSubsequentSymptom(String subsequentSymptom) {
        this.subsequentSymptom = subsequentSymptom;
    }

    public String getSubsequentOcclusal() {
        return subsequentOcclusal;
    }

    public void setSubsequentOcclusal(String subsequentOcclusal) {
        this.subsequentOcclusal = subsequentOcclusal;
    }

    public String getSubsequentTreatment() {
        return subsequentTreatment;
    }

    public void setSubsequentTreatment(String subsequentTreatment) {
        this.subsequentTreatment = subsequentTreatment;
    }

    public String getSubsequentCbct() {
        return subsequentCbct;
    }

    public void setSubsequentCbct(String subsequentCbct) {
        this.subsequentCbct = subsequentCbct;
    }

    public String getSubsequentApicalXray() {
        return subsequentApicalXray;
    }

    public void setSubsequentApicalXray(String subsequentApicalXray) {
        this.subsequentApicalXray = subsequentApicalXray;
    }

    public String getSubsequentPanoramicXray() {
        return subsequentPanoramicXray;
    }

    public void setSubsequentPanoramicXray(String subsequentPanoramicXray) {
        this.subsequentPanoramicXray = subsequentPanoramicXray;
    }

    public String getSubsequentClinicalPhoto() {
        return subsequentClinicalPhoto;
    }

    public void setSubsequentClinicalPhoto(String subsequentClinicalPhoto) {
        this.subsequentClinicalPhoto = subsequentClinicalPhoto;
    }

    public String getSubsequentMedicalRecord() {
        return subsequentMedicalRecord;
    }

    public void setSubsequentMedicalRecord(String subsequentMedicalRecord) {
        this.subsequentMedicalRecord = subsequentMedicalRecord;
    }

    public Integer getMedicalRecordId() {
        return medicalRecordId;
    }

    public void setMedicalRecordId(Integer medicalRecordId) {
        this.medicalRecordId = medicalRecordId;
    }
}
