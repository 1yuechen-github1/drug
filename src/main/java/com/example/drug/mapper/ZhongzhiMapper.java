package com.example.drug.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.drug.entity.Zhongzhi;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface ZhongzhiMapper extends BaseMapper<Zhongzhi> {

    void batchInsert(@Param("list") List<Zhongzhi> zhongzhiList);
}
