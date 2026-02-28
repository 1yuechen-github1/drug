package com.example.drug.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * 戴牙实体
 */

@Data
@TableName(value = "crown")
public class Crown {

    /*主键*/
   // @TableField(value = "id")
    @TableId(value = "id",type = IdType.AUTO)
    private  Integer id;

    @TableField(value = "crown_record")
    private String crownRecord;

    @TableField(value = "crown_date")
    private String crownDate;

    @TableField(value = "crown_abutment_number")
    private Integer crownAbutmentNumber;

    @TableField(value = "crown_abutment_type")
    private String crownAbutmentType;

    @TableField(value = "crown_abutment_diameter")
    private Integer crownAbutmentDiameter;

    @TableField(value = "crown_abutment_height")
    private Integer crownAbutmentHeight;

    @TableField(value = "crown_abutment_connection")
    private String crownAbutmentConnection;

    @TableField(value = "crown_type")
    private String crownType;

    @TableField(value = "crown_passive_positioning")
    private String crownPassivePositioning;

    @TableField(value = "crown_occlusal_adjustment")
    private String crownOcclusalAdjustment;

    @TableField(value = "crown_remarks")
    private String crownRemarks;

    @TableField(value = "crown_cbct")
    private String crownCbct;

    @TableField(value = "medicalrecordid")
    private Integer medicalrecordid;

    @TableField(value = "crown_apical_xray")
    private String crownApicalXray;

    @TableField(value = "crown_panoramic_xray")
    private String crownPanoramicXray;

    @TableField(value = "crown_clinical_photo")
    private String crownClinicalPhoto;

    @TableField(value = "crown_medical_record")
    private String crownMedicalRecord;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCrownRecord() {
        return crownRecord;
    }

    public void setCrownRecord(String crownRecord) {
        this.crownRecord = crownRecord;
    }

    public String getCrownDate() {
        return crownDate;
    }

    public void setCrownDate(String crownDate) {
        this.crownDate = crownDate;
    }

    public Integer getCrownAbutmentNumber() {
        return crownAbutmentNumber;
    }

    public void setCrownAbutmentNumber(Integer crownAbutmentNumber) {
        this.crownAbutmentNumber = crownAbutmentNumber;
    }

    public String getCrownAbutmentType() {
        return crownAbutmentType;
    }

    public void setCrownAbutmentType(String crownAbutmentType) {
        this.crownAbutmentType = crownAbutmentType;
    }

    public Integer getCrownAbutmentDiameter() {
        return crownAbutmentDiameter;
    }

    public void setCrownAbutmentDiameter(Integer crownAbutmentDiameter) {
        this.crownAbutmentDiameter = crownAbutmentDiameter;
    }

    public Integer getCrownAbutmentHeight() {
        return crownAbutmentHeight;
    }

    public void setCrownAbutmentHeight(Integer crownAbutmentHeight) {
        this.crownAbutmentHeight = crownAbutmentHeight;
    }

    public String getCrownAbutmentConnection() {
        return crownAbutmentConnection;
    }

    public void setCrownAbutmentConnection(String crownAbutmentConnection) {
        this.crownAbutmentConnection = crownAbutmentConnection;
    }

    public String getCrownType() {
        return crownType;
    }

    public void setCrownType(String crownType) {
        this.crownType = crownType;
    }

    public String getCrownPassivePositioning() {
        return crownPassivePositioning;
    }

    public void setCrownPassivePositioning(String crownPassivePositioning) {
        this.crownPassivePositioning = crownPassivePositioning;
    }

    public String getCrownOcclusalAdjustment() {
        return crownOcclusalAdjustment;
    }

    public void setCrownOcclusalAdjustment(String crownOcclusalAdjustment) {
        this.crownOcclusalAdjustment = crownOcclusalAdjustment;
    }

    public String getCrownRemarks() {
        return crownRemarks;
    }

    public void setCrownRemarks(String crownRemarks) {
        this.crownRemarks = crownRemarks;
    }

    public String getCrownCbct() {
        return crownCbct;
    }

    public void setCrownCbct(String crownCbct) {
        this.crownCbct = crownCbct;
    }

    public Integer getMedicalrecordid() {
        return medicalrecordid;
    }

    public void setMedicalrecordid(Integer medicalrecordid) {
        this.medicalrecordid = medicalrecordid;
    }

    public String getCrownApicalXray() {
        return crownApicalXray;
    }

    public void setCrownApicalXray(String crownApicalXray) {
        this.crownApicalXray = crownApicalXray;
    }

    public String getCrownPanoramicXray() {
        return crownPanoramicXray;
    }

    public void setCrownPanoramicXray(String crownPanoramicXray) {
        this.crownPanoramicXray = crownPanoramicXray;
    }

    public String getCrownClinicalPhoto() {
        return crownClinicalPhoto;
    }

    public void setCrownClinicalPhoto(String crownClinicalPhoto) {
        this.crownClinicalPhoto = crownClinicalPhoto;
    }

    public String getCrownMedicalRecord() {
        return crownMedicalRecord;
    }

    public void setCrownMedicalRecord(String crownMedicalRecord) {
        this.crownMedicalRecord = crownMedicalRecord;
    }
}
