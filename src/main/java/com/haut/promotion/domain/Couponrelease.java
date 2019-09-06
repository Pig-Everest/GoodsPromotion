package com.haut.promotion.domain;

import javax.persistence.*;

@Table(name = "couponrelease")
public class Couponrelease {
    @Id
    @Column(name = "id")
    @GeneratedValue(generator = "JDBC")
    private Integer id;

    /**
     * 保质期天数
     */
    @Column(name = "`days`")
    private Integer days;

    /**
     * 外键->优惠券表.id
     */
    @Column(name = "couponId")
    private Integer couponid;

    /**
     * 发行数量
     */
    @Column(name = "`number`")
    private Integer number;

    /**
     * 使用开始时间
     */
    @Column(name = "useBeginTime")
    private String usebegintime;

    /**
     * 使用结束时间
     */
    @Column(name = "useEndTime")
    private String useendtime;

    /**
     * 限定开始日期
     */
    @Column(name = "limitBeginTime")
    private String limitbegintime;

    /**
     * 限定结束时间
     */
    @Column(name = "limitEndTime")
    private String limitendtime;

    /**
     * 商户编号 外键->商家.id
     */
    @Column(name = "businessId")
    private Integer businessid;

    /**
     * @return id
     */
    public Integer getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取保质期天数
     *
     * @return days - 保质期天数
     */
    public Integer getDays() {
        return days;
    }

    /**
     * 设置保质期天数
     *
     * @param days 保质期天数
     */
    public void setDays(Integer days) {
        this.days = days;
    }

    /**
     * 获取外键->优惠券表.id
     *
     * @return couponId - 外键->优惠券表.id
     */
    public Integer getCouponid() {
        return couponid;
    }

    /**
     * 设置外键->优惠券表.id
     *
     * @param couponid 外键->优惠券表.id
     */
    public void setCouponid(Integer couponid) {
        this.couponid = couponid;
    }

    /**
     * 获取发行数量
     *
     * @return number - 发行数量
     */
    public Integer getNumber() {
        return number;
    }

    /**
     * 设置发行数量
     *
     * @param number 发行数量
     */
    public void setNumber(Integer number) {
        this.number = number;
    }

    /**
     * 获取使用开始时间
     *
     * @return useBeginTime - 使用开始时间
     */
    public String getUsebegintime() {
        return usebegintime;
    }

    /**
     * 设置使用开始时间
     *
     * @param usebegintime 使用开始时间
     */
    public void setUsebegintime(String usebegintime) {
        this.usebegintime = usebegintime;
    }

    /**
     * 获取使用结束时间
     *
     * @return useEndTime - 使用结束时间
     */
    public String getUseendtime() {
        return useendtime;
    }

    /**
     * 设置使用结束时间
     *
     * @param useendtime 使用结束时间
     */
    public void setUseendtime(String useendtime) {
        this.useendtime = useendtime;
    }

    /**
     * 获取限定开始日期
     *
     * @return limitBeginTime - 限定开始日期
     */
    public String getLimitbegintime() {
        return limitbegintime;
    }

    /**
     * 设置限定开始日期
     *
     * @param limitbegintime 限定开始日期
     */
    public void setLimitbegintime(String limitbegintime) {
        this.limitbegintime = limitbegintime;
    }

    /**
     * 获取限定结束时间
     *
     * @return limitEndTime - 限定结束时间
     */
    public String getLimitendtime() {
        return limitendtime;
    }

    /**
     * 设置限定结束时间
     *
     * @param limitendtime 限定结束时间
     */
    public void setLimitendtime(String limitendtime) {
        this.limitendtime = limitendtime;
    }

    /**
     * 获取商户编号 外键->商家.id
     *
     * @return businessId - 商户编号 外键->商家.id
     */
    public Integer getBusinessid() {
        return businessid;
    }

    /**
     * 设置商户编号 外键->商家.id
     *
     * @param businessid 商户编号 外键->商家.id
     */
    public void setBusinessid(Integer businessid) {
        this.businessid = businessid;
    }
}