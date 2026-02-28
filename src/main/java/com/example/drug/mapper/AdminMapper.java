package com.example.drug.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.drug.entity.Admin;
import com.example.drug.entity.User;
import org.apache.ibatis.annotations.Mapper;

/**
 * 管理员表的增删改查mapper
 */
@Mapper
public interface AdminMapper extends BaseMapper<Admin> {
}
