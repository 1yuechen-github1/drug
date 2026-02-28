package com.example.drug.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;

/**
 * 谈方案
 */
@Data
@TableName(value = "transit")
public class Transit implements Serializable {
    /*主键*/
    //@TableField(value = "id")
    @TableId(value = "id", type = IdType.AUTO)
    private  Integer id;

    @TableField(value = "transit_record")
    private String transitRecord;

    @TableField(value = "transit_date")
    private String transitDate;

    @TableField(value = "transit_abutment_number")
    private String transitAbutmentNumber;

    @TableField(value = "transit_abutment_type")
    private String transitAbutmentType;

    @TableField(value = "transit_abutment_diameter")
    private String transitAbutmentDiameter;

    @TableField(value = "transit_abutment_height")
    private String transitAbutmentHeight;

    @TableField(value = "transit_abutment_connection")
    private String transitAbutmentConnection;

    @TableField(value = "transit_passive_positioning")
    private String transitPassivePositioning;

    @TableField(value = "transit_occlusal_adjustment")
    private String transitOcclusalAdjustment;

    @TableField(value = "transit_cbct")
    private String transitCBCT;

    @TableField(value = "transit_apical_xray")
    private String transitApicalXray;

    @TableField(value = "transit_panoramic_xray")
    private String transitPanoramicXray;

    @TableField(value = "transit_clinical_photo")
    private String transitClinicalPhoto;

    @TableField(value = "transit_medical_record")
    private String transitMedicalRecord;

    @TableField(value = "medicalrecordid")
    private Integer medicalRecordId;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTransitRecord() {
        return transitRecord;
    }

    public void setTransitRecord(String transitRecord) {
        this.transitRecord = transitRecord;
    }

    public String getTransitDate() {
        return transitDate;
    }

    public void setTransitDate(String transitDate) {
        this.transitDate = transitDate;
    }

    public String getTransitAbutmentNumber() {
        return transitAbutmentNumber;
    }

    public void setTransitAbutmentNumber(String transitAbutmentNumber) {
        this.transitAbutmentNumber = transitAbutmentNumber;
    }

    public String getTransitAbutmentType() {
        return transitAbutmentType;
    }

    public void setTransitAbutmentType(String transitAbutmentType) {
        this.transitAbutmentType = transitAbutmentType;
    }

    public String getTransitAbutmentDiameter() {
        return transitAbutmentDiameter;
    }

    public void setTransitAbutmentDiameter(String transitAbutmentDiameter) {
        this.transitAbutmentDiameter = transitAbutmentDiameter;
    }

    public String getTransitAbutmentHeight() {
        return transitAbutmentHeight;
    }

    public void setTransitAbutmentHeight(String transitAbutmentHeight) {
        this.transitAbutmentHeight = transitAbutmentHeight;
    }

    public String getTransitAbutmentConnection() {
        return transitAbutmentConnection;
    }

    public void setTransitAbutmentConnection(String transitAbutmentConnection) {
        this.transitAbutmentConnection = transitAbutmentConnection;
    }

    public String getTransitPassivePositioning() {
        return transitPassivePositioning;
    }

    public void setTransitPassivePositioning(String transitPassivePositioning) {
        this.transitPassivePositioning = transitPassivePositioning;
    }

    public String getTransitOcclusalAdjustment() {
        return transitOcclusalAdjustment;
    }

    public void setTransitOcclusalAdjustment(String transitOcclusalAdjustment) {
        this.transitOcclusalAdjustment = transitOcclusalAdjustment;
    }

    public String getTransitCBCT() {
        return transitCBCT;
    }

    public void setTransitCBCT(String transitCBCT) {
        this.transitCBCT = transitCBCT;
    }

    public String getTransitApicalXray() {
        return transitApicalXray;
    }

    public void setTransitApicalXray(String transitApicalXray) {
        this.transitApicalXray = transitApicalXray;
    }

    public String getTransitPanoramicXray() {
        return transitPanoramicXray;
    }

    public void setTransitPanoramicXray(String transitPanoramicXray) {
        this.transitPanoramicXray = transitPanoramicXray;
    }

    public String getTransitClinicalPhoto() {
        return transitClinicalPhoto;
    }

    public void setTransitClinicalPhoto(String transitClinicalPhoto) {
        this.transitClinicalPhoto = transitClinicalPhoto;
    }

    public String getTransitMedicalRecord() {
        return transitMedicalRecord;
    }

    public void setTransitMedicalRecord(String transitMedicalRecord) {
        this.transitMedicalRecord = transitMedicalRecord;
    }

    public Integer getMedicalRecordId() {
        return medicalRecordId;
    }

    public void setMedicalRecordId(Integer medicalRecordId) {
        this.medicalRecordId = medicalRecordId;
    }
}
