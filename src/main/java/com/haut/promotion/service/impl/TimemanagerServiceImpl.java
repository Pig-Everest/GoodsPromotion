package com.haut.promotion.service.impl;

import com.haut.promotion.domain.Timemanager;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.haut.promotion.mapper.TimemanagerMapper;
import com.haut.promotion.service.TimemanagerService;
import tk.mybatis.mapper.entity.Example;
import tk.mybatis.mapper.entity.Example.Criteria;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class TimemanagerServiceImpl implements TimemanagerService {

    @Resource
    private TimemanagerMapper timemanagerMapper;

    /**
     * 第五步，添加时间管理表
     *
     * @param startTime 优惠券领取开始时间
     * @param endTime   优惠券领取结束时间
     * @param couponId  优惠券id
     */
    @Override
    public void insertTimeManager(String startTime, String endTime,Integer promotionId, Integer couponId) {
        Timemanager timemanager = new Timemanager();
        timemanager.setStarttime(startTime);
        timemanager.setEndtime(endTime);
        timemanager.setPromotionid(promotionId);
        timemanager.setGetcouponid(couponId);
        timemanagerMapper.insertSelective(timemanager);
    }
    /**
     * 添加时间管理表，和上面不同的是参数是对象，返回主键id值
     * @param timemanager
     * @return
     */
    @Override
    public Integer insertTimeManager(Timemanager timemanager) {
        timemanagerMapper.insertSelective(timemanager);
        return timemanager.getId();
    }

    /**
     * 通过促销ids查询时间，并判断是否符合时间范围
     *
     * @param promotionIds
     * @return 符合的促销ids
     */
    @Override
    public List<Integer> selectTimeByPromotionIds(List<Integer> promotionIds) {
        Example example = new Example(Timemanager.class);
        Criteria criteria = example.createCriteria();
        criteria.andIn("promotionid",promotionIds);
        List<Timemanager> list = timemanagerMapper.selectByExample(example);
        List<Integer> ids = new ArrayList<>();
        for (Timemanager timemanager : list) {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm");
            Date startTime = null;
            Date endTime = null;
            Date date = null;
            try {
                startTime = simpleDateFormat.parse(timemanager.getStarttime());
                endTime = simpleDateFormat.parse(timemanager.getEndtime());
                date = simpleDateFormat.parse(new Date().toString());
            } catch (ParseException e) {
                e.printStackTrace();
            }
            if (startTime.getTime()<=date.getTime()&&endTime.getTime()>=date.getTime()){
                ids.add(timemanager.getPromotionid());
            }
        }
        return ids;
    }


  @Override
    public int addPromotion(Promotion p) {
        return promotionMapper.insert( p);
    }
}

