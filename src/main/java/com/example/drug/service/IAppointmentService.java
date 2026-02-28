package com.example.drug.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.IService;
import com.example.drug.entity.Appointment;
import com.example.drug.entity.Patient;
import com.example.drug.entity.Plan;
import com.example.drug.mapper.AppointmentMapper;

import java.util.List;

public interface IAppointmentService extends IService<Appointment> {

    public IPage<Appointment> selectPatientAppointmentPage(int pageNum, int pageSize, String appointmentdate);

    public int addAppointment(Appointment appointment);

    public List<Appointment> selectPatientAppointmentList(String appointmentdate);

    public void editAppointment(int id,String appointmentnote);

}
