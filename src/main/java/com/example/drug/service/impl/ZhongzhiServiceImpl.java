package com.example.drug.service.impl;

import com.baomidou.mybatisplus.extension.service.IService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.drug.entity.Zhongzhi;
import com.example.drug.mapper.ZhongzhiMapper;
import com.example.drug.service.ZhongzhiService;
import org.springframework.stereotype.Service;

@Service
public class ZhongzhiServiceImpl extends ServiceImpl<ZhongzhiMapper, Zhongzhi> implements ZhongzhiService {
}
