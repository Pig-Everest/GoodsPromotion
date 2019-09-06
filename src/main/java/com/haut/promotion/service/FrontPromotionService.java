package com.haut.promotion.service;

import com.haut.promotion.domain.Goods;
import com.haut.promotion.dto.GoodsInfosDto;
import com.haut.promotion.dto.GoodsNumDto;

import java.util.List;

public interface FrontPromotionService{

    /**
     *
     * @param goods 通过商品信息查询到库存接口中的商品库存数量
     * @return
     */
    public List<GoodsNumDto> selGoodsNums(Goods goods);

    /**
     *
     * @param goods 通过商品信息查询到商品中心接口中的商品详细信息
     * @return
     */
    public List<GoodsInfosDto> selGoodsInfo(Goods goods);



}
