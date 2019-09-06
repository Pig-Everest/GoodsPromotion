package com.haut.promotion.dto;

public class GoodsInfosDto {
    private String goodsId;
    private String goodsType;
    private String goodsName;
    private String goodsPrice;
    private String goodsPromotionInfo;
    private String goodsNum;

    public String getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(String goodsId) {
        this.goodsId = goodsId;
    }

    public String getGoodsType() {
        return goodsType;
    }

    public void setGoodsType(String goodsType) {
        this.goodsType = goodsType;
    }

    public String getGoodsName() {
        return goodsName;
    }

    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName;
    }

    public String getGoodsPrice() {
        return goodsPrice;
    }

    public void setGoodsPrice(String goodsPrice) {
        this.goodsPrice = goodsPrice;
    }

    public String getGoodsPromotionInfo() {
        return goodsPromotionInfo;
    }

    public void setGoodsPromotionInfo(String goodsPromotionInfo) {
        this.goodsPromotionInfo = goodsPromotionInfo;
    }

    public String getGoodsNum() {
        return goodsNum;
    }

    public void setGoodsNum(String goodsNum) {
        this.goodsNum = goodsNum;
    }

    public GoodsInfosDto() {
    }

    public GoodsInfosDto(String goodsId, String goodsType, String goodsName, String goodsPrice, String goodsPromotionInfo, String goodsNum) {
        this.goodsId = goodsId;
        this.goodsType = goodsType;
        this.goodsName = goodsName;
        this.goodsPrice = goodsPrice;
        this.goodsPromotionInfo = goodsPromotionInfo;
        this.goodsNum = goodsNum;
    }
}
