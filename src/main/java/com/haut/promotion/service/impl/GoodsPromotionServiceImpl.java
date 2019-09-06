package com.haut.promotion.service.impl;

import com.haut.promotion.domain.Goods_Promotionlinks;
import com.haut.promotion.service.GoodsPromotionLinksService;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.haut.promotion.mapper.GoodsMapper;


import java.util.List;

@Service
public class GoodsPromotionServiceImpl implements GoodsPromotionLinksService {

    @Resource
    private GoodsMapper goodsMapper;

    /**
     * 第三步添加商品信息表
     *
     * @param goodsList 一次传输一个或者多个id
     */
    @Override
    public int insertGoods(List<Goods_Promotionlinks> goodsList) {
        for (Goods_Promotionlinks goods : goodsList) {
            goodsMapper.insertSelective(goods);
        }
        //
        return goodsList.size();
    }
}
