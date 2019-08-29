package com.haut.promotion.service;

import com.haut.promotion.domain.Goods;

import java.util.List;

public interface GoodsService{
    /**
     * 第三步添加商品信息表
     * @param goodsList 一次传输一个或者多个id
     */
    void insertGoods(List<Goods> goodsList);

    /**
     * 通过三个id查询所关联的促销id
     * @param sku_id 型号id
     * @param spu_id 商品id
     * @param id     店铺id
     * @return  促销id
     */
    List<Integer> selectGoodsByIds(Integer sku_id, Integer spu_id, Integer id);
}
