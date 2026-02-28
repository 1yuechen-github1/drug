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
import java.util.Date;
import java.util.List;

/**
 * 患者基础信息
 */
@Data
@TableName(value = "patient")
public class Patient implements Serializable {
    /*主键*/
    @TableId(value = "id",type = IdType.AUTO)
    private Integer id;

    /*患者姓名*/
    private String patientname;

    /*患者身份证*/
    private String idcard;

    /*患者性别*/
    private String sex;

    /*患者出生年月*/
    private String birthday;

    /*患者医院代码*/
    private  String hospitalcode;

    /*患者职业*/
    private String profession;

    /*患者住址*/
    private String address;

    /*患者出生地*/
    private String incunabulum;

    /*负责医生*/
    private String patientdoctor;

    /*特殊标签*/
    private String patientlabel;

    /*特殊标签备注*/
    private String patientlabelnote;

    public  Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }



}
