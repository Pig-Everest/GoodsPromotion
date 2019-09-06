

package com.haut.promotion.service;

import com.haut.promotion.domain.Promotionstyle;

import java.util.List;

public interface PromotionstyleService {


    int deleteByPrimaryKey(Integer id);

    int insert(Promotionstyle record);

    int insertSelective(Promotionstyle record);

    Promotionstyle selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Promotionstyle record);

    int updateByPrimaryKey(Promotionstyle record);

    /**
     * 查询所有促销类型
     **/
    public List<Promotionstyle> selectAllPromotionStyle();
}








