package com.haut.promotion.service;

import com.haut.promotion.domain.SuitPromotion;
public interface SuitPromotionService{


    int deleteByPrimaryKey(Integer id);

    int insert(SuitPromotion record);

    int insertSelective(SuitPromotion record);

    SuitPromotion selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(SuitPromotion record);

    int updateByPrimaryKey(SuitPromotion record);

    Integer insertSuitPromotion(SuitPromotion suitPromotion);

}
