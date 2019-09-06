package com.haut.promotion.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.haut.promotion.mapper.CouponreleaseMapper;
import com.haut.promotion.service.CouponreleaseService;
@Service
public class CouponreleaseServiceImpl implements CouponreleaseService{

    @Resource
    private CouponreleaseMapper couponreleaseMapper;

}
