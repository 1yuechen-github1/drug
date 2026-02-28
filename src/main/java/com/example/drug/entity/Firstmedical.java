package com.example.drug.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;

/**
 * 患者基础信息
 */
@Data
@TableName(value = "first_medical")
public class Firstmedical implements Serializable {
    /*主键*/
    @TableField(value = "id")
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @TableField(value = "first_record")
    private String firstRecord;

    @TableField(value = "first_date")
    private String firstDate;

    @TableField(value = "first_impression")
    private String firstImpression;

    @TableField(value = "first_cbct")
    private String firstCbct;

    @TableField(value = "first_apical_xray")
    private String firstApicalXray;

    @TableField(value = "first_panoramic_xray")
    private String firstPanoramicXray;

    @TableField(value = "patient_missing_tooth")
    private String patientMissingTooth;

    @TableField(value = "patient_oral_scanning")
    private String patientOralScanning;

    @TableField(value = "patient_maxillofacial_scanning")
    private String patientMaxillofacialScanning;

    @TableField(value = "patient_electronic_facebow")
    private String patientElectronicFacebow;

    @TableField(value = "first_medical_record")
    private String firstMedicalRecord;

    @TableField(value = "medicalrecordid")
    private Integer medicalrecordid;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFirstRecord() {
        return firstRecord;
    }

    public void setFirstRecord(String firstRecord) {
        this.firstRecord = firstRecord;
    }

    public String getFirstDate() {
        return firstDate;
    }

    public void setFirstDate(String firstDate) {
        this.firstDate = firstDate;
    }

    public String getFirstImpression() {
        return firstImpression;
    }

    public void setFirstImpression(String firstImpression) {
        this.firstImpression = firstImpression;
    }

    public String getFirstCbct() {
        return firstCbct;
    }

    public void setFirstCbct(String firstCbct) {
        this.firstCbct = firstCbct;
    }

    public String getFirstApicalXray() {
        return firstApicalXray;
    }

    public void setFirstApicalXray(String firstApicalXray) {
        this.firstApicalXray = firstApicalXray;
    }

    public String getFirstPanoramicXray() {
        return firstPanoramicXray;
    }

    public void setFirstPanoramicXray(String firstPanoramicXray) {
        this.firstPanoramicXray = firstPanoramicXray;
    }

    public String getPatientMissingTooth() {
        return patientMissingTooth;
    }

    public void setPatientMissingTooth(String patientMissingTooth) {
        this.patientMissingTooth = patientMissingTooth;
    }

    public String getPatientOralScanning() {
        return patientOralScanning;
    }

    public void setPatientOralScanning(String patientOralScanning) {
        this.patientOralScanning = patientOralScanning;
    }

    public String getPatientMaxillofacialScanning() {
        return patientMaxillofacialScanning;
    }

    public void setPatientMaxillofacialScanning(String patientMaxillofacialScanning) {
        this.patientMaxillofacialScanning = patientMaxillofacialScanning;
    }

    public String getPatientElectronicFacebow() {
        return patientElectronicFacebow;
    }

    public void setPatientElectronicFacebow(String patientElectronicFacebow) {
        this.patientElectronicFacebow = patientElectronicFacebow;
    }

    public String getFirstMedicalRecord() {
        return firstMedicalRecord;
    }

    public void setFirstMedicalRecord(String firstMedicalRecord) {
        this.firstMedicalRecord = firstMedicalRecord;
    }

    public Integer getMedicalrecordid() {
        return medicalrecordid;
    }

    public void setMedicalrecordid(Integer medicalrecordid) {
        this.medicalrecordid = medicalrecordid;
    }
}
