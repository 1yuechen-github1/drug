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
@TableName(value = "phase_i")
public class Phase_i {

    /*主键*/
    //@TableField(value = "id")
    @TableId(value = "id", type = IdType.AUTO)
    private  Integer id;


    @TableField(value = "i_record")
    private String iRecord;

    @TableField(value = "i_tooth")
    private String iTooth;

    @TableField(value = "i_date")
    private String iDate;

    @TableField(value = "i_bone_type")
    private String iBoneType;

    @TableField(value = "i_gingiva_thickness")
    private String iGingivaThickness;

    @TableField(value = "i_implant_system")
    private String iImplantSystem;

    @TableField(value = "i_implant_type")
    private String iImplantType;

    @TableField(value = "i_implant_diameter")
    private String iImplantDiameter;

    @TableField(value = "i_implant_lenght")
    private String iImplantLength;

    @TableField(value = "i_implantation_torque")
    private String iImplantationTorque;

    @TableField(value = "i_healing_mode")
    private String iHealingMode;

    @TableField(value = "i_healing_abutmenttype")
    private String iHealingAbutmentType;

    @TableField(value = "i_healing_abutmentdiameter")
    private String iHealingAbutmentDiameter;

    @TableField(value = "i_healing_abutmentlenght")
    private String iHealingAbutmentLength;

    @TableField(value = "i_bone_grafting")
    private String iBoneGrafting;

    @TableField(value = "i_grafting_method")
    private String iGraftingMethod;

    @TableField(value = "i_grafting_weight")
    private String iGraftingWeight;

    @TableField(value = "i_grafting_material")
    private String iGraftingMaterial;

    @TableField(value = "i_barrier_membrane")
    private String iBarrierMembrane;

    @TableField(value = "i_membrane_lenght")
    private String iMembraneLength;

    @TableField(value = "i_membrane_widht")
    private String iMembraneWidth;

    @TableField(value = "i_membrane_system")
    private String iMembraneSystem;

    @TableField(value = "i_immediate_restoration")
    private String iImmediateRestoration;

    @TableField(value = "i_guide_plate")
    private String iGuidePlate;

    @TableField(value = "i_guide_platecompany")
    private String iGuidePlateCompany;

    @TableField(value = "i_guide_plateprintingdate")
    private String iGuidePlatePrintingDate;

    @TableField(value = "i_guide_plateusingdate")
    private String iGuidePlateUsingDate;

    @TableField(value = "i_guide_plateposition")
    private String iGuidePlatePosition;

    @TableField(value = "i_guide_plateprotocol")
    private String iGuidePlateProtocol;

    @TableField(value = "i_guide_platecbct")
    private String iGuidePlateCBCT;

    @TableField(value = "i_guide_platetype")
    private String iGuidePlateType;

    @TableField(value = "i_guide_plateusingtype")
    private String iGuidePlateUsingType;

    @TableField(value = "i_guide_platebarehanded")
    private String iGuidePlateBareHanded;

    @TableField(value = "i_special")
    private String iSpecial;

    @TableField(value = "i_healing_condition")
    private String iHealingCondition;

    @TableField(value = "i_cbct")
    private String iCBCT;

    @TableField(value = "i_apical_xray")
    private String iApicalXray;

    @TableField(value = "i_panoramic_xray")
    private String iPanoramicXray;

    @TableField(value = "i_surgical_video")
    private String iSurgicalVideo;

    @TableField(value = "i_clinical_photo")
    private String iClinicalPhoto;

    @TableField(value = "i_medical_record")
    private String iMedicalRecord;

    @TableField(value = "medicalrecordid")
    private Integer medicalRecordId;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getiRecord() {
        return iRecord;
    }

    public void setiRecord(String iRecord) {
        this.iRecord = iRecord;
    }

    public String getiTooth() {
        return iTooth;
    }

    public void setiTooth(String iTooth) {
        this.iTooth = iTooth;
    }

    public String getiDate() {
        return iDate;
    }

    public void setiDate(String iDate) {
        this.iDate = iDate;
    }

    public String getiBoneType() {
        return iBoneType;
    }

    public void setiBoneType(String iBoneType) {
        this.iBoneType = iBoneType;
    }

    public String getiGingivaThickness() {
        return iGingivaThickness;
    }

    public void setiGingivaThickness(String iGingivaThickness) {
        this.iGingivaThickness = iGingivaThickness;
    }

    public String getiImplantSystem() {
        return iImplantSystem;
    }

    public void setiImplantSystem(String iImplantSystem) {
        this.iImplantSystem = iImplantSystem;
    }

    public String getiImplantType() {
        return iImplantType;
    }

    public void setiImplantType(String iImplantType) {
        this.iImplantType = iImplantType;
    }

    public String getiImplantDiameter() {
        return iImplantDiameter;
    }

    public void setiImplantDiameter(String iImplantDiameter) {
        this.iImplantDiameter = iImplantDiameter;
    }

    public String getiImplantLength() {
        return iImplantLength;
    }

    public void setiImplantLength(String iImplantLength) {
        this.iImplantLength = iImplantLength;
    }

    public String getiImplantationTorque() {
        return iImplantationTorque;
    }

    public void setiImplantationTorque(String iImplantationTorque) {
        this.iImplantationTorque = iImplantationTorque;
    }

    public String getiHealingMode() {
        return iHealingMode;
    }

    public void setiHealingMode(String iHealingMode) {
        this.iHealingMode = iHealingMode;
    }

    public String getiHealingAbutmentType() {
        return iHealingAbutmentType;
    }

    public void setiHealingAbutmentType(String iHealingAbutmentType) {
        this.iHealingAbutmentType = iHealingAbutmentType;
    }

    public String getiHealingAbutmentDiameter() {
        return iHealingAbutmentDiameter;
    }

    public void setiHealingAbutmentDiameter(String iHealingAbutmentDiameter) {
        this.iHealingAbutmentDiameter = iHealingAbutmentDiameter;
    }

    public String getiHealingAbutmentLength() {
        return iHealingAbutmentLength;
    }

    public void setiHealingAbutmentLength(String iHealingAbutmentLength) {
        this.iHealingAbutmentLength = iHealingAbutmentLength;
    }

    public String getiBoneGrafting() {
        return iBoneGrafting;
    }

    public void setiBoneGrafting(String iBoneGrafting) {
        this.iBoneGrafting = iBoneGrafting;
    }

    public String getiGraftingMethod() {
        return iGraftingMethod;
    }

    public void setiGraftingMethod(String iGraftingMethod) {
        this.iGraftingMethod = iGraftingMethod;
    }

    public String getiGraftingWeight() {
        return iGraftingWeight;
    }

    public void setiGraftingWeight(String iGraftingWeight) {
        this.iGraftingWeight = iGraftingWeight;
    }

    public String getiGraftingMaterial() {
        return iGraftingMaterial;
    }

    public void setiGraftingMaterial(String iGraftingMaterial) {
        this.iGraftingMaterial = iGraftingMaterial;
    }

    public String getiBarrierMembrane() {
        return iBarrierMembrane;
    }

    public void setiBarrierMembrane(String iBarrierMembrane) {
        this.iBarrierMembrane = iBarrierMembrane;
    }

    public String getiMembraneLength() {
        return iMembraneLength;
    }

    public void setiMembraneLength(String iMembraneLength) {
        this.iMembraneLength = iMembraneLength;
    }

    public String getiMembraneWidth() {
        return iMembraneWidth;
    }

    public void setiMembraneWidth(String iMembraneWidth) {
        this.iMembraneWidth = iMembraneWidth;
    }

    public String getiMembraneSystem() {
        return iMembraneSystem;
    }

    public void setiMembraneSystem(String iMembraneSystem) {
        this.iMembraneSystem = iMembraneSystem;
    }

    public String getiImmediateRestoration() {
        return iImmediateRestoration;
    }

    public void setiImmediateRestoration(String iImmediateRestoration) {
        this.iImmediateRestoration = iImmediateRestoration;
    }

    public String getiGuidePlate() {
        return iGuidePlate;
    }

    public void setiGuidePlate(String iGuidePlate) {
        this.iGuidePlate = iGuidePlate;
    }

    public String getiGuidePlateCompany() {
        return iGuidePlateCompany;
    }

    public void setiGuidePlateCompany(String iGuidePlateCompany) {
        this.iGuidePlateCompany = iGuidePlateCompany;
    }

    public String getiGuidePlatePrintingDate() {
        return iGuidePlatePrintingDate;
    }

    public void setiGuidePlatePrintingDate(String iGuidePlatePrintingDate) {
        this.iGuidePlatePrintingDate = iGuidePlatePrintingDate;
    }

    public String getiGuidePlateUsingDate() {
        return iGuidePlateUsingDate;
    }

    public void setiGuidePlateUsingDate(String iGuidePlateUsingDate) {
        this.iGuidePlateUsingDate = iGuidePlateUsingDate;
    }

    public String getiGuidePlatePosition() {
        return iGuidePlatePosition;
    }

    public void setiGuidePlatePosition(String iGuidePlatePosition) {
        this.iGuidePlatePosition = iGuidePlatePosition;
    }

    public String getiGuidePlateProtocol() {
        return iGuidePlateProtocol;
    }

    public void setiGuidePlateProtocol(String iGuidePlateProtocol) {
        this.iGuidePlateProtocol = iGuidePlateProtocol;
    }

    public String getiGuidePlateCBCT() {
        return iGuidePlateCBCT;
    }

    public void setiGuidePlateCBCT(String iGuidePlateCBCT) {
        this.iGuidePlateCBCT = iGuidePlateCBCT;
    }

    public String getiGuidePlateType() {
        return iGuidePlateType;
    }

    public void setiGuidePlateType(String iGuidePlateType) {
        this.iGuidePlateType = iGuidePlateType;
    }

    public String getiGuidePlateUsingType() {
        return iGuidePlateUsingType;
    }

    public void setiGuidePlateUsingType(String iGuidePlateUsingType) {
        this.iGuidePlateUsingType = iGuidePlateUsingType;
    }

    public String getiGuidePlateBareHanded() {
        return iGuidePlateBareHanded;
    }

    public void setiGuidePlateBareHanded(String iGuidePlateBareHanded) {
        this.iGuidePlateBareHanded = iGuidePlateBareHanded;
    }

    public String getiSpecial() {
        return iSpecial;
    }

    public void setiSpecial(String iSpecial) {
        this.iSpecial = iSpecial;
    }

    public String getiHealingCondition() {
        return iHealingCondition;
    }

    public void setiHealingCondition(String iHealingCondition) {
        this.iHealingCondition = iHealingCondition;
    }

    public String getiCBCT() {
        return iCBCT;
    }

    public void setiCBCT(String iCBCT) {
        this.iCBCT = iCBCT;
    }

    public String getiApicalXray() {
        return iApicalXray;
    }

    public void setiApicalXray(String iApicalXray) {
        this.iApicalXray = iApicalXray;
    }

    public String getiPanoramicXray() {
        return iPanoramicXray;
    }

    public void setiPanoramicXray(String iPanoramicXray) {
        this.iPanoramicXray = iPanoramicXray;
    }

    public String getiSurgicalVideo() {
        return iSurgicalVideo;
    }

    public void setiSurgicalVideo(String iSurgicalVideo) {
        this.iSurgicalVideo = iSurgicalVideo;
    }

    public String getiClinicalPhoto() {
        return iClinicalPhoto;
    }

    public void setiClinicalPhoto(String iClinicalPhoto) {
        this.iClinicalPhoto = iClinicalPhoto;
    }

    public String getiMedicalRecord() {
        return iMedicalRecord;
    }

    public void setiMedicalRecord(String iMedicalRecord) {
        this.iMedicalRecord = iMedicalRecord;
    }

    public Integer getMedicalRecordId() {
        return medicalRecordId;
    }

    public void setMedicalRecordId(Integer medicalRecordId) {
        this.medicalRecordId = medicalRecordId;
    }
}