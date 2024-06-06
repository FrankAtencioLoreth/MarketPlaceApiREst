package com.platziMarket.platziMarket.persistence.entity;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "categories")
@Data
public class Category {

    /**
    * Atributes
    */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "categoryId")
    private Integer categoryId;
    @Column(name = "description")
    private String description;
    @Column(name = "state")
    private Boolean state;

    /**
     * Relations
    */
    @OneToMany(mappedBy = "category")
    private List<Product> products;

    public Category() {}

    public Category(Integer categoryId, String descripcion, Boolean state) {
        this.categoryId = categoryId;
        this.description = descripcion;
        this.state = state;
    }
    }
