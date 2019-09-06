package com.haut.promotion.service;

public interface TimemanagerService {
    /**
     * 第五步，添加时间管理表
     *
     * @param startTime 优惠券领取开始时间
     * @param endTime   优惠券领取结束时间
     * @param couponId  优惠券id
     */
    void insertTimeManager(String startTime, String endTime, Integer couponId);

    public int addTimeByGiftPromotion();

}

