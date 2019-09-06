package com.haut.promotion.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.haut.promotion.mapper.CouponreceiveMapper;
import com.haut.promotion.service.CouponreceiveService;
@Service
public class CouponreceiveServiceImpl implements CouponreceiveService{

    @Resource
    private CouponreceiveMapper couponreceiveMapper;

}
