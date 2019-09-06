package com.haut.promotion.domain;

import javax.persistence.*;

@Table(name = "couponreceive")
public class Couponreceive {
    @Id
    @Column(name = "id")
    @GeneratedValue(generator = "JDBC")
    private Integer id;

    /**
     * 外键->优惠券发布信息表.id
     */
    @Column(name = "couponReleaseId")
    private Integer couponreleaseid;

    /**
     * 外键->用户表.id
     */
    @Column(name = "userId")
    private Integer userid;

    /**
     * 领取时间
     */
    @Column(name = "getTime")
    private String gettime;

    /**
     * 是否过期 0未过期 1过期
     */
    @Column(name = "isExpire")
    private Integer isexpire;

    /**
     * 是否使用是 0未使用 1已使用
     */
    @Column(name = "isUsed")
    private Integer isused;

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
     * 获取外键->优惠券发布信息表.id
     *
     * @return couponReleaseId - 外键->优惠券发布信息表.id
     */
    public Integer getCouponreleaseid() {
        return couponreleaseid;
    }

    /**
     * 设置外键->优惠券发布信息表.id
     *
     * @param couponreleaseid 外键->优惠券发布信息表.id
     */
    public void setCouponreleaseid(Integer couponreleaseid) {
        this.couponreleaseid = couponreleaseid;
    }

    /**
     * 获取外键->用户表.id
     *
     * @return userId - 外键->用户表.id
     */
    public Integer getUserid() {
        return userid;
    }

    /**
     * 设置外键->用户表.id
     *
     * @param userid 外键->用户表.id
     */
    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    /**
     * 获取领取时间
     *
     * @return getTime - 领取时间
     */
    public String getGettime() {
        return gettime;
    }

    /**
     * 设置领取时间
     *
     * @param gettime 领取时间
     */
    public void setGettime(String gettime) {
        this.gettime = gettime;
    }

    /**
     * 获取是否过期 0未过期 1过期
     *
     * @return isExpire - 是否过期 0未过期 1过期
     */
    public Integer getIsexpire() {
        return isexpire;
    }

    /**
     * 设置是否过期 0未过期 1过期
     *
     * @param isexpire 是否过期 0未过期 1过期
     */
    public void setIsexpire(Integer isexpire) {
        this.isexpire = isexpire;
    }

    /**
     * 获取是否使用是 0未使用 1已使用
     *
     * @return isUsed - 是否使用是 0未使用 1已使用
     */
    public Integer getIsused() {
        return isused;
    }

    /**
     * 设置是否使用是 0未使用 1已使用
     *
     * @param isused 是否使用是 0未使用 1已使用
     */
    public void setIsused(Integer isused) {
        this.isused = isused;
    }
}