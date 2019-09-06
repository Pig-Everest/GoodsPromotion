package com.haut.promotion.domain;

import javax.persistence.*;

@Table(name = "full_coupon")
public class FullCoupon {
    /**
     * 主键 自增
     */
    @Id
    @Column(name = "id")
    @GeneratedValue(generator = "JDBC")
    private Integer id;

    /**
     * 满多少
     */
    @Column(name = "`full`")
    private Integer full;

    /**
     * 减多少
     */
    @Column(name = "reduction")
    private Integer reduction;

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
     * 获取满多少
     *
     * @return full - 满多少
     */
    public Integer getFull() {
        return full;
    }

    /**
     * 设置满多少
     *
     * @param full 满多少
     */
    public void setFull(Integer full) {
        this.full = full;
    }

    /**
     * 获取减多少
     *
     * @return reduction - 减多少
     */
    public Integer getReduction() {
        return reduction;
    }

    /**
     * 设置减多少
     *
     * @param reduction 减多少
     */
    public void setReduction(Integer reduction) {
        this.reduction = reduction;
    }
}