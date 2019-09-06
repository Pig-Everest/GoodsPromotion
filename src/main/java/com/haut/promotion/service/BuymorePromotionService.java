package com.haut.promotion.service;

import com.haut.promotion.domain.BuymorePromotion;
import com.haut.promotion.domain.Promotion;
import com.haut.promotion.domain.Timemanager;

import java.util.List;
import java.util.Map;

public interface BuymorePromotionService {
 /**
  * 提交多买促销
  * @param buymorePromotion
  * @return
  */
 public Integer insertBuyMore(BuymorePromotion buymorePromotion);

 /**
  * 根据传入的promption类型的Map对象查询buymore表的数据，返回Map对象
  * @param map
  * @return
  */
 public Map<String,Object> selectBuyMore(Map<String,Object> map);

 /**
  * 通过promotionId查询buyMore表
  * @param promotionId
  * @return
  */
 public List<BuymorePromotion> selecttByPromotionId(int promotionId);

 /**
  * 通过promotionId连buymore表和timemanager表查询
  * @param id
  * @return
  */
 List<BuymorePromotion> selectBuymoreAndTime(int id);

 /**
  * 根据传进来的promotionid修改三个表的内容
  * @param promotion
  * @param timemanager
  * @param buymorePromotion
  */
 public void updateBuymore(Promotion promotion,Timemanager timemanager,BuymorePromotion buymorePromotion,int require1[], int discount1[]);
}

