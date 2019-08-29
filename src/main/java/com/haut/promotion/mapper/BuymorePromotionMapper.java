package com.haut.promotion.mapper;

import com.haut.promotion.domain.BuymorePromotion;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;
import java.util.Map;

public interface BuymorePromotionMapper extends Mapper<BuymorePromotion> {
   List<BuymorePromotion> selectBuymoreAndTime(int id);
}