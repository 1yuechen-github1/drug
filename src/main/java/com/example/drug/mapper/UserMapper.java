package com.example.drug.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.drug.entity.User;
import org.apache.ibatis.annotations.Mapper;

/**
 * 用户表的增删改查mapper
 */
@Mapper
public interface UserMapper extends BaseMapper<User> {
}
