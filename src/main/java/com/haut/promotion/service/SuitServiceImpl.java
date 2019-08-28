package com.haut.promotion.service;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.haut.promotion.mapper.SuitMapper;
import com.haut.promotion.domain.Suit;
import com.haut.promotion.service.SuitService;
@Service
public class SuitServiceImpl implements SuitService{

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

}
