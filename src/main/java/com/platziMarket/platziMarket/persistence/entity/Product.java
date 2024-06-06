package com.platziMarket.platziMarket.persistence.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "products")
@Data
public class Product {
    
    /**
    * Atributes
    */

    @Id
    @Column(name = "productId")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer productId;
    @Column(name = "name")
    private String name;
    @Column(name = "salesPrice")
    private Double salesPrice;
    @Column(name = "stock")
    private Integer stock;
    @Column(name = "barCode")
    private String barCode;
    @Column(name = "state")
    private Boolean state;

    /**
     * Relations
    */

    @ManyToOne @JoinColumn(name = "categoryId", insertable = false, updatable = false)
    private Category category;

    public Product() {}

    public Product(Integer productId, String name, Double salesPrice, Integer stock, String barCode, Boolean state) {
        this.productId = productId;
        this.name = name;
        this.salesPrice = salesPrice;
        this.stock = stock;
        this.barCode = barCode;
        this.state = state;
    }
}
