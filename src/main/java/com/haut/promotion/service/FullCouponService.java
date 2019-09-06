package com.haut.promotion.service;

public interface FullCouponService{

    /**
     * 新建新的满减券
     * @param full 满多少
     * @param reduction 减多少
     */
    void createFullCoupon(Integer full,Integer reduction);
}
