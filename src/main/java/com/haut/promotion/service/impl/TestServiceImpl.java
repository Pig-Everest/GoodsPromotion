package com.haut.promotion.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.haut.promotion.domain.Test;
import com.haut.promotion.myproperties.MyProperties;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.haut.promotion.mapper.TestMapper;
import com.haut.promotion.service.TestService;

import java.util.List;

@Service
public class TestServiceImpl implements TestService{

    @Resource
    private TestMapper testMapper;
    @Resource
    private MyProperties myProperties;

    @Override
    public PageInfo test(int page) {
        PageHelper.startPage(page,myProperties.getPageSize());
        List<Test> list = testMapper.selectAll();
        PageInfo pageInfo = new PageInfo(list);
        return pageInfo;
    }
}
