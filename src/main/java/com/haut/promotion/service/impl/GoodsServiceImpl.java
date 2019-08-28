package com.haut.promotion.service.impl;

import com.haut.promotion.domain.Goods;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.haut.promotion.mapper.GoodsMapper;
import com.haut.promotion.service.GoodsService;

import java.util.List;

@Service
public class GoodsServiceImpl implements GoodsService{

    @Resource
    private GoodsMapper goodsMapper;

    /**
     * 第三步添加商品信息表
     *
     * @param goodsList 一次传输一个或者多个id
     */
    @Override
    public void insertGoods(List<Goods> goodsList) {
        for (Goods goods : goodsList) {
            goodsMapper.insertSelective(goods);
        }
    }
}
