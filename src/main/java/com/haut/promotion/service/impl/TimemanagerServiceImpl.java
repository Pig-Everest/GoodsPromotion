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
    public void insertTimeManager(String startTime, String endTime,Integer promotionId, Integer couponId) {
        Timemanager timemanager = new Timemanager();
        timemanager.setStarttime(startTime);
        timemanager.setEndtime(endTime);
        timemanager.setPromotionid(promotionId);
        timemanager.setGetcouponid(couponId);
        timemanagerMapper.insertSelective(timemanager);
    }
    /**
     * 添加时间管理表，和上面不同的是参数是对象，返回主键id值
     * @param timemanager
     * @return
     */
    @Override
    public Integer insertTimeManager(Timemanager timemanager) {
        timemanagerMapper.insertSelective(timemanager);
        return timemanager.getId();
    }
}

