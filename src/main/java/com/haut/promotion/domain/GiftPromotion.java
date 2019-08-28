package com.haut.promotion.domain;

import javax.persistence.*;

@Table(name = "gift_promotion")
public class GiftPromotion {
    /**
     * 赠品促销方式主键
     */
    @Id
    @Column(name = "id")
    @GeneratedValue(generator = "JDBC")
    private Integer id;

    /**
     * 赠品编号
     */
    @Column(name = "giftids")
    private String giftids;

    /**
     * 促销编号
     */
    @Column(name = "promotionid")
    private Integer promotionid;

    /**
     * 获取赠品促销方式主键
     *
     * @return id - 赠品促销方式主键
     */
    public Integer getId() {
        return id;
    }

    /**
     * 设置赠品促销方式主键
     *
     * @param id 赠品促销方式主键
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取赠品编号
     *
     * @return giftids - 赠品编号
     */
    public String getGiftids() {
        return giftids;
    }

    /**
     * 设置赠品编号
     *
     * @param giftids 赠品编号
     */
    public void setGiftids(String giftids) {
        this.giftids = giftids;
    }

    /**
     * 获取促销编号
     *
     * @return promotionid - 促销编号
     */
    public Integer getPromotionid() {
        return promotionid;
    }

    /**
     * 设置促销编号
     *
     * @param promotionid 促销编号
     */
    public void setPromotionid(Integer promotionid) {
        this.promotionid = promotionid;
    }


    /**
     * 注入对象促销promotion， gift_promotion与promotion表一对一
     */
    @Transient
    private Promotion promotion;


    public Promotion getPromotion() {
        return promotion;
    }

    public void setPromotion(Promotion promotion) {
        this.promotion = promotion;
    }

    /**
     * 赠品促销表与时间表一对一
     */
    @Transient
  private Timemanager timemanager;

    public Timemanager getTimemanager() {
        return timemanager;
    }

    public void setTimemanager(Timemanager timemanager) {
        this.timemanager = timemanager;
    }
}