package com.example.drug.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;

@Data
@TableName(value = "ruanzuzhi")
public class Ruanzuzhi implements Serializable {

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @TableField(value = "yizhi_tooth")
    private String yizhiTooth;

    @TableField(value = "yizhi_method")
    private String yizhiMethod;

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

    public String getYizhiTooth() {
        return yizhiTooth;
    }

    public void setYizhiTooth(String yizhiTooth) {
        this.yizhiTooth = yizhiTooth;
    }

    public String getYizhiMethod() {
        return yizhiMethod;
    }

    public void setYizhiMethod(String yizhiMethod) {
        this.yizhiMethod = yizhiMethod;
    }
}