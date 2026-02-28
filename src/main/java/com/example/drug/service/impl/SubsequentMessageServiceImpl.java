package com.example.drug.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.drug.entity.SubsequentMessage;
import com.example.drug.mapper.SubsequentMessageMapper;
import com.example.drug.service.SubsequentMessageService;
import org.springframework.stereotype.Service;

@Service
public class SubsequentMessageServiceImpl extends ServiceImpl<SubsequentMessageMapper, SubsequentMessage> implements SubsequentMessageService {
}