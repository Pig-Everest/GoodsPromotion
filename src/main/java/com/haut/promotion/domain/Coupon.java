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
     * 优惠卷条件 （满多少减多少等）
     */
    @Column(name = "couponCondition")
    private Integer couponcondition;

    /**
     * 外键->优惠券类型表.id
     */
    @Column(name = "couponStyle")
    private Integer couponstyle;

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
     * 获取优惠卷条件 （满多少减多少等）
     *
     * @return couponCondition - 优惠卷条件 （满多少减多少等）
     */
    public Integer getCouponcondition() {
        return couponcondition;
    }

    /**
     * 设置优惠卷条件 （满多少减多少等）
     *
     * @param couponcondition 优惠卷条件 （满多少减多少等）
     */
    public void setCouponcondition(Integer couponcondition) {
        this.couponcondition = couponcondition;
    }

    /**
     * 获取外键->优惠券类型表.id
     *
     * @return couponStyle - 外键->优惠券类型表.id
     */
    public Integer getCouponstyle() {
        return couponstyle;
    }

    /**
     * 设置外键->优惠券类型表.id
     *
     * @param couponstyle 外键->优惠券类型表.id
     */
    public void setCouponstyle(Integer couponstyle) {
        this.couponstyle = couponstyle;
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
}