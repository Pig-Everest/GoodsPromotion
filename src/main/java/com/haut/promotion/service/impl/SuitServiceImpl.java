package com.haut.promotion.service.impl;

import com.haut.promotion.domain.Promotion;
import com.haut.promotion.domain.SuitPromotion;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.haut.promotion.mapper.SuitMapper;
import com.haut.promotion.domain.Suit;
import com.haut.promotion.service.SuitService;

import java.util.List;

@Service
public class SuitServiceImpl implements SuitService {

    @Resource
    private SuitMapper suitMapper;

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return suitMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(Suit record) {
        return suitMapper.insert(record);
    }

    @Override
    public int insertSelective(Suit record) {
        return suitMapper.insertSelective(record);
    }

    @Override
    public Suit selectByPrimaryKey(Integer id) {
        return suitMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(Suit record) {
        return suitMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(Suit record) {
        return suitMapper.updateByPrimaryKey(record);
    }
    /*
     * 通过套装查询此套装的所有商品id 并封装在Suit的集合中
     * */
   public     List<Suit> selectSuitsBySuit(Suit suit){
        return  suitMapper.select(suit);
    }
}

