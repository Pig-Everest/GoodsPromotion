package com.haut.promotion.mapper;

import com.haut.promotion.domain.SuitPromotion;

public interface SuitPromotionMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(SuitPromotion record);

    int insertSelective(SuitPromotion record);

    SuitPromotion selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(SuitPromotion record);

    int updateByPrimaryKey(SuitPromotion record);
}