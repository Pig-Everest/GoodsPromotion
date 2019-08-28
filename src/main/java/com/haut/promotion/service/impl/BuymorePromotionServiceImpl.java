package com.haut.promotion.service.impl;

import com.haut.promotion.domain.BuymorePromotion;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.haut.promotion.mapper.BuymorePromotionMapper;
import com.haut.promotion.service.BuymorePromotionService;

@Service
public class BuymorePromotionServiceImpl implements BuymorePromotionService {

    @Resource
    private BuymorePromotionMapper buymorePromotionMapper;

    @Override
    public Integer insertBuyMore(BuymorePromotion buymorePromotion) {
        buymorePromotionMapper.insertSelective(buymorePromotion);
        return buymorePromotion.getId();
    }
}

