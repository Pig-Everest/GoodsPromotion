package com.haut.promotion.service.impl;

import com.haut.promotion.domain.Timemanager;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.haut.promotion.mapper.TimemanagerMapper;
import com.haut.promotion.service.TimemanagerService;

@Service
public class TimemanagerServiceImpl implements TimemanagerService {

    @Resource
    private TimemanagerMapper timemanagerMapper;

    /**
     * 第五步，添加时间管理表
     *
     * @param startTime 优惠券领取开始时间
     * @param endTime   优惠券领取结束时间
     * @param couponId  优惠券id
     */
    @Override
    public void insertTimeManager(String startTime, String endTime, Integer couponId) {
        Timemanager timemanager = new Timemanager();
        timemanager.setStarttime(startTime);
        timemanager.setEndtime(endTime);
        timemanager.setGetcouponid(couponId);
        timemanagerMapper.insertSelective(timemanager);
    }


  @Override
    public int addPromotion(Promotion p) {
        return promotionMapper.insert( p);
    }
}

