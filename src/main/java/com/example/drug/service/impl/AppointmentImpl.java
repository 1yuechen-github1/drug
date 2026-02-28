package com.example.drug.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.core.toolkit.StringUtils;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.drug.entity.Appointment;
import com.example.drug.entity.Patient;
import com.example.drug.entity.Plan;
import com.example.drug.mapper.AppointmentMapper;
import com.example.drug.mapper.PlanMapper;
import com.example.drug.service.IAppointmentService;
import com.example.drug.service.IPlanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AppointmentImpl extends ServiceImpl<AppointmentMapper, Appointment> implements IAppointmentService {

    @Autowired
    AppointmentMapper appointmentMapper;

    @Override
    public IPage<Appointment> selectPatientAppointmentPage(int pageNum, int pageSize, String appointmentdate) {
        QueryWrapper<Appointment> queryWrapper = new QueryWrapper<>();
        if (StringUtils.isNotEmpty(appointmentdate)) {
            queryWrapper.like("appointmentdate", appointmentdate);
        }
        Page<Appointment> page = new Page<>(pageNum, pageSize);
        return appointmentMapper.selectPage(page, queryWrapper);
    }

    @Override
    public int addAppointment(Appointment appointment) {
        return appointmentMapper.insert(appointment);
    }

    @Override
    public List<Appointment> selectPatientAppointmentList(String appointmentdate) {
        return appointmentMapper.queryAppointmentListByAppointmentdate(appointmentdate);
    }

    @Override
    public void editAppointment(int id, String appointmentnote) {
        appointmentMapper.updateAppointmentById(id, appointmentnote);
    }
}
