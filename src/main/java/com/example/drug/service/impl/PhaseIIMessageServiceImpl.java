package com.example.drug.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.drug.entity.PhaseIIMessage;
import com.example.drug.mapper.PhaseIIMessageMapper;
import com.example.drug.service.PhaseIIMessageService;
import org.springframework.stereotype.Service;

@Service
public class PhaseIIMessageServiceImpl extends ServiceImpl<PhaseIIMessageMapper, PhaseIIMessage> implements PhaseIIMessageService {
}