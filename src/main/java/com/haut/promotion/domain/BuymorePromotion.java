package com.haut.promotion.domain;

import org.springframework.data.annotation.Persistent;

import javax.persistence.*;

@Table(name = "buymore_promotion")
public class BuymorePromotion {
    /**
     * 主键 多买优惠主键
     */
    @Id
    @Column(name = "id")
    @GeneratedValue(generator = "JDBC")
    private Integer id;

    /**
     * 商品主键 外键->商品表
     */
    @Column(name = "goodsid")
    private Integer goodsid;

    /**
     * 多买优惠类型
     */
    @Column(name = "`type`")
    private Integer type;

    /**
     * 优惠条件
     */
    @Column(name = "`require`")
    private Integer require;

    /**
     * 打几折或几件
     */
    @Column(name = "discount")
    private Integer discount;

    public Timemanager getTimemanager() {
        return timemanager;
    }

    public void setTimemanager(Timemanager timemanager) {
        this.timemanager = timemanager;
    }

    /**
     * 促销编码 外键->促销表
     */
    @Column(name = "promotionid")
    private Integer promotionid;
    @Transient
    private Timemanager timemanager;
    /**
     * 获取主键 多买优惠主键
     *
     * @return id - 主键 多买优惠主键
     */
    public Integer getId() {
        return id;
    }

    /**
     * 设置主键 多买优惠主键
     *
     * @param id 主键 多买优惠主键
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取商品主键 外键->商品表
     *
     * @return goodsid - 商品主键 外键->商品表
     */
    public Integer getGoodsid() {
        return goodsid;
    }

    /**
     * 设置商品主键 外键->商品表
     *
     * @param goodsid 商品主键 外键->商品表
     */
    public void setGoodsid(Integer goodsid) {
        this.goodsid = goodsid;
    }

    /**
     * 获取多买优惠类型
     *
     * @return type - 多买优惠类型
     */
    public Integer getType() {
        return type;
    }

    /**
     * 设置多买优惠类型
     *
     * @param type 多买优惠类型
     */
    public void setType(Integer type) {
        this.type = type;
    }

    /**
     * 获取优惠条件
     *
     * @return require - 优惠条件
     */
    public Integer getRequire() {
        return require;
    }

    /**
     * 设置优惠条件
     *
     * @param require 优惠条件
     */
    public void setRequire(Integer require) {
        this.require = require;
    }

    /**
     * 获取打几折或几件
     *
     * @return discount - 打几折或几件
     */
    public Integer getDiscount() {
        return discount;
    }

    /**
     * 设置打几折或几件
     *
     * @param discount 打几折或几件
     */
    public void setDiscount(Integer discount) {
        this.discount = discount;
    }

    /**
     * 获取促销编码 外键->促销表
     *
     * @return promotionid - 促销编码 外键->促销表
     */
    public Integer getPromotionid() {
        return promotionid;
    }

    /**
     * 设置促销编码 外键->促销表
     *
     * @param promotionid 促销编码 外键->促销表
     */
    public void setPromotionid(Integer promotionid) {
        this.promotionid = promotionid;
    }
}