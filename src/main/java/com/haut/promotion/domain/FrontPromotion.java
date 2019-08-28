package com.haut.promotion.domain;

import java.math.BigDecimal;
import javax.persistence.*;

@Table(name = "front_promotion")
public class FrontPromotion {
    /**
     * 主键 定金促销编码
     */
    @Id
    @Column(name = "id")
    @GeneratedValue(generator = "JDBC")
    private Integer id;

    /**
     * 定金面额 提前支付的定金
     */
    @Column(name = "frontmoney")
    private BigDecimal frontmoney;

    /**
     * 促销时间段定金价值金额 促销时间段定金价值金额
     */
    @Column(name = "nowmoney")
    private BigDecimal nowmoney;

    /**
     * 促销表编码 外键->促销表
     */
    @Column(name = "promotionid")
    private Integer promotionid;

    /**
     * 获取主键 定金促销编码
     *
     * @return id - 主键 定金促销编码
     */
    public Integer getId() {
        return id;
    }

    /**
     * 设置主键 定金促销编码
     *
     * @param id 主键 定金促销编码
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取定金面额 提前支付的定金
     *
     * @return frontmoney - 定金面额 提前支付的定金
     */
    public BigDecimal getFrontmoney() {
        return frontmoney;
    }

    /**
     * 设置定金面额 提前支付的定金
     *
     * @param frontmoney 定金面额 提前支付的定金
     */
    public void setFrontmoney(BigDecimal frontmoney) {
        this.frontmoney = frontmoney;
    }

    /**
     * 获取促销时间段定金价值金额 促销时间段定金价值金额
     *
     * @return nowmoney - 促销时间段定金价值金额 促销时间段定金价值金额
     */
    public BigDecimal getNowmoney() {
        return nowmoney;
    }

    /**
     * 设置促销时间段定金价值金额 促销时间段定金价值金额
     *
     * @param nowmoney 促销时间段定金价值金额 促销时间段定金价值金额
     */
    public void setNowmoney(BigDecimal nowmoney) {
        this.nowmoney = nowmoney;
    }

    /**
     * 获取促销表编码 外键->促销表
     *
     * @return promotionid - 促销表编码 外键->促销表
     */
    public Integer getPromotionid() {
        return promotionid;
    }

    /**
     * 设置促销表编码 外键->促销表
     *
     * @param promotionid 促销表编码 外键->促销表
     */
    public void setPromotionid(Integer promotionid) {
        this.promotionid = promotionid;
    }
}