package com.haut.promotion.service.impl;

import com.haut.promotion.domain.BuymorePromotion;
import com.haut.promotion.domain.Promotion;
import com.haut.promotion.domain.Timemanager;
import com.haut.promotion.mapper.PromotionMapper;
import com.haut.promotion.mapper.TimemanagerMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

import com.haut.promotion.mapper.BuymorePromotionMapper;
import com.haut.promotion.service.BuymorePromotionService;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Map;
@Transactional// 设置事务
@Service
public class BuymorePromotionServiceImpl implements BuymorePromotionService {

    @Resource
    private BuymorePromotionMapper buymorePromotionMapper;
    @Resource
    private PromotionMapper promotionMapper;
    @Resource
    private TimemanagerMapper timemanagerMapper;

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
        map.put("id", buymorePromotion.getId());
        map.put("goodsid", buymorePromotion.getGoodsid());
        map.put("type", buymorePromotion.getType());
        map.put("require", buymorePromotion.getRequire());
        map.put("discount", buymorePromotion.getDiscount());
        map.put("promotionid", buymorePromotion.getPromotionid());
        return map;
    }

    /**
     * 通过promotionId查询buyMore表
     *
     * @param promotionId
     * @return
     */
    @Override
    public List<BuymorePromotion> selecttByPromotionId(int promotionId) {
        BuymorePromotion buymorePromotion = new BuymorePromotion();
        buymorePromotion.setPromotionid(promotionId);
        List<BuymorePromotion> list = buymorePromotionMapper.select(buymorePromotion);
        return list;
    }
    /**
     * 根据promotionid联表查询buymore表和timemanager表
     * @param id
     * @return
     */
    @Override
    public List<BuymorePromotion> selectBuymoreAndTime(int id) {
        List<BuymorePromotion> list = buymorePromotionMapper.selectBuymoreAndTime(id);
        return list;
    }

    /**
     * 通过promotionid同时修改三个表的数据
     * @param promotion
     * @param timemanager
     * @param buymorePromotion
     */
    @Override
    public void updateBuymore(Promotion promotion, Timemanager timemanager, BuymorePromotion buymorePromotion,int require1[], int discount1[]) {
        BuymorePromotion buymorePromotion1=new BuymorePromotion();
        buymorePromotion1.setPromotionid(promotion.getId());
        Timemanager timemanager1=new Timemanager();
        timemanager1.setPromotionid(promotion.getId());
        /////////////////////////////////////////////
        buymorePromotion.setPromotionid(promotion.getId());
        timemanager.setPromotionid(promotion.getId());
        List<BuymorePromotion> list=buymorePromotionMapper.select(buymorePromotion1);
        List<Timemanager> list2=timemanagerMapper.select(timemanager1);
        /////////////////////////////////////////////
        for(int i=0;i<require1.length;i++){
            buymorePromotion.setId(list.get(i).getId());
            buymorePromotion.setRequire(require1[i]);
            buymorePromotion.setDiscount(discount1[i]);
            buymorePromotionMapper.updateByPrimaryKeySelective(buymorePromotion);
            ///////////////////////////////////////////////////
            timemanager.setId(list2.get(i).getId());
            timemanager.setBuymoreid(list.get(i).getId());
            timemanagerMapper.updateByPrimaryKey(timemanager);
        }

        promotionMapper.updateByPrimaryKey(promotion);

    }
}

