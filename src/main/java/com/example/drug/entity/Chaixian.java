package com.example.drug.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;

@Data
@TableName(value = "chaixian")
public class Chaixian implements Serializable {

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @TableField(value = "chaixian_tooth")
    private String chaixianTooth;

    @TableField(value = "chaixian_healing_condition")
    private String chaixianHealingCondition;

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

    public String getChaixianTooth() {
        return chaixianTooth;
    }

    public void setChaixianTooth(String chaixianTooth) {
        this.chaixianTooth = chaixianTooth;
    }

    public String getChaixianHealingCondition() {
        return chaixianHealingCondition;
    }

    public void setChaixianHealingCondition(String chaixianHealingCondition) {
        this.chaixianHealingCondition = chaixianHealingCondition;
    }
}