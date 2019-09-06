package com.haut.promotion.service.impl;

import com.haut.promotion.domain.Goods_Promotionlinks;
import com.haut.promotion.service.GoodsPromotionLinksService;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.haut.promotion.mapper.GoodsMapper;
import tk.mybatis.mapper.entity.Example;
import tk.mybatis.mapper.entity.Example.Criteria;

import java.util.ArrayList;
import java.util.List;

@Service
public class GoodsServiceImpl implements GoodsService{
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

    /**
     * 通过三个id查询所关联的促销id
     *
     * @param sku_id 型号id
     * @param spu_id 商品id
     * @param id     店铺id
     * @return 促销id
     */
    @Override
    public List<Integer> selectGoodsByIds(Integer sku_id, Integer spu_id, Integer id) {
        Example example = new Example(Goods.class);
        Criteria criteria = example.createCriteria();
        criteria.andCondition("typeid",sku_id);
        criteria.andCondition("goodsid",spu_id);
        criteria.andCondition("businessid",id);
        List<Goods> goodsList = goodsMapper.selectByExample(example);
        List<Integer> promotionIds = new ArrayList<>();
        for (Goods goods : goodsList) {
            promotionIds.add(goods.getPromotionid());
        }
        return promotionIds;
    }

    /**
     * 通过店铺id查询所关联的促销id
     *
     * @param id
     * @return 促销ids
     */
    @Override
    public List<Integer> selectPromotionIdByBusinessId(Integer id) {
        Goods goods = new Goods();
        goods.setBusinessid(id);
        List<Integer> list = new ArrayList<>();
        for (Goods goods1 : goodsMapper.select(goods)) {
            list.add(goods1.getPromotionid());
        }
        return list;
    }

    /**
     * 通过促销ids查询所关联的skuIds
     *
     * @param ids
     * @return skuIds
     */
    @Override
    public List<Integer> selectSkuIdsByPromotionIds(List<Integer> ids) {
        Example example = new Example(Goods.class);
        Criteria criteria = example.createCriteria();
        criteria.andIn("promotionid",ids);
        List<Goods> goodsList = goodsMapper.selectByExample(example);
        List<Integer> list = new ArrayList<>();
        for (Goods goods : goodsList) {
            list.add(goods.getTypeid());
        }
        return list;
    }
}
