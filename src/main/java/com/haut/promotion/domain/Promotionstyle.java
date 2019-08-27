package com.haut.promotion.domain;

public class Promotionstyle {
    /**
    * 主键
    */
    private Integer id;

    /**
    * 促销类型名
    */
    private String stylename;

    /**
    * 外键->促销表.id
    */
    private Integer promotionid;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getStylename() {
        return stylename;
    }

    public void setStylename(String stylename) {
        this.stylename = stylename;
    }

    public Integer getPromotionid() {
        return promotionid;
    }

    public void setPromotionid(Integer promotionid) {
        this.promotionid = promotionid;
    }
}