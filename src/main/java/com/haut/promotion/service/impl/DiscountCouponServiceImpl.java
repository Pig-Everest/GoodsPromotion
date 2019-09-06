package com.haut.promotion.service.impl;

import com.haut.promotion.domain.DiscountCoupon;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.haut.promotion.mapper.DiscountCouponMapper;
import com.haut.promotion.service.DiscountCouponService;
@Service
public class DiscountCouponServiceImpl implements DiscountCouponService{

    @Resource
    private DiscountCouponMapper discountCouponMapper;

    /**
     * 新建折扣券
     *
     * @param discount
     */
    @Override
    public void createDiscountCouponService(Double discount) {
        DiscountCoupon discountCoupon = new DiscountCoupon();
        discountCoupon.setDiscount(discount);
        discountCouponMapper.insertSelective(discountCoupon);
    }
}
