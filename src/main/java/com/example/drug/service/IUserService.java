package com.example.drug.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.IService;
import com.example.drug.entity.Patient;
import com.example.drug.entity.User;
/**
 * 用户表的service接口
 */
public interface IUserService extends IService<User> {
    /**
     * 根据用户名查询用户对象
     */
    public User queryUserByUsername(User user);

    public IPage<User> selectUserPage(int pageNum, int pageSize);

    /**
     * 新增患者
     * @param user
     * @return
     */
    public int addUser(User user);
}
