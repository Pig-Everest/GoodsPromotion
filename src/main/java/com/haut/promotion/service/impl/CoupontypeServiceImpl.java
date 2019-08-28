package com.haut.promotion.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.haut.promotion.mapper.CoupontypeMapper;
import com.haut.promotion.service.CoupontypeService;
@Service
public class CoupontypeServiceImpl implements CoupontypeService{

    @Resource
    private CoupontypeMapper coupontypeMapper;

}
