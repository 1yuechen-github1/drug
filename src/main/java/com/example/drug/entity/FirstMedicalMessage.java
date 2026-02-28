package com.example.drug.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;

@Data
@TableName(value = "first_medical_message")
public class FirstMedicalMessage implements Serializable {

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @TableField(value = "patient_disease")
    private String patientDisease;

    @TableField(value = "patient_missing_tooth_position")
    private String patientMissingToothPosition;

    @TableField(value = "handover_record_id")
    private Integer handoverRecordId;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPatientDisease() {
        return patientDisease;
    }

    public void setPatientDisease(String patientDisease) {
        this.patientDisease = patientDisease;
    }

    public String getPatientMissingToothPosition() {
        return patientMissingToothPosition;
    }

    public void setPatientMissingToothPosition(String patientMissingToothPosition) {
        this.patientMissingToothPosition = patientMissingToothPosition;
    }

    public Integer getHandoverRecordId() {
        return handoverRecordId;
    }

    public void setHandoverRecordId(Integer handoverRecordId) {
        this.handoverRecordId = handoverRecordId;
    }
}