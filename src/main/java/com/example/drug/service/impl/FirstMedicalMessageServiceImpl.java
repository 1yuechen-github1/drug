package com.example.drug.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.drug.entity.FirstMedicalMessage;
import com.example.drug.mapper.FirstMedicalMessageMapper;
import com.example.drug.service.FirstMedicalMessageService;
import org.springframework.stereotype.Service;

@Service
public class FirstMedicalMessageServiceImpl extends ServiceImpl<FirstMedicalMessageMapper, FirstMedicalMessage> implements FirstMedicalMessageService {
}