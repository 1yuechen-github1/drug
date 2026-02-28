package com.example.drug.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;

@Data
@TableName(value = "chongxi")
public class Chongxi implements Serializable {

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @TableField(value = "chongxi_tooth")
    private String chongxiTooth;

    @TableField(value = "chongxi_healing_condition")
    private String chongxiHealingCondition;

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

    public String getChongxiTooth() {
        return chongxiTooth;
    }

    public void setChongxiTooth(String chongxiTooth) {
        this.chongxiTooth = chongxiTooth;
    }

    public String getChongxiHealingCondition() {
        return chongxiHealingCondition;
    }

    public void setChongxiHealingCondition(String chongxiHealingCondition) {
        this.chongxiHealingCondition = chongxiHealingCondition;
    }
}