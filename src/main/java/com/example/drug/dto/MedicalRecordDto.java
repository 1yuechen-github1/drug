package com.example.drug.dto;

import com.example.drug.entity.MedicalRecord;

public class MedicalRecordDto extends MedicalRecord {

    /*就诊时间*/
    private String visittime;

    public String getPresent() {
        return present;
    }

    private String missingtooth;

    public void setPresent(String present) {
        this.present = present;
    }

    /*目前就诊阶段*/
    public  String present;
    public String getVisittime() {
        return visittime;
    }

    public void setVisittime(String visittime) {
        this.visittime = visittime;
    }

    public String getMissingtooth() {
        return missingtooth;
    }

    public void setMissingtooth(String missingtooth) {
        this.missingtooth = missingtooth;
    }
}
