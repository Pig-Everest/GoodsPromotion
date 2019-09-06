package com.haut.promotion.service;

import com.haut.promotion.domain.Timemanager;

import java.util.List;

public interface TimemanagerService {
    /**
     * 第五步，添加时间管理表
     *
     * @param startTime 优惠券领取开始时间
     * @param endTime   优惠券领取结束时间
     * @param promotionId  促销id
     * @param couponId  优惠券id
     */
    void insertTimeManager(String startTime, String endTime,Integer promotionId, Integer couponId);

    /**
     * 添加时间管理表，和上面不同的是参数是对象，返回主键id值
     * @param timemanager
     * @return
     */
    Integer insertTimeManager(Timemanager timemanager);

    /**
     * 通过促销ids查询时间，并判断是否符合时间范围
     * @param promotionIds
     * @return 符合的促销ids
     */
    List<Integer> selectTimeByPromotionIds(List<Integer> promotionIds);
    public int addTimeByGiftPromotion();

}

