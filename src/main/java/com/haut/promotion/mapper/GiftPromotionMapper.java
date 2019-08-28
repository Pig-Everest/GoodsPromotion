package com.haut.promotion.mapper;

import com.haut.promotion.domain.GiftPromotion;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

public interface GiftPromotionMapper extends Mapper<GiftPromotion> {
//public int addGift
    public List<GiftPromotion> showGiftPromotionMessage();

}