package com.haut.promotion.service;

import com.haut.promotion.domain.Promotion;
import com.haut.promotion.domain.Suit;
import com.haut.promotion.domain.SuitPromotion;

import java.util.List;
import java.util.Map;

public interface SuitService {


    int deleteByPrimaryKey(Integer id);

    int insert(Suit record);

    int insertSelective(Suit record);

    Suit selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Suit record);

    int updateByPrimaryKey(Suit record);
/*
* 通过套装查询此套装的所有商品id 并封装在Suit的集合中
* */
List<Suit> selectSuitsBySuit(Suit suit);

}

