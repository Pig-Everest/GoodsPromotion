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

    /**
     * 通过促销表id查询优惠券表
     * @param map 带有promotionId的map
     * @return map
     */
    Map<String,Object> selectCouponByPromotionId(Map<String,Object> map);
}

