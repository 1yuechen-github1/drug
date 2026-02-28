package com.example.drug.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.drug.entity.ImpressionMessage;
import com.example.drug.mapper.ImpressionMessageMapper;
import com.example.drug.service.ImpressionMessageService;
import org.springframework.stereotype.Service;

@Service
public class ImpressionMessageServiceImpl extends ServiceImpl<ImpressionMessageMapper, ImpressionMessage> implements ImpressionMessageService {
}