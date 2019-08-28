package com.haut.promotion.mapper;

import com.haut.promotion.domain.Suit;

public interface SuitMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Suit record);

    int insertSelective(Suit record);

    Suit selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Suit record);

    int updateByPrimaryKey(Suit record);
}