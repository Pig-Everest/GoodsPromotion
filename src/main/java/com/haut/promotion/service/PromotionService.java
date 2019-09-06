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

	public int addPromotion(Promotion p);

}

