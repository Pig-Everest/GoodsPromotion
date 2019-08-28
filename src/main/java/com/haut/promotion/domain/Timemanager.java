package com.haut.promotion.domain;

import javax.persistence.*;

@Table(name = "timemanager")
public class Timemanager {
    /**
     * 主键
     */
    @Id
    @Column(name = "id")
    @GeneratedValue(generator = "JDBC")
    private Integer id;

    /**
     * 开始时间
     */
    @Column(name = "starttime")
    private String starttime;

    /**
     * 结束时间
     */
    @Column(name = "endtime")
    private String endtime;

    /**
     * 促销编号
     */
    @Column(name = "promotionid")
    private Integer promotionid;

    /**
     * 满减编号
     */
    @Column(name = "fullid")
    private Integer fullid;

    /**
     * 单品编号
     */
    @Column(name = "singleid")
    private Integer singleid;

    /**
     * 套装编号
     */
    @Column(name = "suitid")
    private Integer suitid;

    /**
     * 赠品编号
     */
    @Column(name = "giftid")
    private Integer giftid;

    /**
     * 满赠编号
     */
    @Column(name = "fullgiftid")
    private Integer fullgiftid;

    /**
     * 多买编号
     */
    @Column(name = "buymoreid")
    private Integer buymoreid;

    /**
     * 定金编号
     */
    @Column(name = "frontid")
    private Integer frontid;

    /**
     * 使用定金编号
     */
    @Column(name = "useid")
    private Integer useid;

    /**
     * 团购编号
     */
    @Column(name = "groupid")
    private Integer groupid;

    /**
     * 获取优惠券时间
     */
    @Column(name = "getcouponid")
    private Integer getcouponid;

    /**
     * 使用优惠卷时间
     */
    @Column(name = "usecouponid")
    private Integer usecouponid;

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
     * 获取开始时间
     *
     * @return starttime - 开始时间
     */
    public String getStarttime() {
        return starttime;
    }

    /**
     * 设置开始时间
     *
     * @param starttime 开始时间
     */
    public void setStarttime(String starttime) {
        this.starttime = starttime;
    }

    /**
     * 获取结束时间
     *
     * @return endtime - 结束时间
     */
    public String getEndtime() {
        return endtime;
    }

    /**
     * 设置结束时间
     *
     * @param endtime 结束时间
     */
    public void setEndtime(String endtime) {
        this.endtime = endtime;
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
     * 获取满减编号
     *
     * @return fullid - 满减编号
     */
    public Integer getFullid() {
        return fullid;
    }

    /**
     * 设置满减编号
     *
     * @param fullid 满减编号
     */
    public void setFullid(Integer fullid) {
        this.fullid = fullid;
    }

    /**
     * 获取单品编号
     *
     * @return singleid - 单品编号
     */
    public Integer getSingleid() {
        return singleid;
    }

    /**
     * 设置单品编号
     *
     * @param singleid 单品编号
     */
    public void setSingleid(Integer singleid) {
        this.singleid = singleid;
    }

    /**
     * 获取套装编号
     *
     * @return suitid - 套装编号
     */
    public Integer getSuitid() {
        return suitid;
    }

    /**
     * 设置套装编号
     *
     * @param suitid 套装编号
     */
    public void setSuitid(Integer suitid) {
        this.suitid = suitid;
    }

    /**
     * 获取赠品编号
     *
     * @return giftid - 赠品编号
     */
    public Integer getGiftid() {
        return giftid;
    }

    /**
     * 设置赠品编号
     *
     * @param giftid 赠品编号
     */
    public void setGiftid(Integer giftid) {
        this.giftid = giftid;
    }

    /**
     * 获取满赠编号
     *
     * @return fullgiftid - 满赠编号
     */
    public Integer getFullgiftid() {
        return fullgiftid;
    }

    /**
     * 设置满赠编号
     *
     * @param fullgiftid 满赠编号
     */
    public void setFullgiftid(Integer fullgiftid) {
        this.fullgiftid = fullgiftid;
    }

    /**
     * 获取多买编号
     *
     * @return buymoreid - 多买编号
     */
    public Integer getBuymoreid() {
        return buymoreid;
    }

    /**
     * 设置多买编号
     *
     * @param buymoreid 多买编号
     */
    public void setBuymoreid(Integer buymoreid) {
        this.buymoreid = buymoreid;
    }

    /**
     * 获取定金编号
     *
     * @return frontid - 定金编号
     */
    public Integer getFrontid() {
        return frontid;
    }

    /**
     * 设置定金编号
     *
     * @param frontid 定金编号
     */
    public void setFrontid(Integer frontid) {
        this.frontid = frontid;
    }

    /**
     * 获取使用定金编号
     *
     * @return useid - 使用定金编号
     */
    public Integer getUseid() {
        return useid;
    }

    /**
     * 设置使用定金编号
     *
     * @param useid 使用定金编号
     */
    public void setUseid(Integer useid) {
        this.useid = useid;
    }

    /**
     * 获取团购编号
     *
     * @return groupid - 团购编号
     */
    public Integer getGroupid() {
        return groupid;
    }

    /**
     * 设置团购编号
     *
     * @param groupid 团购编号
     */
    public void setGroupid(Integer groupid) {
        this.groupid = groupid;
    }

    /**
     * 获取获取优惠券时间
     *
     * @return getcouponid - 获取优惠券时间
     */
    public Integer getGetcouponid() {
        return getcouponid;
    }

    /**
     * 设置获取优惠券时间
     *
     * @param getcouponid 获取优惠券时间
     */
    public void setGetcouponid(Integer getcouponid) {
        this.getcouponid = getcouponid;
    }

    /**
     * 获取使用优惠卷时间
     *
     * @return usecouponid - 使用优惠卷时间
     */
    public Integer getUsecouponid() {
        return usecouponid;
    }

    /**
     * 设置使用优惠卷时间
     *
     * @param usecouponid 使用优惠卷时间
     */
    public void setUsecouponid(Integer usecouponid) {
        this.usecouponid = usecouponid;
    }
}