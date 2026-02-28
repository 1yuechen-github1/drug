package com.example.drug.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;


@Data
@TableName(value = "impression")
public class Impression {

    /*主键*/
    @TableField(value = "id")
    @TableId(value = "id",type = IdType.AUTO)
    private Integer id;

    @TableField(value = "impression_record")
    private String impressionRecord;

    @TableField(value = "impression_date")
    private String impressionDate;

    @TableField(value = "impression_method")
    private String impressionMethod;

    @TableField(value = "impression_multitooth")
    private String impressionMultitooth;

    @TableField(value = "impression_colorimetry")
    private String impressionColorimetry;

    @TableField(value = "impression_healingcondition")
    private String impressionHealingCondition;

    @TableField(value = "impression_oralscanning")
    private String impressionOralScanning;

    @TableField(value = "impression_cbct")
    private String impressionCBCT;

    @TableField(value = "impression_apical_xray")
    private String impressionApicalXray;

    @TableField(value = "impression_panoramic_xray")
    private String impressionPanoramicXray;

    @TableField(value = "impression_clinical_photo")
    private String impressionClinicalPhoto;

    @TableField(value = "impression_medical_record")
    private String impressionMedicalRecord;

    @TableField(value = "medicalrecordid")
    private Integer medicalRecordId;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getImpressionRecord() {
        return impressionRecord;
    }

    public void setImpressionRecord(String impressionRecord) {
        this.impressionRecord = impressionRecord;
    }

    public String getImpressionDate() {
        return impressionDate;
    }

    public void setImpressionDate(String impressionDate) {
        this.impressionDate = impressionDate;
    }

    public String getImpressionMethod() {
        return impressionMethod;
    }

    public void setImpressionMethod(String impressionMethod) {
        this.impressionMethod = impressionMethod;
    }

    public String getImpressionMultitooth() {
        return impressionMultitooth;
    }

    public void setImpressionMultitooth(String impressionMultitooth) {
        this.impressionMultitooth = impressionMultitooth;
    }

    public String getImpressionColorimetry() {
        return impressionColorimetry;
    }

    public void setImpressionColorimetry(String impressionColorimetry) {
        this.impressionColorimetry = impressionColorimetry;
    }

    public String getImpressionHealingCondition() {
        return impressionHealingCondition;
    }

    public void setImpressionHealingCondition(String impressionHealingCondition) {
        this.impressionHealingCondition = impressionHealingCondition;
    }

    public String getImpressionOralScanning() {
        return impressionOralScanning;
    }

    public void setImpressionOralScanning(String impressionOralScanning) {
        this.impressionOralScanning = impressionOralScanning;
    }

    public String getImpressionCBCT() {
        return impressionCBCT;
    }

    public void setImpressionCBCT(String impressionCBCT) {
        this.impressionCBCT = impressionCBCT;
    }

    public String getImpressionApicalXray() {
        return impressionApicalXray;
    }

    public void setImpressionApicalXray(String impressionApicalXray) {
        this.impressionApicalXray = impressionApicalXray;
    }

    public String getImpressionPanoramicXray() {
        return impressionPanoramicXray;
    }

    public void setImpressionPanoramicXray(String impressionPanoramicXray) {
        this.impressionPanoramicXray = impressionPanoramicXray;
    }

    public String getImpressionClinicalPhoto() {
        return impressionClinicalPhoto;
    }

    public void setImpressionClinicalPhoto(String impressionClinicalPhoto) {
        this.impressionClinicalPhoto = impressionClinicalPhoto;
    }

    public String getImpressionMedicalRecord() {
        return impressionMedicalRecord;
    }

    public void setImpressionMedicalRecord(String impressionMedicalRecord) {
        this.impressionMedicalRecord = impressionMedicalRecord;
    }

    public Integer getMedicalRecordId() {
        return medicalRecordId;
    }

    public void setMedicalRecordId(Integer medicalRecordId) {
        this.medicalRecordId = medicalRecordId;
    }
}
