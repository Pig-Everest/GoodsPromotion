package com.haut.promotion.service.impl;

import com.haut.promotion.domain.Promotion;
import com.haut.promotion.mapper.PromotionMapper;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;

import com.haut.promotion.service.PromotionService;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class PromotionServiceImpl implements PromotionService {

    @Resource
    private PromotionMapper promotionMapper;

    /**
     * 第一步添加促销表
     *
     * @param promotion
     * @return 促销表id
     */
    @Override
    public Integer insertPromotion(Promotion promotion) {
        promotion.setPromotionchannels("全渠道");
        promotion.setPromotionuserscope("普通用户");
        promotion.setPromotionlinks("待添加");
        promotion.setPromotionstyle(9);
        promotion.setPromotionstate(0);
        promotion.setPromotiondescripe("NVLL");
        promotionMapper.insertSelective(promotion);
        return promotion.getId();
    }

    /**
     * 通过促销id查询促销表信息
     *
     * @param promotionId 促销id
     * @return 促销表
     */
    @Override
    public Map<String, Object> selectPromotionById(Integer promotionId) {
        Promotion promotion = promotionMapper.selectByPrimaryKey(promotionId);
        Map<String, Object> map = new HashMap<>();
        map.put("id", promotion.getId());
        map.put("promotionname", promotion.getPromotionname());
        map.put("promotionplatfrom", promotion.getPromotionplatfrom());
        map.put("promotionchannels", promotion.getPromotionchannels());
        map.put("promotionuserscope", promotion.getPromotionuserscope());
        map.put("promotionlinks", promotion.getPromotionlinks());
        map.put("promotionstate", promotion.getPromotionstate());
        map.put("promotionStyle", promotion.getPromotionstyle());
        map.put("promotiondescripe", promotion.getPromotiondescripe());
        return map;
    }
    /**
     * 通过促销信息组合查询查询促销表信息 封装成对象
     *
     * @param promotionId 促销id
     * @return 促销信息
     */
     public Promotion  selectPromotion(Integer promotionId){
        Promotion promotion = promotionMapper.selectByPrimaryKey(promotionId);

        return promotion;
    }

    /**
     * 通过优惠券类型查询促销表信息
     *
     * @return 促销ids
     */
    @Override
    public List<Integer> selectPromotionByCouponType() {
        Promotion promotion = new Promotion();
        promotion.setPromotionstyle(8);
        List<Integer> ids = new ArrayList<>();
        for (Promotion promotion1 : promotionMapper.select(promotion)) {
            ids.add(promotion1.getId());
        }
        return ids;
    }

     * 通过promotionid来查询该订单的所有信息
     * @param promotion
     * @return
     */
    @Override
    public List<Promotion> selectBuymorePromotion(Promotion promotion) {
        return promotionMapper.selectBuymorePromotion(promotion);
    }

    /**     * 添加多买促销表
     *
     * @param promotion
     * @return
     */
    @Override
    public Integer insertBuyMorePromotion(Promotion promotion) {
        promotionMapper.insertSelective(promotion);
        return promotion.getId();
    }

    /**
     * 添加促销表
     *
     * @param promotion
     * @return
     */

    public Integer isertPromotion(Promotion promotion) {
        promotionMapper.insertSelective(promotion);
        return promotion.getId();
    }



  @Override
    public int addPromotion(Promotion p) {
        return promotionMapper.insert( p);
    }
}



