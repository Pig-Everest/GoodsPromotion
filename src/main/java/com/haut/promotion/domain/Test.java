package com.haut.promotion.domain;

import javax.persistence.*;

@Table(name = "test")
public class Test {
    @Id
    @Column(name = "test")
    @GeneratedValue(generator = "JDBC")
    private Integer test;

    /**
     * @return test
     */
    public Integer getTest() {
        return test;
    }

    /**
     * @param test
     */
    public void setTest(Integer test) {
        this.test = test;
    }
}