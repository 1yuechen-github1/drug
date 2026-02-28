package com.example.drug.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;

@Data
@TableName(value = "plan_message")
public class PlanMessage implements Serializable {

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @TableField(value = "plan_whether")
    private String planWhether;

    @TableField(value = "plan_consent")
    private String planConsent;

    @TableField(value = "plan_attitude")
    private String planAttitude;

    @TableField(value = "handover_record_id")
    private Integer handoverRecordId;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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

    public Integer getHandoverRecordId() {
        return handoverRecordId;
    }

    public void setHandoverRecordId(Integer handoverRecordId) {
        this.handoverRecordId = handoverRecordId;
    }
}