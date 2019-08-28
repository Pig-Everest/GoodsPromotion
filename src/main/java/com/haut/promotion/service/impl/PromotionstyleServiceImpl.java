

package com.haut.promotion.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.haut.promotion.domain.Promotionstyle;
import com.haut.promotion.mapper.PromotionstyleMapper;
import com.haut.promotion.service.PromotionstyleService;

import java.util.List;

@Service
public class PromotionstyleServiceImpl implements PromotionstyleService{

    @Resource
    private PromotionstyleMapper promotionstyleMapper;

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return promotionstyleMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(Promotionstyle record) {
        return promotionstyleMapper.insert(record);
    }

    @Override
    public int insertSelective(Promotionstyle record) {
        return promotionstyleMapper.insertSelective(record);
    }

    @Override
    public Promotionstyle selectByPrimaryKey(Integer id) {
        return promotionstyleMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(Promotionstyle record) {
        return promotionstyleMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(Promotionstyle record) {
        return promotionstyleMapper.updateByPrimaryKey(record);
    }

    @Override
    /*
     * 查询所有促销类型
     * */
   public  List<Promotionstyle> selectAllPromotionStyle(){
      return promotionstyleMapper.selectAll();
    }

	/**
     * （优惠券）第二部添加促销类型表
     *
     * @param promotionId
     */
    @Override
    public void insertPromotionStyle(Integer promotionId) {
        Promotionstyle promotionstyle = new Promotionstyle();
        promotionstyle.setStylename("优惠券");
        promotionstyle.setPromotionid(promotionId);
        promotionstyleMapper.insertSelective(promotionstyle);
    }
}