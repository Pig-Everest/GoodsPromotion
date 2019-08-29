package com.haut.promotion.service.impl;

import com.haut.promotion.domain.BuymorePromotion;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

import com.haut.promotion.mapper.BuymorePromotionMapper;
import com.haut.promotion.service.BuymorePromotionService;

import java.util.Map;

@Service
public class BuymorePromotionServiceImpl implements BuymorePromotionService {

    @Resource
    private BuymorePromotionMapper buymorePromotionMapper;

    /**
     * 提交多买促销
     *
     * @param buymorePromotion
     * @return
     */
    @Override
    public Integer insertBuyMore(BuymorePromotion buymorePromotion) {
        buymorePromotionMapper.insertSelective(buymorePromotion);
        return buymorePromotion.getId();
    }

    /**
     * 根据传入的promption类型的Map对象查询buymore表的数据，返回Map对象
     *
     * @param map
     * @return
     */
    @Override
    public Map<String, Object> selectBuyMore(Map<String, Object> map) {
        BuymorePromotion buymorePromotion = buymorePromotionMapper.selectByPrimaryKey(map.get("id"));
        map.put("id",buymorePromotion.getId());
        map.put("goodsid",buymorePromotion.getGoodsid());
        map.put("type",buymorePromotion.getType());
        map.put("require",buymorePromotion.getRequire());
        map.put("discount",buymorePromotion.getDiscount());
        map.put("promotionid",buymorePromotion.getPromotionid());
        return map;
    }
}

