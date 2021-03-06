package com.haut.promotion.service.impl;

import com.haut.promotion.domain.GiftPromotion;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.haut.promotion.mapper.GiftPromotionMapper;
import com.haut.promotion.service.GiftPromotionService;
@Service
public class GiftPromotionServiceImpl implements GiftPromotionService{

    @Resource
    private GiftPromotionMapper giftPromotionMapper;

    @Override
    public int addGiftPromotion(GiftPromotion giftPromotion) {
        giftPromotionMapper.insertSelective(giftPromotion);
        return giftPromotion.getId();
    }
}
