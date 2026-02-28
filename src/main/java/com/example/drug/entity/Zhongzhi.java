package com.example.drug.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;

@Data
@TableName(value = "zhongzhi")
public class Zhongzhi implements Serializable {

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @TableField(value = "zhongzhi_tooth")
    private String zhongzhiTooth;

    @TableField(value = "immediate_restoration")
    private String immediateRestoration;

    @TableField(value = "bone_type")
    private String boneType;

    @TableField(value = "gingiva_thickness")
    private String gingivaThickness;

    @TableField(value = "implant_system")
    private String implantSystem;

    @TableField(value = "implant_type")
    private String implantType;

    @TableField(value = "implant_diameter")
    private String implantDiameter;

    @TableField(value = "implant_length")
    private String implantLength;

    @TableField(value = "implantation_torque")
    private String implantationTorque;

    @TableField(value = "healing_mode")
    private String healingMode;

    @TableField(value = "healing_abutment_type")
    private String healingAbutmentType;

    @TableField(value = "healing_abutment_diameter")
    private String healingAbutmentDiameter;

    @TableField(value = "healing_abutment_length")
    private String healingAbutmentLength;

    @TableField(value = "guide_plate")
    private String guidePlate;

    @TableField(value = "guide_plate_company")
    private String guidePlateCompany;

    @TableField(value = "guide_plate_printing_date")
    private String guidePlatePrintingDate;

    @TableField(value = "guide_plate_using_date")
    private String guidePlateUsingDate;

    @TableField(value = "guide_plate_position")
    private String guidePlatePosition;

    @TableField(value = "guide_plate_protocol")
    private String guidePlateProtocol;

    @TableField(value = "guide_plate_cbct")
    private String guidePlateCBCT;

    @TableField(value = "guide_plate_type")
    private String guidePlateType;

    @TableField(value = "guide_plate_using_type")
    private String guidePlateUsingType;

    @TableField(value = "guide_plate_barehanded")
    private String guidePlateBarehanded;

    @TableField(value = "guide_special")
    private String guideSpecial;

    @TableField(value = "handover_record_id")
    private Integer handoverRecordId;

    public Integer getHandoverRecordId() {
        return handoverRecordId;
    }

    public void setHandoverRecordId(Integer handoverRecordId) {
        this.handoverRecordId = handoverRecordId;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getZhongzhiTooth() {
        return zhongzhiTooth;
    }

    public void setZhongzhiTooth(String zhongzhiTooth) {
        this.zhongzhiTooth = zhongzhiTooth;
    }

    public String getImmediateRestoration() {
        return immediateRestoration;
    }

    public void setImmediateRestoration(String immediateRestoration) {
        this.immediateRestoration = immediateRestoration;
    }

    public String getBoneType() {
        return boneType;
    }

    public void setBoneType(String boneType) {
        this.boneType = boneType;
    }

    public String getGingivaThickness() {
        return gingivaThickness;
    }

    public void setGingivaThickness(String gingivaThickness) {
        this.gingivaThickness = gingivaThickness;
    }

    public String getImplantSystem() {
        return implantSystem;
    }

    public void setImplantSystem(String implantSystem) {
        this.implantSystem = implantSystem;
    }

    public String getImplantType() {
        return implantType;
    }

    public void setImplantType(String implantType) {
        this.implantType = implantType;
    }

    public String getImplantDiameter() {
        return implantDiameter;
    }

    public void setImplantDiameter(String implantDiameter) {
        this.implantDiameter = implantDiameter;
    }

    public String getImplantLength() {
        return implantLength;
    }

    public void setImplantLength(String implantLength) {
        this.implantLength = implantLength;
    }

    public String getImplantationTorque() {
        return implantationTorque;
    }

    public void setImplantationTorque(String implantationTorque) {
        this.implantationTorque = implantationTorque;
    }

    public String getHealingMode() {
        return healingMode;
    }

    public void setHealingMode(String healingMode) {
        this.healingMode = healingMode;
    }

    public String getHealingAbutmentType() {
        return healingAbutmentType;
    }

    public void setHealingAbutmentType(String healingAbutmentType) {
        this.healingAbutmentType = healingAbutmentType;
    }

    public String getHealingAbutmentDiameter() {
        return healingAbutmentDiameter;
    }

    public void setHealingAbutmentDiameter(String healingAbutmentDiameter) {
        this.healingAbutmentDiameter = healingAbutmentDiameter;
    }

    public String getHealingAbutmentLength() {
        return healingAbutmentLength;
    }

    public void setHealingAbutmentLength(String healingAbutmentLength) {
        this.healingAbutmentLength = healingAbutmentLength;
    }

    public String getGuidePlate() {
        return guidePlate;
    }

    public void setGuidePlate(String guidePlate) {
        this.guidePlate = guidePlate;
    }

    public String getGuidePlateCompany() {
        return guidePlateCompany;
    }

    public void setGuidePlateCompany(String guidePlateCompany) {
        this.guidePlateCompany = guidePlateCompany;
    }

    public String getGuidePlatePrintingDate() {
        return guidePlatePrintingDate;
    }

    public void setGuidePlatePrintingDate(String guidePlatePrintingDate) {
        this.guidePlatePrintingDate = guidePlatePrintingDate;
    }

    public String getGuidePlateUsingDate() {
        return guidePlateUsingDate;
    }

    public void setGuidePlateUsingDate(String guidePlateUsingDate) {
        this.guidePlateUsingDate = guidePlateUsingDate;
    }

    public String getGuidePlatePosition() {
        return guidePlatePosition;
    }

    public void setGuidePlatePosition(String guidePlatePosition) {
        this.guidePlatePosition = guidePlatePosition;
    }

    public String getGuidePlateProtocol() {
        return guidePlateProtocol;
    }

    public void setGuidePlateProtocol(String guidePlateProtocol) {
        this.guidePlateProtocol = guidePlateProtocol;
    }

    public String getGuidePlateCBCT() {
        return guidePlateCBCT;
    }

    public void setGuidePlateCBCT(String guidePlateCBCT) {
        this.guidePlateCBCT = guidePlateCBCT;
    }

    public String getGuidePlateType() {
        return guidePlateType;
    }

    public void setGuidePlateType(String guidePlateType) {
        this.guidePlateType = guidePlateType;
    }

    public String getGuidePlateUsingType() {
        return guidePlateUsingType;
    }

    public void setGuidePlateUsingType(String guidePlateUsingType) {
        this.guidePlateUsingType = guidePlateUsingType;
    }

    public String getGuidePlateBarehanded() {
        return guidePlateBarehanded;
    }

    public void setGuidePlateBarehanded(String guidePlateBarehanded) {
        this.guidePlateBarehanded = guidePlateBarehanded;
    }

    public String getGuideSpecial() {
        return guideSpecial;
    }

    public void setGuideSpecial(String guideSpecial) {
        this.guideSpecial = guideSpecial;
    }
}