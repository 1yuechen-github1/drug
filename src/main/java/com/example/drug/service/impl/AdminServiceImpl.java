package com.example.drug.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.drug.entity.Admin;
import com.example.drug.entity.User;
import com.example.drug.mapper.AdminMapper;
import com.example.drug.mapper.UserMapper;
import com.example.drug.service.IAdminService;
import com.example.drug.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 管理员service实现类
 */

@Service
public class AdminServiceImpl extends ServiceImpl<AdminMapper, Admin> implements IAdminService {
    @Autowired
    private AdminMapper adminMapper;

    @Override
    public Admin queryAdminByAdminname(Admin admin) {
        QueryWrapper<Admin> wrapper = new QueryWrapper<>();
        wrapper.eq("adminname",admin.getAdminname());
        return adminMapper.selectOne(wrapper);
    }
}
