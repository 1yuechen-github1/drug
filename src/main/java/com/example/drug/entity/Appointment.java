package com.example.drug.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;


@Data
@TableName(value = "appointment")
public class Appointment {

    /*主键*/
    @TableField(value = "id")
    @TableId(value = "id",type = IdType.AUTO)
    private Integer id;

    private String patientname;
    private String appointmentdate;
    private String appointmenttime;
    private String appointmentnote;
    private String appointmentlabel;
    private String hospitalcode;
    private String sex;
    private String birthday;
    private String patientdoctor;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPatientname() {
        return patientname;
    }

    public void setPatientname(String patientname) {
        this.patientname = patientname;
    }

    public String getAppointmentdate() {
        return appointmentdate;
    }

    public void setAppointmentdate(String appointmentdate) {
        this.appointmentdate = appointmentdate;
    }

    public String getAppointmenttime() {
        return appointmenttime;
    }

    public void setAppointmenttime(String appointmenttime) {
        this.appointmenttime = appointmenttime;
    }

    public String getAppointmentnote() {
        return appointmentnote;
    }

    public void setAppointmentnote(String appointmentnote) {
        this.appointmentnote = appointmentnote;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getPatientdoctor() {
        return patientdoctor;
    }

    public void setPatientdoctor(String patientdoctor) {
        this.patientdoctor = patientdoctor;
    }

    public String getAppointmentlabel() {
        return appointmentlabel;
    }

    public void setAppointmentlabel(String appointmentlabel) {
        this.appointmentlabel = appointmentlabel;
    }

    public String getHospitalcode() {
        return hospitalcode;
    }

    public void setHospitalcode(String hospitalcode) {
        this.hospitalcode = hospitalcode;
    }
}
