package com.haut.promotion.domain;

import javax.persistence.*;

@Table(name = "promotion")
public class Promotion {
    /**
     * 主键
     */
    @Id
    @Column(name = "id")
    @GeneratedValue(generator = "JDBC")
    private Integer id;

    /**
     * 促销名字
     */
    @Column(name = "promotionname")
    private String promotionname;

    /**
     * 促销平台
     */
    @Column(name = "promotionplatfrom")
    private String promotionplatfrom;

    /**
     * 促销渠道
     */
    @Column(name = "promotionchannels")
    private String promotionchannels;

    /**
     * 促销用户范围
     */
    @Column(name = "promotionuserscope")
    private String promotionuserscope;

    /**
     * 促销链接
     */
    @Column(name = "promotionlinks")
    private String promotionlinks;

    /**
     * 限制数量
     */
    @Column(name = "limitednumber")
    private String limitednumber;

    @Column(name = "promotionstate")
    private Integer promotionstate;

    /**
     * 外键->促销类型表 promotionStyle
     */
    @Column(name = "promotionStyle")
    private Integer promotionstyle;

    /**
     * 获取主键
     *
     * @return id - 主键
     */
    public Integer getId() {
        return id;
    }

    /**
     * 设置主键
     *
     * @param id 主键
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取促销名字
     *
     * @return promotionname - 促销名字
     */
    public String getPromotionname() {
        return promotionname;
    }

    /**
     * 设置促销名字
     *
     * @param promotionname 促销名字
     */
    public void setPromotionname(String promotionname) {
        this.promotionname = promotionname;
    }

    /**
     * 获取促销平台
     *
     * @return promotionplatfrom - 促销平台
     */
    public String getPromotionplatfrom() {
        return promotionplatfrom;
    }

    /**
     * 设置促销平台
     *
     * @param promotionplatfrom 促销平台
     */
    public void setPromotionplatfrom(String promotionplatfrom) {
        this.promotionplatfrom = promotionplatfrom;
    }

    /**
     * 获取促销渠道
     *
     * @return promotionchannels - 促销渠道
     */
    public String getPromotionchannels() {
        return promotionchannels;
    }

    /**
     * 设置促销渠道
     *
     * @param promotionchannels 促销渠道
     */
    public void setPromotionchannels(String promotionchannels) {
        this.promotionchannels = promotionchannels;
    }

    /**
     * 获取促销用户范围
     *
     * @return promotionuserscope - 促销用户范围
     */
    public String getPromotionuserscope() {
        return promotionuserscope;
    }

    /**
     * 设置促销用户范围
     *
     * @param promotionuserscope 促销用户范围
     */
    public void setPromotionuserscope(String promotionuserscope) {
        this.promotionuserscope = promotionuserscope;
    }

    /**
     * 获取促销链接
     *
     * @return promotionlinks - 促销链接
     */
    public String getPromotionlinks() {
        return promotionlinks;
    }

    /**
     * 设置促销链接
     *
     * @param promotionlinks 促销链接
     */
    public void setPromotionlinks(String promotionlinks) {
        this.promotionlinks = promotionlinks;
    }

    /**
     * 获取限制数量
     *
     * @return limitednumber - 限制数量
     */
    public String getLimitednumber() {
        return limitednumber;
    }

    /**
     * 设置限制数量
     *
     * @param limitednumber 限制数量
     */
    public void setLimitednumber(String limitednumber) {
        this.limitednumber = limitednumber;
    }

    /**
     * @return promotionstate
     */
    public Integer getPromotionstate() {
        return promotionstate;
    }

    /**
     * @param promotionstate
     */
    public void setPromotionstate(Integer promotionstate) {
        this.promotionstate = promotionstate;
    }

    /**
     * 获取外键->促销类型表 promotionStyle
     *
     * @return promotionStyle - 外键->促销类型表 promotionStyle
     */
    public Integer getPromotionstyle() {
        return promotionstyle;
    }

    /**
     * 设置外键->促销类型表 promotionStyle
     *
     * @param promotionstyle 外键->促销类型表 promotionStyle
     */
    public void setPromotionstyle(Integer promotionstyle) {
        this.promotionstyle = promotionstyle;
    }
}