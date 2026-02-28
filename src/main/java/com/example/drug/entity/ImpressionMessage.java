package com.example.drug.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;

@Data
@TableName(value = "impression_message")
public class ImpressionMessage implements Serializable {

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @TableField(value = "impression_method")
    private String impressionMethod;

    @TableField(value = "impression_consent")
    private String impressionConsent;

    @TableField(value = "impression_colorimetry")
    private String impressionColorimetry;

    @TableField(value = "impression_attitude")
    private String impressionAttitude;

    @TableField(value = "handover_record_id")
    private Integer handoverRecordId;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getImpressionMethod() {
        return impressionMethod;
    }

    public void setImpressionMethod(String impressionMethod) {
        this.impressionMethod = impressionMethod;
    }

    public String getImpressionConsent() {
        return impressionConsent;
    }

    public void setImpressionConsent(String impressionConsent) {
        this.impressionConsent = impressionConsent;
    }

    public String getImpressionColorimetry() {
        return impressionColorimetry;
    }

    public void setImpressionColorimetry(String impressionColorimetry) {
        this.impressionColorimetry = impressionColorimetry;
    }

    public String getImpressionAttitude() {
        return impressionAttitude;
    }

    public void setImpressionAttitude(String impressionAttitude) {
        this.impressionAttitude = impressionAttitude;
    }

    public Integer getHandoverRecordId() {
        return handoverRecordId;
    }

    public void setHandoverRecordId(Integer handoverRecordId) {
        this.handoverRecordId = handoverRecordId;
    }
}