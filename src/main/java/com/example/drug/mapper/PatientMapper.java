package com.example.drug.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.drug.entity.Patient;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;
//import org.apache.ibatis.session.SqlSessionFactory;

/**
 * 患者基础信息表的增删改查mapper
 */
@Mapper
public interface PatientMapper extends BaseMapper<Patient> {


   @Select("SELECT * FROM patient WHERE idcard = #{idcard}")
   public Patient queryPatientByIdcard(String idcard);

   @Update("UPDATE patient SET hospitalcode = #{hospitalcode} WHERE id = #{id}")
   public void updateHospitalcodeById(int id,String hospitalcode );

}
