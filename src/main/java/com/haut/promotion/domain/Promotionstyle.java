

package com.haut.promotion.domain;

import javax.persistence.*;

@Table(name = "promotionstyle")
public class Promotionstyle {
    /**
     * 主键
     */
    @Id
    @Column(name = "id")
    @GeneratedValue(generator = "JDBC")
    private Integer id;

    /**
     * 促销类型名
     */
    @Column(name = "stylename")
    private String stylename;

    /**
     * 外键->促销表.id
     */
    @Column(name = "promotionId")
    private Integer promotionid;

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
     * 获取促销类型名
     *
     * @return stylename - 促销类型名
     */
    public String getStylename() {
        return stylename;
    }

    /**
     * 设置促销类型名
     *
     * @param stylename 促销类型名
     */
    public void setStylename(String stylename) {
        this.stylename = stylename;
    }

    /**
     * 获取外键->促销表.id
     *
     * @return promotionId - 外键->促销表.id
     */
    public Integer getPromotionid() {
        return promotionid;
    }

    /**
     * 设置外键->促销表.id
     *
     * @param promotionid 外键->促销表.id
     */
    public void setPromotionid(Integer promotionid) {
        this.promotionid = promotionid;
    }
}