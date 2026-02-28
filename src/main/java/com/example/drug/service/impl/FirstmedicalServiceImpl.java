package com.example.drug.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.core.toolkit.StringUtils;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.drug.entity.Firstmedical;
import com.example.drug.mapper.FirstmedicalMapper;
import com.example.drug.service.IFirstmedicalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 初诊表service实现类
 */

@Service
public class FirstmedicalServiceImpl extends ServiceImpl<FirstmedicalMapper, Firstmedical> implements IFirstmedicalService {
    @Autowired
    private FirstmedicalMapper firstmedicalMapper;

    @Override
    public int addFirstmedical(Firstmedical firstmedical) {
        return firstmedicalMapper.insert(firstmedical);
    }

    @Override
    public int editFirstmedical(Firstmedical firstmedical) {
        return firstmedicalMapper.updateById(firstmedical);
    }

    @Override
    public Firstmedical queryFirstmedicalById(Integer id) {
        return firstmedicalMapper.selectById(id);
    }

    @Override
    public Firstmedical queryFirstmedicalByMedicalrecordid(Integer medicalrecordid) {
        return firstmedicalMapper.queryFirstmedicalByMedicalrecordid(medicalrecordid);
    }

    @Override
    public int delFirstmedicalById(Integer id) {
        return 0;
    }


}
