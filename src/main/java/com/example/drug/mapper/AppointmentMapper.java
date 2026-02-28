package com.example.drug.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.drug.entity.Appointment;
import com.example.drug.entity.Patient;
import com.example.drug.entity.Plan;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

@Mapper
public interface AppointmentMapper extends BaseMapper<Appointment> {
    @Select("SELECT * FROM appointment WHERE appointmentdate = #{appointmentdate}")
    public List<Appointment> queryAppointmentListByAppointmentdate(String appointmentdate);

    @Update("UPDATE appointment SET appointmentnote = #{appointmentnote} WHERE id = #{id}")
    public void updateAppointmentById(int id,String appointmentnote);


}
