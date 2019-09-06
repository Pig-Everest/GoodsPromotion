package com.haut.promotion.domain;

import javax.persistence.*;

@Table(name = "goods_promotionlinks")
public class Goods_Promotionlinks {
    @Id
    @Column(name = "id")
    @GeneratedValue(generator = "JDBC")
    private Integer id;

    @Column(name = "goodsId")
    private Integer goodsid;

    @Column(name = "typeId")
    private Integer typeid;

    @Column(name = "businessId")
    private Integer businessid;

    @Column(name = "goodsNum")
    private Integer goodsnum;

    @Column(name = "promotionId")
    private Integer promotionid;

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
     * @return goodsId
     */
    public Integer getGoodsid() {
        return goodsid;
    }

    /**
     * @param goodsid
     */
    public void setGoodsid(Integer goodsid) {
        this.goodsid = goodsid;
    }

    /**
     * @return typeId
     */
    public Integer getTypeid() {
        return typeid;
    }

    /**
     * @param typeid
     */
    public void setTypeid(Integer typeid) {
        this.typeid = typeid;
    }

    /**
     * @return businessId
     */
    public Integer getBusinessid() {
        return businessid;
    }

    /**
     * @param businessid
     */
    public void setBusinessid(Integer businessid) {
        this.businessid = businessid;
    }

    /**
     * @return goodsNum
     */
    public Integer getGoodsnum() {
        return goodsnum;
    }

    /**
     * @param goodsnum
     */
    public void setGoodsnum(Integer goodsnum) {
        this.goodsnum = goodsnum;
    }

    /**
     * @return promotionId
     */
    public Integer getPromotionid() {
        return promotionid;
    }

    /**
     * @param promotionid
     */
    public void setPromotionid(Integer promotionid) {
        this.promotionid = promotionid;
    }
}