package com.haut.promotion.dto;

import java.util.Arrays;

/**
 * 作为规则页面的临时实体类
 */
public class FrontPromotionDto {
    private String promotionname;
    private String promotionplatfrom;
    private String starttime;
    private String endtime;
    private String beginDate;
    private String endDate;
    private String frontmoney;
    private String nowmoney;
    private String promotionlinks;

    public String getPromotionname() {
        return promotionname;
    }

    public void setPromotionname(String promotionname) {
        this.promotionname = promotionname;
    }

    public String getPromotionplatfrom() {
        return promotionplatfrom;
    }

    public void setPromotionplatfrom(String promotionplatfrom) {
        this.promotionplatfrom = promotionplatfrom;
    }

    public String getStarttime() {
        return starttime;
    }

    public void setStarttime(String starttime) {
        this.starttime = starttime;
    }

    public String getEndtime() {
        return endtime;
    }

    public void setEndtime(String endtime) {
        this.endtime = endtime;
    }

    public String getBeginDate() {
        return beginDate;
    }

    public void setBeginDate(String beginDate) {
        this.beginDate = beginDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public String getFrontmoney() {
        return frontmoney;
    }

    public void setFrontmoney(String frontmoney) {
        this.frontmoney = frontmoney;
    }

    public String getNowmoney() {
        return nowmoney;
    }

    public void setNowmoney(String nowmoney) {
        this.nowmoney = nowmoney;
    }

    public String getPromotionlinks() {
        return promotionlinks;
    }

    public void setPromotionlinks(String promotionlinks) {
        this.promotionlinks = promotionlinks;
    }

    public FrontPromotionDto() {
    }

    public FrontPromotionDto(String promotionname, String promotionplatfrom, String starttime, String endtime, String beginDate, String endDate, String frontmoney, String nowmoney, String promotionlinks) {
        this.promotionname = promotionname;
        this.promotionplatfrom = promotionplatfrom;
        this.starttime = starttime;
        this.endtime = endtime;
        this.beginDate = beginDate;
        this.endDate = endDate;

        this.frontmoney = frontmoney;
        this.nowmoney = nowmoney;
        this.promotionlinks = promotionlinks;
    }
}
