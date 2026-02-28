package com.example.drug.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.drug.entity.CrownMessage;
import com.example.drug.mapper.CrownMessageMapper;
import com.example.drug.service.CrownMessageService;
import org.springframework.stereotype.Service;

@Service
public class CrownMessageServiceImpl extends ServiceImpl<CrownMessageMapper, CrownMessage> implements CrownMessageService {
}