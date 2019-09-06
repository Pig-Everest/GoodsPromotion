package com.haut.promotion.domain;

import javax.persistence.*;

@Table(name = "coupon")
public class Coupon {
    /**
     * 优惠卷编码 优惠卷表主键
     */
    @Id
    @Column(name = "couponId")
    @GeneratedValue(generator = "JDBC")
    private Integer couponid;

    /**
     * 优惠卷名字 优惠卷名字
     */
    @Column(name = "couponName")
    private String couponname;

    /**
     * 保质期天数 保质期天数
     */
    @Column(name = "`days`")
    private Integer days;

    /**
     * 发行数量 发行数量
     */
    @Column(name = "`number`")
    private Integer number;

    /**
     * 促销编号 外键->促销表
     */
    @Column(name = "promotionId")
    private Integer promotionid;

    /**
     * 是否公开 1公开 0不公开
     */
    @Column(name = "isOpen")
    private Integer isopen;

    /**
     * 限领数量 限领数量
     */
    @Column(name = "limitedNumber")
    private Integer limitednumber;

    /**
     * 面值 面值
     */
    @Column(name = "`value`")
    private Integer value;

    /**
     * 满减的满 满多少钱可以使用优惠卷
     */
    @Column(name = "`full`")
    private Integer full;

    /**
     * 满减的减 满多少钱减多少钱
     */
    @Column(name = "redution")
    private Integer redution;

    /**
     * 折扣 优惠卷是折扣卷的折扣
     */
    @Column(name = "discount")
    private Integer discount;

    /**
     * 外键->优惠券类型表.id
     */
    @Column(name = "couponType")
    private Integer coupontype;

    /**
     * 获取优惠卷编码 优惠卷表主键
     *
     * @return couponId - 优惠卷编码 优惠卷表主键
     */
    public Integer getCouponid() {
        return couponid;
    }

    /**
     * 设置优惠卷编码 优惠卷表主键
     *
     * @param couponid 优惠卷编码 优惠卷表主键
     */
    public void setCouponid(Integer couponid) {
        this.couponid = couponid;
    }

    /**
     * 获取优惠卷名字 优惠卷名字
     *
     * @return couponName - 优惠卷名字 优惠卷名字
     */
    public String getCouponname() {
        return couponname;
    }

    /**
     * 设置优惠卷名字 优惠卷名字
     *
     * @param couponname 优惠卷名字 优惠卷名字
     */
    public void setCouponname(String couponname) {
        this.couponname = couponname;
    }

    /**
     * 获取保质期天数 保质期天数
     *
     * @return days - 保质期天数 保质期天数
     */
    public Integer getDays() {
        return days;
    }

    /**
     * 设置保质期天数 保质期天数
     *
     * @param days 保质期天数 保质期天数
     */
    public void setDays(Integer days) {
        this.days = days;
    }

    /**
     * 获取发行数量 发行数量
     *
     * @return number - 发行数量 发行数量
     */
    public Integer getNumber() {
        return number;
    }

    /**
     * 设置发行数量 发行数量
     *
     * @param number 发行数量 发行数量
     */
    public void setNumber(Integer number) {
        this.number = number;
    }

    /**
     * 获取促销编号 外键->促销表
     *
     * @return promotionId - 促销编号 外键->促销表
     */
    public Integer getPromotionid() {
        return promotionid;
    }

    /**
     * 设置促销编号 外键->促销表
     *
     * @param promotionid 促销编号 外键->促销表
     */
    public void setPromotionid(Integer promotionid) {
        this.promotionid = promotionid;
    }

    /**
     * 获取是否公开 1公开 0不公开
     *
     * @return isOpen - 是否公开 1公开 0不公开
     */
    public Integer getIsopen() {
        return isopen;
    }

    /**
     * 设置是否公开 1公开 0不公开
     *
     * @param isopen 是否公开 1公开 0不公开
     */
    public void setIsopen(Integer isopen) {
        this.isopen = isopen;
    }

    /**
     * 获取限领数量 限领数量
     *
     * @return limitedNumber - 限领数量 限领数量
     */
    public Integer getLimitednumber() {
        return limitednumber;
    }

    /**
     * 设置限领数量 限领数量
     *
     * @param limitednumber 限领数量 限领数量
     */
    public void setLimitednumber(Integer limitednumber) {
        this.limitednumber = limitednumber;
    }

    /**
     * 获取面值 面值
     *
     * @return value - 面值 面值
     */
    public Integer getValue() {
        return value;
    }

    /**
     * 设置面值 面值
     *
     * @param value 面值 面值
     */
    public void setValue(Integer value) {
        this.value = value;
    }

    /**
     * 获取满减的满 满多少钱可以使用优惠卷
     *
     * @return full - 满减的满 满多少钱可以使用优惠卷
     */
    public Integer getFull() {
        return full;
    }

    /**
     * 设置满减的满 满多少钱可以使用优惠卷
     *
     * @param full 满减的满 满多少钱可以使用优惠卷
     */
    public void setFull(Integer full) {
        this.full = full;
    }

    /**
     * 获取满减的减 满多少钱减多少钱
     *
     * @return redution - 满减的减 满多少钱减多少钱
     */
    public Integer getRedution() {
        return redution;
    }

    /**
     * 设置满减的减 满多少钱减多少钱
     *
     * @param redution 满减的减 满多少钱减多少钱
     */
    public void setRedution(Integer redution) {
        this.redution = redution;
    }

    /**
     * 获取折扣 优惠卷是折扣卷的折扣
     *
     * @return discount - 折扣 优惠卷是折扣卷的折扣
     */
    public Integer getDiscount() {
        return discount;
    }

    /**
     * 设置折扣 优惠卷是折扣卷的折扣
     *
     * @param discount 折扣 优惠卷是折扣卷的折扣
     */
    public void setDiscount(Integer discount) {
        this.discount = discount;
    }

    /**
     * 获取外键->优惠券类型表.id
     *
     * @return couponType - 外键->优惠券类型表.id
     */
    public Integer getCoupontype() {
        return coupontype;
    }

    /**
     * 设置外键->优惠券类型表.id
     *
     * @param coupontype 外键->优惠券类型表.id
     */
    public void setCoupontype(Integer coupontype) {
        this.coupontype = coupontype;
    }
}