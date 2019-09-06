package com.haut.promotion.domain;

import javax.persistence.*;

@Table(name = "discount_coupon")
public class DiscountCoupon {
    /**
     * 主键，自增
     */
    @Id
    @Column(name = "id")
    @GeneratedValue(generator = "JDBC")
    private Integer id;

    /**
     * 打几折
     */
    @Column(name = "discount")
    private Double discount;

    /**
     * 获取主键，自增
     *
     * @return id - 主键，自增
     */
    public Integer getId() {
        return id;
    }

    /**
     * 设置主键，自增
     *
     * @param id 主键，自增
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取打几折
     *
     * @return discount - 打几折
     */
    public Double getDiscount() {
        return discount;
    }

    /**
     * 设置打几折
     *
     * @param discount 打几折
     */
    public void setDiscount(Double discount) {
        this.discount = discount;
    }
}