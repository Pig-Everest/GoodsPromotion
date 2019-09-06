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

    /**
     * 通过三个id查询所关联的促销id
     * @param sku_id 型号id
     * @param spu_id 商品id
     * @param id     店铺id
     * @return  促销id
     */
    List<Integer> selectGoodsByIds(Integer sku_id, Integer spu_id, Integer id);

    /**
     * 通过店铺id查询所关联的促销id
     * @param id
     * @return  促销ids
     */
    List<Integer> selectPromotionIdByBusinessId(Integer id);

    /**
     * 通过促销ids查询所关联的skuIds
     * @param ids
     * @return skuIds
     */
    List<Integer> selectSkuIdsByPromotionIds(List<Integer> ids);
}



