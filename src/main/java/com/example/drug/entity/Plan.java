package com.example.drug.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;
import java.io.Serializable;
import java.util.List;

/**
 * 谈方案
 */
@Data
@TableName(value = "plan")
public class Plan implements Serializable {
    /*主键*/
   // @TableField(value = "id")
    @TableId(value = "id", type = IdType.AUTO)
    private  Integer id;

    @TableField(value = "plan_record")
    private String planRecord;

    @TableField(value = "plan_date")
    private String planDate;

    @TableField(value = "plan_whether")
    private String planWhether;

    @TableField(value = "plan_consent")
    private String planConsent;

    @TableField(value = "plan_attitude")
    private String planAttitude;

    @TableField(value = "plan_planting_simulation")
    private String planPlantingSimulation;

    @TableField(value = "plan_medical_record")
    private String planMedicalRecord;

    @TableField(value = "medicalrecordid")
    private Integer medicalrecordid;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPlanRecord() {
        return planRecord;
    }

    public void setPlanRecord(String planRecord) {
        this.planRecord = planRecord;
    }

    public String getPlanDate() {
        return planDate;
    }

    public void setPlanDate(String planDate) {
        this.planDate = planDate;
    }

    public String getPlanWhether() {
        return planWhether;
    }

    public void setPlanWhether(String planWhether) {
        this.planWhether = planWhether;
    }

    public String getPlanConsent() {
        return planConsent;
    }

    public void setPlanConsent(String planConsent) {
        this.planConsent = planConsent;
    }

    public String getPlanAttitude() {
        return planAttitude;
    }

    public void setPlanAttitude(String planAttitude) {
        this.planAttitude = planAttitude;
    }

    public String getPlanPlantingSimulation() {
        return planPlantingSimulation;
    }

    public void setPlanPlantingSimulation(String planPlantingSimulation) {
        this.planPlantingSimulation = planPlantingSimulation;
    }

    public String getPlanMedicalRecord() {
        return planMedicalRecord;
    }

    public void setPlanMedicalRecord(String planMedicalRecord) {
        this.planMedicalRecord = planMedicalRecord;
    }

    public Integer getMedicalRecordId() {
        return medicalrecordid;
    }

    public void setMedicalRecordId(Integer medicalrecordid) {
        this.medicalrecordid = medicalrecordid;
    }
}
