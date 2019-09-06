package com.haut.promotion.service.impl;

import com.haut.promotion.domain.CashCoupon;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.haut.promotion.mapper.CashCouponMapper;
import com.haut.promotion.service.CashCouponService;
@Service
public class CashCouponServiceImpl implements CashCouponService{

    @Resource
    private CashCouponMapper cashCouponMapper;

    /**
     * 新增现金券
     *
     * @param cost 金额
     */
    @Override
    public void createCashCoupon(Integer cost) {
        CashCoupon cashCoupon = new CashCoupon();
        cashCoupon.setCost(cost);
        cashCouponMapper.insertSelective(cashCoupon);
    }
}
