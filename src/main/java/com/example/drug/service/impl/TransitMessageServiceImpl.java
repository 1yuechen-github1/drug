package com.example.drug.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.drug.entity.TransitMessage;
import com.example.drug.mapper.TransitMessageMapper;
import com.example.drug.service.TransitMessageService;
import org.springframework.stereotype.Service;

@Service
public class TransitMessageServiceImpl extends ServiceImpl<TransitMessageMapper, TransitMessage> implements TransitMessageService {
}