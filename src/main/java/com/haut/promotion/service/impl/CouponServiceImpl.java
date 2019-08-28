package com.haut.promotion.service.impl;

import com.haut.promotion.domain.Coupon;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.haut.promotion.mapper.CouponMapper;
import com.haut.promotion.service.CouponService;

import java.util.Map;

@Service
public class CouponServiceImpl implements CouponService {

    @Resource
    private CouponMapper couponMapper;

    /**
     * 第四步添加优惠券表
     *
     * @param coupon
     * @return  优惠券id
     */
    @Override
    public Integer insertCoupon(Coupon coupon) {
        couponMapper.insertSelective(coupon);
        return couponMapper.selectOne(coupon).getCouponid();
    }
}

