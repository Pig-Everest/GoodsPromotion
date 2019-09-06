package com.haut.promotion.service.impl;

import com.haut.promotion.domain.FullCoupon;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.haut.promotion.mapper.FullCouponMapper;
import com.haut.promotion.service.FullCouponService;
@Service
public class FullCouponServiceImpl implements FullCouponService{

    @Resource
    private FullCouponMapper fullCouponMapper;

    /**
     * 新建新的满减券
     *
     * @param full     满多少
     * @param reduction 减多少
     */
    @Override
    public void createFullCoupon(Integer full, Integer reduction) {
        FullCoupon fullCoupon = new FullCoupon();
        fullCoupon.setFull(full);
        fullCoupon.setReduction(reduction);
        fullCouponMapper.insertSelective(fullCoupon);
    }
}
