package com.haut.promotion.service;

import com.haut.promotion.domain.Promotion;

public interface PromotionService {
    /**
     * 第一步添加促销表
     *
     * @param promotion
     * @return
     */
    Integer insertPromotion(Promotion promotion);

    /**
     * 添加多买促销表
     * @param promotion
     * @return
     */
    Integer insertBuyMorePromotion(Promotion promotion);
    /*

    * 添加促销，返回主键*/
    Integer isertPromotion(Promotion promotion);

}

