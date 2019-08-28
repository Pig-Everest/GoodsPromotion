package com.haut.promotion.service.impl;

import com.haut.promotion.domain.Promotion;
import com.haut.promotion.mapper.PromotionMapper;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;

import com.haut.promotion.service.PromotionService;

@Service
public class PromotionServiceImpl implements PromotionService {

    @Resource
    private PromotionMapper promotionMapper;

    /**
     * 第一步添加促销表
     *
     * @param promotion
     * @return 促销表id
     */
    @Override
    public Integer insertPromotion(Promotion promotion) {
        promotionMapper.insertSelective(promotion);
        return promotionMapper.selectOne(promotion).getId();
    }
    /**
     * 添加多买促销表
     * @param promotion
     * @return
     */
    @Override
    public Integer insertBuyMorePromotion(Promotion promotion) {
        return promotionMapper.insert(promotion);
    }
}

