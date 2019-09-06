package com.haut.promotion.mapper;

import com.haut.promotion.domain.BuymorePromotion;
import com.haut.promotion.domain.Promotion;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

public interface PromotionMapper extends Mapper<Promotion> {
    public List<Promotion> selectBuymorePromotion(Promotion promotion);
}