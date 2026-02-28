package com.example.drug.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;

@Data
@TableName(value = "crown_message")
public class CrownMessage implements Serializable {

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @TableField(value = "tooth_position")
    private String toothPosition;

    @TableField(value = "abutment_number")
    private String abutmentNumber;

    @TableField(value = "abutment_type")
    private String abutmentType;

    @TableField(value = "abutment_diameter")
    private String abutmentDiameter;

    @TableField(value = "abutment_height")
    private String abutmentHeight;

    @TableField(value = "abutment_connection")
    private String abutmentConnection;

    @TableField(value = "crown_type")
    private String crownType;

    @TableField(value = "passive_positioning")
    private String passivePositioning;

    @TableField(value = "handover_record_id")
    private Integer handoverRecordId;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getToothPosition() {
        return toothPosition;
    }

    public void setToothPosition(String toothPosition) {
        this.toothPosition = toothPosition;
    }

    public String getAbutmentNumber() {
        return abutmentNumber;
    }

    public void setAbutmentNumber(String abutmentNumber) {
        this.abutmentNumber = abutmentNumber;
    }

    public String getAbutmentType() {
        return abutmentType;
    }

    public void setAbutmentType(String abutmentType) {
        this.abutmentType = abutmentType;
    }

    public String getAbutmentDiameter() {
        return abutmentDiameter;
    }

    public void setAbutmentDiameter(String abutmentDiameter) {
        this.abutmentDiameter = abutmentDiameter;
    }

    public String getAbutmentHeight() {
        return abutmentHeight;
    }

    public void setAbutmentHeight(String abutmentHeight) {
        this.abutmentHeight = abutmentHeight;
    }

    public String getAbutmentConnection() {
        return abutmentConnection;
    }

    public void setAbutmentConnection(String abutmentConnection) {
        this.abutmentConnection = abutmentConnection;
    }

    public String getCrownType() {
        return crownType;
    }

    public void setCrownType(String crownType) {
        this.crownType = crownType;
    }

    public String getPassivePositioning() {
        return passivePositioning;
    }

    public void setPassivePositioning(String passivePositioning) {
        this.passivePositioning = passivePositioning;
    }

    public Integer getHandoverRecordId() {
        return handoverRecordId;
    }

    public void setHandoverRecordId(Integer handoverRecordId) {
        this.handoverRecordId = handoverRecordId;
    }
}