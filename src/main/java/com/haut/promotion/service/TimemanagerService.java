package com.haut.promotion.service;

import com.haut.promotion.domain.Timemanager;

public interface TimemanagerService {
    /**
     * 第五步，添加时间管理表
     *
     * @param startTime 优惠券领取开始时间
     * @param endTime   优惠券领取结束时间
     * @param couponId  优惠券id
     */
    void insertTimeManager(String startTime, String endTime, Integer couponId);

    /**
     * 添加时间管理表，和上面不同的是参数是对象，返回主键id值
     * @param timemanager
     * @return
     */
    Integer insertTimeManager(Timemanager timemanager);
}

