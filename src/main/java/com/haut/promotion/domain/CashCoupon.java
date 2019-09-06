package com.haut.promotion.domain;

import javax.persistence.*;

@Table(name = "cash_coupon")
public class CashCoupon {
    /**
     * 主键 自增
     */
    @Id
    @Column(name = "id")
    @GeneratedValue(generator = "JDBC")
    private Integer id;

    /**
     * 金额
     */
    @Column(name = "cost")
    private Integer cost;

    /**
     * 获取主键 自增
     *
     * @return id - 主键 自增
     */
    public Integer getId() {
        return id;
    }

    /**
     * 设置主键 自增
     *
     * @param id 主键 自增
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取金额
     *
     * @return cost - 金额
     */
    public Integer getCost() {
        return cost;
    }

    /**
     * 设置金额
     *
     * @param cost 金额
     */
    public void setCost(Integer cost) {
        this.cost = cost;
    }
}