package com.haut.promotion.domain;

import javax.persistence.*;
import java.util.List;

@Table(name = "promotionstate")
public class Promotionstate {
    @Id
    @Column(name = "id")
    private Integer id;

    @Column(name = "`name`")
    private String name;

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
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    @Transient
    private List<Promotion> promotion;

}