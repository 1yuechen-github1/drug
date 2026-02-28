package com.example.drug.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.example.drug.entity.Admin;
import com.example.drug.entity.User;

/**
 * 管理员表的service接口
 */
public interface IAdminService extends IService<Admin> {
    /**
     * 根据管理员名查询用户对象
     */
    public Admin queryAdminByAdminname(Admin admin);
}
