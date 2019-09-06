package com.haut.promotion.service;

import com.haut.promotion.domain.Goods_Promotionlinks;

import java.util.List;

public interface GoodsPromotionLinksService {
    /**
     * 第三步添加商品信息表
     * @param goodsList 一次传输一个或者多个id
     */
   public int insertGoods(List<Goods_Promotionlinks> goodsList);
}




