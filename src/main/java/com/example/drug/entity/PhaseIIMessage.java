package com.example.drug.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;

@Data
@TableName(value = "phase_ii_message")
public class PhaseIIMessage implements Serializable {

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @TableField(value = "tooth_position")
    private String toothPosition;

    public String getToothPosition() {
        return toothPosition;
    }

    public void setToothPosition(String toothPosition) {
        this.toothPosition = toothPosition;
    }

    @TableField(value = "gingival_condition")
    private String gingivalCondition;

    @TableField(value = "shadow")
    private String shadow;

    @TableField(value = "bone_resorption")
    private String boneResorption;

    @TableField(value = "healing_abutment_type")
    private String healingAbutmentType;

    @TableField(value = "healing_abutment_diameter")
    private String healingAbutmentDiameter;

    @TableField(value = "healing_abutment_length")
    private String healingAbutmentLength;

    @TableField(value = "handover_record_id")
    private Integer handoverRecordId;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getGingivalCondition() {
        return gingivalCondition;
    }

    public void setGingivalCondition(String gingivalCondition) {
        this.gingivalCondition = gingivalCondition;
    }

    public String getShadow() {
        return shadow;
    }

    public void setShadow(String shadow) {
        this.shadow = shadow;
    }

    public String getBoneResorption() {
        return boneResorption;
    }

    public void setBoneResorption(String boneResorption) {
        this.boneResorption = boneResorption;
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

    public Integer getHandoverRecordId() {
        return handoverRecordId;
    }

    public void setHandoverRecordId(Integer handoverRecordId) {
        this.handoverRecordId = handoverRecordId;
    }
}