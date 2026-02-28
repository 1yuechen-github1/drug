package com.example.drug.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.drug.entity.Zhigu;
import com.example.drug.mapper.ZhiguMapper;
import com.example.drug.service.ZhiguService;
import org.springframework.stereotype.Service;

@Service
public class ZhiguServiceImpl extends ServiceImpl<ZhiguMapper, Zhigu> implements ZhiguService {
}
