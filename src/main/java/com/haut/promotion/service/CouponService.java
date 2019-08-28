package com.haut.promotion.service;

import com.haut.promotion.domain.*;

import java.util.Map;

public interface CouponService {
    /**
     * 第四步添加优惠券表
     *
     * @param coupon
     * @return 优惠券id
     */
    Integer insertCoupon(Coupon coupon);

}

