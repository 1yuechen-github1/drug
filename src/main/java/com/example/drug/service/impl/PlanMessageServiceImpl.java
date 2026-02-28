package com.example.drug.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.drug.entity.PlanMessage;
import com.example.drug.mapper.PlanMessageMapper;
import com.example.drug.service.PlanMessageService;
import org.springframework.stereotype.Service;

@Service
public class PlanMessageServiceImpl extends ServiceImpl<PlanMessageMapper, PlanMessage> implements PlanMessageService {
}