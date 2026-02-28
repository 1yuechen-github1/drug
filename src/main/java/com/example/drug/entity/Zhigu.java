package com.example.drug.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;

@Data
@TableName(value = "zhigu")
public class Zhigu implements Serializable {

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @TableField(value = "zhigu_tooth")
    private String zhiguTooth;

    @TableField(value = "zhigu_bone_type")
    private String zhiguBoneType;

    @TableField(value = "grafting_method")
    private String graftingMethod;

    @TableField(value = "grafting_weight")
    private String graftingWeight;

    @TableField(value = "grafting_material")
    private String graftingMaterial;

    @TableField(value = "barrier_membrane")
    private String barrierMembrane;

    @TableField(value = "membrane_length")
    private String membraneLength;

    @TableField(value = "membrane_width")
    private String membraneWidth;

    @TableField(value = "membrane_system")
    private String membraneSystem;

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

    public String getZhiguTooth() {
        return zhiguTooth;
    }

    public void setZhiguTooth(String zhiguTooth) {
        this.zhiguTooth = zhiguTooth;
    }

    public String getZhiguBoneType() {
        return zhiguBoneType;
    }

    public void setZhiguBoneType(String zhiguBoneType) {
        this.zhiguBoneType = zhiguBoneType;
    }

    public String getGraftingMethod() {
        return graftingMethod;
    }

    public void setGraftingMethod(String graftingMethod) {
        this.graftingMethod = graftingMethod;
    }

    public String getGraftingWeight() {
        return graftingWeight;
    }

    public void setGraftingWeight(String graftingWeight) {
        this.graftingWeight = graftingWeight;
    }

    public String getGraftingMaterial() {
        return graftingMaterial;
    }

    public void setGraftingMaterial(String graftingMaterial) {
        this.graftingMaterial = graftingMaterial;
    }

    public String getBarrierMembrane() {
        return barrierMembrane;
    }

    public void setBarrierMembrane(String barrierMembrane) {
        this.barrierMembrane = barrierMembrane;
    }

    public String getMembraneLength() {
        return membraneLength;
    }

    public void setMembraneLength(String membraneLength) {
        this.membraneLength = membraneLength;
    }

    public String getMembraneWidth() {
        return membraneWidth;
    }

    public void setMembraneWidth(String membraneWidth) {
        this.membraneWidth = membraneWidth;
    }

    public String getMembraneSystem() {
        return membraneSystem;
    }

    public void setMembraneSystem(String membraneSystem) {
        this.membraneSystem = membraneSystem;
    }
}