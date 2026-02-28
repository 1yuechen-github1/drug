package com.example.drug.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * 软硬组织库实体
 */

@Data
@TableName(value = "phase_ii")
public class Phase_ii {

    /*主键*/
   // @TableField(value = "id")
    @TableId(value = "id", type = IdType.AUTO)
    private  Integer id;


    @TableField(value = "ii_record")
    private String iiRecord;

    @TableField(value = "ii_tooth")
    private String iiTooth;

    @TableField(value = "ii_date")
    private String iiDate;

    @TableField(value = "ii_surgery")
    private String iiSurgery;

    @TableField(value = "ii_oral_hygiene")
    private String iiOralHygiene;

    @TableField(value = "ii_gingival_condition")
    private String iiGingivalCondition;

    @TableField(value = "ii_bone_resorption")
    private String iiBoneResorption;

    @TableField(value = "ii_healing_abutmenttype")
    private String iiHealingAbutmentType;

    @TableField(value = "ii_healing_abutmentdiameter")
    private String iiHealingAbutmentDiameter;

    @TableField(value = "ii_healing_abutmentlenght")
    private String iiHealingAbutmentLength;

    @TableField(value = "ii_cbct")
    private String iiCBCT;

    @TableField(value = "ii_apical_xray")
    private String iiApicalXray;

    @TableField(value = "ii_panoramic_xray")
    private String iiPanoramicXray;

    @TableField(value = "ii_clinical_photo")
    private String iiClinicalPhoto;

    @TableField(value = "ii_medical_record")
    private String iiMedicalRecord;

    @TableField(value = "ii_shadow")
    private String iiShadow;

    @TableField(value = "medicalrecordid")
    private Integer medicalRecordId;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getIiRecord() {
        return iiRecord;
    }

    public void setIiRecord(String iiRecord) {
        this.iiRecord = iiRecord;
    }

    public String getIiTooth() {
        return iiTooth;
    }

    public void setIiTooth(String iiTooth) {
        this.iiTooth = iiTooth;
    }

    public String getIiDate() {
        return iiDate;
    }

    public void setIiDate(String iiDate) {
        this.iiDate = iiDate;
    }

    public String getIiSurgery() {
        return iiSurgery;
    }

    public void setIiSurgery(String iiSurgery) {
        this.iiSurgery = iiSurgery;
    }

    public String getIiOralHygiene() {
        return iiOralHygiene;
    }

    public void setIiOralHygiene(String iiOralHygiene) {
        this.iiOralHygiene = iiOralHygiene;
    }

    public String getIiGingivalCondition() {
        return iiGingivalCondition;
    }

    public void setIiGingivalCondition(String iiGingivalCondition) {
        this.iiGingivalCondition = iiGingivalCondition;
    }

    public String getIiBoneResorption() {
        return iiBoneResorption;
    }

    public void setIiBoneResorption(String iiBoneResorption) {
        this.iiBoneResorption = iiBoneResorption;
    }

    public String getIiHealingAbutmentType() {
        return iiHealingAbutmentType;
    }

    public void setIiHealingAbutmentType(String iiHealingAbutmentType) {
        this.iiHealingAbutmentType = iiHealingAbutmentType;
    }

    public String getIiHealingAbutmentDiameter() {
        return iiHealingAbutmentDiameter;
    }

    public void setIiHealingAbutmentDiameter(String iiHealingAbutmentDiameter) {
        this.iiHealingAbutmentDiameter = iiHealingAbutmentDiameter;
    }

    public String getIiHealingAbutmentLength() {
        return iiHealingAbutmentLength;
    }

    public void setIiHealingAbutmentLength(String iiHealingAbutmentLength) {
        this.iiHealingAbutmentLength = iiHealingAbutmentLength;
    }

    public String getIiCBCT() {
        return iiCBCT;
    }

    public void setIiCBCT(String iiCBCT) {
        this.iiCBCT = iiCBCT;
    }

    public String getIiApicalXray() {
        return iiApicalXray;
    }

    public void setIiApicalXray(String iiApicalXray) {
        this.iiApicalXray = iiApicalXray;
    }

    public String getIiPanoramicXray() {
        return iiPanoramicXray;
    }

    public void setIiPanoramicXray(String iiPanoramicXray) {
        this.iiPanoramicXray = iiPanoramicXray;
    }

    public String getIiClinicalPhoto() {
        return iiClinicalPhoto;
    }

    public void setIiClinicalPhoto(String iiClinicalPhoto) {
        this.iiClinicalPhoto = iiClinicalPhoto;
    }

    public String getIiMedicalRecord() {
        return iiMedicalRecord;
    }

    public void setIiMedicalRecord(String iiMedicalRecord) {
        this.iiMedicalRecord = iiMedicalRecord;
    }

    public Integer getMedicalRecordId() {
        return medicalRecordId;
    }

    public void setMedicalRecordId(Integer medicalRecordId) {
        this.medicalRecordId = medicalRecordId;
    }

    public String getIi_Shadow() {
        return iiShadow;
    }

    public void setIi_Shadow(String iiShadow) {
        this.iiShadow = iiShadow;
    }
}