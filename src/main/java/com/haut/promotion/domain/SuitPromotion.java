package com.haut.promotion.domain;

import java.math.BigDecimal;

public class SuitPromotion {
    /**
    * 主键
    */
    private Integer id;

    /**
    * 套装名字
    */
    private String suiname;

    /**
    * 商品ids
    */
    private String goodsids;

    /**
    * 套装价格
    */
    private BigDecimal suitprice;

    /**
    * 促销编号
    */
    private Integer promotionid;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getSuiname() {
        return suiname;
    }

    public void setSuiname(String suiname) {
        this.suiname = suiname;
    }

    public String getGoodsids() {
        return goodsids;
    }

    public void setGoodsids(String goodsids) {
        this.goodsids = goodsids;
    }

    public BigDecimal getSuitprice() {
        return suitprice;
    }

    public void setSuitprice(BigDecimal suitprice) {
        this.suitprice = suitprice;
    }

    public Integer getPromotionid() {
        return promotionid;
    }

    public void setPromotionid(Integer promotionid) {
        this.promotionid = promotionid;
    }
}