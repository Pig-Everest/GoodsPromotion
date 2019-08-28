package com.haut.promotion.service.impl;

import com.haut.promotion.domain.Promotion;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.haut.promotion.mapper.PromotionMapper;
import com.haut.promotion.service.PromotionService;
@Service
public class PromotionServiceImpl implements PromotionService{

    @Resource
    private PromotionMapper promotionMapper;

    @Override
    public int addPromotion(Promotion p) {
        return promotionMapper.insert( p);
    }
}
