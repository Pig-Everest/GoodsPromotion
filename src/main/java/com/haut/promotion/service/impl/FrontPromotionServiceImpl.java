package com.haut.promotion.service.impl;

import com.haut.promotion.domain.Goods;
import com.haut.promotion.dto.GoodsInfosDto;
import com.haut.promotion.dto.GoodsNumDto;
import com.haut.promotion.httpclient.HttpClientUtils;
import com.haut.promotion.myproperties.UrlProperties;
import jdk.nashorn.internal.runtime.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.haut.promotion.mapper.FrontPromotionMapper;
import com.haut.promotion.service.FrontPromotionService;
import org.springframework.transaction.annotation.Transactional;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
@Transactional
public class FrontPromotionServiceImpl implements FrontPromotionService{

    @Autowired
    UrlProperties urlProperties;

    @Resource
    private FrontPromotionMapper frontPromotionMapper;

    @Override
    public List<GoodsNumDto> selGoodsNums(Goods goods) {
        //获取仓库系统查询商品库存的url
        String url = urlProperties.getInventoryUrl();
        Map<String,Object> map = new HashMap<>();
        map.put("goodsid",goods.getGoodsid());
        map.put("typeid",goods.getTypeid());
        map.put("businessid",goods.getBusinessid());
        try {
            Map<String, Object> map1 = HttpClientUtils.doGet(url, map);
            List<GoodsNumDto> list = (List<GoodsNumDto>) map1.get("list");
            return  list;
        } catch (Exception e) {
            System.out.println("httpClient 请求失败！");
            e.printStackTrace();
        }

        return null;
    }

    @Override
    public List<GoodsInfosDto> selGoodsInfo(Goods goods) {
        String url = urlProperties.getGoodsUrl();
        Map<String,Object> map = new HashMap<>();
        map.put("goodsid",goods.getGoodsid());
        map.put("typeid",goods.getTypeid());     //这三处根据对方接口中的命名做调整
        map.put("businessid",goods.getBusinessid());
        List<GoodsNumDto> goodsNumDtos = selGoodsNums(goods);
        List<GoodsInfosDto> goodsInfosDtos = null;
        try {
            Map<String, Object> map1 = HttpClientUtils.doGet(url, map);
            goodsInfosDtos = (List<GoodsInfosDto>) map1.get("list");
        } catch (Exception e) {
            System.out.println("httpClient 请求失败！");
            e.printStackTrace();
        }
        for (GoodsInfosDto goodsInfosDto : goodsInfosDtos) {
            for (GoodsNumDto goodsNumDto : goodsNumDtos) {
                if ((goodsInfosDto.getGoodsId()).equals(goodsNumDto.getGoodsId())){
                    goodsInfosDto.setGoodsNum(goodsNumDto.getGoodsNum());
                }
            }
        }

        return goodsInfosDtos;
    }


}
