package com.haut.promotion.service.impl;

import com.haut.promotion.domain.Promotion;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.haut.promotion.mapper.SuitPromotionMapper;
import com.haut.promotion.domain.SuitPromotion;
import com.haut.promotion.service.SuitPromotionService;
@Service
public class SuitPromotionServiceImpl implements SuitPromotionService{

    @Resource
    private SuitPromotionMapper suitPromotionMapper;

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return suitPromotionMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(SuitPromotion record) {
        return suitPromotionMapper.insert(record);
    }

    @Override
    public int insertSelective(SuitPromotion record) {
        return suitPromotionMapper.insertSelective(record);
    }

    @Override
    public SuitPromotion selectByPrimaryKey(Integer id) {
        return suitPromotionMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(SuitPromotion record) {
        return suitPromotionMapper.updateByPrimaryKeySelective(record);
    }
    @Override
    public int updateByPrimaryKey(SuitPromotion record) {
        return suitPromotionMapper.updateByPrimaryKey(record);
    }

    /*
    * 增加套装促销 ，返回套装促销的主键id
    * */
    public  Integer insertSuitPromotion(SuitPromotion suitPromotion){
  suitPromotionMapper.insertSelective(suitPromotion);

  return  suitPromotion.getId();
}

    /*
     * 通过促销信息查询具体的套装促销信息
     * */
    public  SuitPromotion selectSuitPromotionByPromotion(Promotion promotion){
        SuitPromotion suitPromotion=new SuitPromotion();
        suitPromotion.setPromotionid(promotion.getId());

        return  suitPromotionMapper.selectOne(suitPromotion);
    }
}
