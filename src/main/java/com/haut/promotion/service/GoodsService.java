package com.haut.promotion.service;

import com.haut.promotion.domain.Goods;

import java.util.List;

public interface GoodsService{
    /**
     * 第三步添加商品信息表
     * @param goodsList 一次传输一个或者多个id
     */
    void insertGoods(List<Goods> goodsList);

}
