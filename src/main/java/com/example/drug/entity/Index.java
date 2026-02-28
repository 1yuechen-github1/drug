package com.example.drug.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * 软硬组织库实体
 */

@Data
@TableName(value = "patientindex")
public class Index {

    /*主键*/
   // @TableField(value = "id")
    @TableId(value = "id", type = IdType.AUTO)
    private  Integer id;


    private String model_position;
    private String model_remarks;
    private String scaning;
    private String scaning_remarks;
    private String cbct;
    private String cbct_remarks;
    private String fitting;
    private String fitting_remarks;
    private String tooth_axis_angle;
    private String bone_axis_angle;
    private String crossing_angle;
    private String crest;
    private String cej;
    private String crest_cej;
    private String cej2_bl;
    private String cej2_b;
    private String cej2_l;
    private String cej2_tooth;
    private String cej4_bl;
    private String cej4_b;
    private String cej4_l;
    private String cej4_tooth;
    private String cej6_bl;
    private String cej6_b;
    private String cej6_l;
    private String cej6_tooth;
    private String apical;
    private String apical_labial;
    private String apical_palatal;
    private String apical2;
    private String apical2_labial;
    private String apical2_palatal;
    private String apical2_tooth;
    private String apical4;
    private String apical4_labial;
    private String apical4_palatal;
    private String apical4_tooth;
    private String bc_bb;
    private String ba_bb;
    private String tc_bb;
    private String ta_bb;
    private String apical_2mm;
    private String apical_2mmb;
    private String apical_2mmp;
    private String undercuth;
    private String undercutd;
    private String s_cej_1;
    private String s_cej;
    private String s_cej1;
    private String s_cej2;
    private String s_cej4;
    private String s_cej6;
    private String s_crest;
    private String crest_margin;
    private Integer patientid;

    public  Integer getId() {
        return id;
    }

    public  void setId(Integer id) {
        this.id = id;
    }

    public String getModel_position() {
        return model_position;
    }

    public void setModel_position(String model_position) {
        this.model_position = model_position;
    }

    public String getModel_remarks() {
        return model_remarks;
    }

    public void setModel_remarks(String model_remarks) {
        this.model_remarks = model_remarks;
    }

    public String getScaning() {
        return scaning;
    }

    public void setScaning(String scaning) {
        this.scaning = scaning;
    }

    public String getScaning_remarks() {
        return scaning_remarks;
    }

    public void setScaning_remarks(String scaning_remarks) {
        this.scaning_remarks = scaning_remarks;
    }

    public String getCbct() {
        return cbct;
    }

    public void setCbct(String cbct) {
        this.cbct = cbct;
    }

    public String getCbct_remarks() {
        return cbct_remarks;
    }

    public void setCbct_remarks(String cbct_remarks) {
        this.cbct_remarks = cbct_remarks;
    }

    public String getFitting() {
        return fitting;
    }

    public void setFitting(String fitting) {
        this.fitting = fitting;
    }

    public String getFitting_remarks() {
        return fitting_remarks;
    }

    public void setFitting_remarks(String fitting_remarks) {
        this.fitting_remarks = fitting_remarks;
    }

    public String getTooth_axis_angle() {
        return tooth_axis_angle;
    }

    public void setTooth_axis_angle(String tooth_axis_angle) {
        this.tooth_axis_angle = tooth_axis_angle;
    }

    public String getBone_axis_angle() {
        return bone_axis_angle;
    }

    public void setBone_axis_angle(String bone_axis_angle) {
        this.bone_axis_angle = bone_axis_angle;
    }

    public String getCrossing_angle() {
        return crossing_angle;
    }

    public void setCrossing_angle(String crossing_angle) {
        this.crossing_angle = crossing_angle;
    }

    public String getCrest() {
        return crest;
    }

    public void setCrest(String crest) {
        this.crest = crest;
    }

    public String getCej() {
        return cej;
    }

    public void setCej(String cej) {
        this.cej = cej;
    }

    public String getCrest_cej() {
        return crest_cej;
    }

    public void setCrest_cej(String crest_cej) {
        this.crest_cej = crest_cej;
    }

    public String getCej2_bl() {
        return cej2_bl;
    }

    public void setCej2_bl(String cej2_bl) {
        this.cej2_bl = cej2_bl;
    }

    public String getCej2_b() {
        return cej2_b;
    }

    public void setCej2_b(String cej2_b) {
        this.cej2_b = cej2_b;
    }

    public String getCej2_l() {
        return cej2_l;
    }

    public void setCej2_l(String cej2_l) {
        this.cej2_l = cej2_l;
    }

    public String getCej2_tooth() {
        return cej2_tooth;
    }

    public void setCej2_tooth(String cej2_tooth) {
        this.cej2_tooth = cej2_tooth;
    }

    public String getCej4_bl() {
        return cej4_bl;
    }

    public void setCej4_bl(String cej4_bl) {
        this.cej4_bl = cej4_bl;
    }

    public String getCej4_b() {
        return cej4_b;
    }

    public void setCej4_b(String cej4_b) {
        this.cej4_b = cej4_b;
    }

    public String getCej4_l() {
        return cej4_l;
    }

    public void setCej4_l(String cej4_l) {
        this.cej4_l = cej4_l;
    }

    public String getCej4_tooth() {
        return cej4_tooth;
    }

    public void setCej4_tooth(String cej4_tooth) {
        this.cej4_tooth = cej4_tooth;
    }

    public String getCej6_bl() {
        return cej6_bl;
    }

    public void setCej6_bl(String cej6_bl) {
        this.cej6_bl = cej6_bl;
    }

    public String getCej6_b() {
        return cej6_b;
    }

    public void setCej6_b(String cej6_b) {
        this.cej6_b = cej6_b;
    }

    public String getCej6_l() {
        return cej6_l;
    }

    public void setCej6_l(String cej6_l) {
        this.cej6_l = cej6_l;
    }

    public String getCej6_tooth() {
        return cej6_tooth;
    }

    public void setCej6_tooth(String cej6_tooth) {
        this.cej6_tooth = cej6_tooth;
    }

    public String getApical() {
        return apical;
    }

    public void setApical(String apical) {
        this.apical = apical;
    }

    public String getApical_labial() {
        return apical_labial;
    }

    public void setApical_labial(String apical_labial) {
        this.apical_labial = apical_labial;
    }

    public String getApical_palatal() {
        return apical_palatal;
    }

    public void setApical_palatal(String apical_palatal) {
        this.apical_palatal = apical_palatal;
    }

    public String getApical2() {
        return apical2;
    }

    public void setApical2(String apical2) {
        this.apical2 = apical2;
    }

    public String getApical2_labial() {
        return apical2_labial;
    }

    public void setApical2_labial(String apical2_labial) {
        this.apical2_labial = apical2_labial;
    }

    public String getApical2_palatal() {
        return apical2_palatal;
    }

    public void setApical2_palatal(String apical2_palatal) {
        this.apical2_palatal = apical2_palatal;
    }

    public String getApical2_tooth() {
        return apical2_tooth;
    }

    public void setApical2_tooth(String apical2_tooth) {
        this.apical2_tooth = apical2_tooth;
    }

    public String getApical4() {
        return apical4;
    }

    public void setApical4(String apical4) {
        this.apical4 = apical4;
    }

    public String getApical4_labial() {
        return apical4_labial;
    }

    public void setApical4_labial(String apical4_labial) {
        this.apical4_labial = apical4_labial;
    }

    public String getApical4_palatal() {
        return apical4_palatal;
    }

    public void setApical4_palatal(String apical4_palatal) {
        this.apical4_palatal = apical4_palatal;
    }

    public String getApical4_tooth() {
        return apical4_tooth;
    }

    public void setApical4_tooth(String apical4_tooth) {
        this.apical4_tooth = apical4_tooth;
    }

    public String getBc_bb() {
        return bc_bb;
    }

    public void setBc_bb(String bc_bb) {
        this.bc_bb = bc_bb;
    }

    public String getBa_bb() {
        return ba_bb;
    }

    public void setBa_bb(String ba_bb) {
        this.ba_bb = ba_bb;
    }

    public String getTc_bb() {
        return tc_bb;
    }

    public void setTc_bb(String tc_bb) {
        this.tc_bb = tc_bb;
    }

    public String getTa_bb() {
        return ta_bb;
    }

    public void setTa_bb(String ta_bb) {
        this.ta_bb = ta_bb;
    }

    public String getApical_2mm() {
        return apical_2mm;
    }

    public void setApical_2mm(String apical_2mm) {
        this.apical_2mm = apical_2mm;
    }

    public String getApical_2mmb() {
        return apical_2mmb;
    }

    public void setApical_2mmb(String apical_2mmb) {
        this.apical_2mmb = apical_2mmb;
    }

    public String getApical_2mmp() {
        return apical_2mmp;
    }

    public void setApical_2mmp(String apical_2mmp) {
        this.apical_2mmp = apical_2mmp;
    }

    public String getUndercuth() {
        return undercuth;
    }

    public void setUndercuth(String undercuth) {
        this.undercuth = undercuth;
    }

    public String getUndercutd() {
        return undercutd;
    }

    public void setUndercutd(String undercutd) {
        this.undercutd = undercutd;
    }

    public String getS_cej_1() {
        return s_cej_1;
    }

    public void setS_cej_1(String s_cej_1) {
        this.s_cej_1 = s_cej_1;
    }

    public String getS_cej() {
        return s_cej;
    }

    public void setS_cej(String s_cej) {
        this.s_cej = s_cej;
    }

    public String getS_cej1() {
        return s_cej1;
    }

    public void setS_cej1(String s_cej1) {
        this.s_cej1 = s_cej1;
    }

    public String getS_cej2() {
        return s_cej2;
    }

    public void setS_cej2(String s_cej2) {
        this.s_cej2 = s_cej2;
    }

    public String getS_cej4() {
        return s_cej4;
    }

    public void setS_cej4(String s_cej4) {
        this.s_cej4 = s_cej4;
    }

    public String getS_cej6() {
        return s_cej6;
    }

    public void setS_cej6(String s_cej6) {
        this.s_cej6 = s_cej6;
    }

    public String getS_crest() {
        return s_crest;
    }

    public void setS_crest(String s_crest) {
        this.s_crest = s_crest;
    }

    public String getCrest_margin() {
        return crest_margin;
    }

    public void setCrest_margin(String crest_margin) {
        this.crest_margin = crest_margin;
    }

    public Integer getPatientid() {
        return patientid;
    }

    public void setPatientid(Integer patientid) {
        this.patientid = patientid;
    }
}
