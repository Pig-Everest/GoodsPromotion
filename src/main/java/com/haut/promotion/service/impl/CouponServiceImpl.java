package com.haut.promotion.service.impl;

import com.haut.promotion.domain.Coupon;
import com.haut.promotion.domain.Coupontype;
import com.haut.promotion.domain.Timemanager;
import com.haut.promotion.mapper.CoupontypeMapper;
import com.haut.promotion.mapper.TimemanagerMapper;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.haut.promotion.mapper.CouponMapper;
import com.haut.promotion.service.CouponService;
import tk.mybatis.mapper.entity.Example;
import tk.mybatis.mapper.entity.Example.Criteria;

import java.util.List;
import java.util.Map;

@Service
public class CouponServiceImpl implements CouponService {

    @Resource
    private CouponMapper couponMapper;
    @Resource
    private CoupontypeMapper coupontypeMapper;
    @Resource
    private TimemanagerMapper timemanagerMapper;

    /**
     * 第四步添加优惠券表
     *
     * @param coupon
     * @return 优惠券id
     */
    @Override
    public Integer insertCoupon(Coupon coupon) {
        couponMapper.insertSelective(coupon);
        return coupon.getCouponid();
    }

   /* *//**
     * 通过促销表id查询优惠券表
     *
     * @param map 带有promotionId的map
     * @return map
     *//*
    @Override
    public Map<String, Object> selectCouponByPromotionId(Map<String, Object> map) {
        Coupon coupon = new Coupon();
        coupon.setPromotionid((int) map.get("id"));
        coupon = couponMapper.selectOne(coupon);
        Coupontype coupontype = coupontypeMapper.selectByPrimaryKey(coupon.getCoupontype());
        Timemanager timemanager = new Timemanager();
        timemanager.setGetcouponid(coupon.getCouponid());
        timemanager = timemanagerMapper.selectOne(timemanager);
        map.put("couponName", coupon.getCouponname());
        map.put("days", coupon.getDays());
        map.put("number", coupon.getDays());
        map.put("isOpen", coupon.getIsopen());
        map.put("limitedNumber", coupon.getLimitednumber());
        map.put("value", coupon.getValue());
        map.put("full", coupon.getFull());
        map.put("redution", coupon.getRedution());
        map.put("discount", coupon.getDiscount());
        map.put("coupontype", coupon.getCoupontype());
        map.put("typename", coupontype.getTypename());
        map.put("starttime", timemanager.getStarttime());
        map.put("endtime", timemanager.getEndtime());
        return map;
    }*/

    /**
     * 通过优惠券Ids查询优惠券表
     *
     * @param couponIds
     * @return list<Coupon>
     */
    @Override
    public List<Coupon> selectCouponByCouponIds(List<Integer> couponIds) {
        Example example = new Example(Coupon.class);
        Criteria criteria = example.createCriteria();
        criteria.andIn("couponid", couponIds);
        List<Coupon> list = couponMapper.selectByExample(example);
        return list;
    }


}


