package com.haut.promotion.domain;

import javax.persistence.*;

@Table(name = "coupontype")
public class Coupontype {
    /**
     * 优惠卷类型表id 主键，自增
     */
    @Id
    @Column(name = "id")
    @GeneratedValue(generator = "JDBC")
    private Integer id;

    /**
     * 优惠卷类型的名字 现金卷，折扣卷，满减卷
     */
    @Column(name = "typeName")
    private String typename;

    /**
     * 获取优惠卷类型表id 主键，自增
     *
     * @return id - 优惠卷类型表id 主键，自增
     */
    public Integer getId() {
        return id;
    }

    /**
     * 设置优惠卷类型表id 主键，自增
     *
     * @param id 优惠卷类型表id 主键，自增
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取优惠卷类型的名字 现金卷，折扣卷，满减卷
     *
     * @return typeName - 优惠卷类型的名字 现金卷，折扣卷，满减卷
     */
    public String getTypename() {
        return typename;
    }

    /**
     * 设置优惠卷类型的名字 现金卷，折扣卷，满减卷
     *
     * @param typename 优惠卷类型的名字 现金卷，折扣卷，满减卷
     */
    public void setTypename(String typename) {
        this.typename = typename;
    }
}