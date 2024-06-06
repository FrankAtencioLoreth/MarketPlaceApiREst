package com.platziMarket.platziMarket.persistence.entity;

import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "purchase_products")
@Data
public class ProductPurchase {
    
    /**
    * Atributes
    */
    @EmbeddedId
    private ProductPurchasePK id;
    @Column(name = "quantity")
    private Integer quantity;
    @Column(name = "total")
    private Double total;
    @Column(name = "state")
    private Boolean state;

    /**
     * Relations
    */
    @ManyToOne @JoinColumn(name = "purchaseId", insertable = false, updatable = false)
    private Purchase purchase;

    @ManyToOne @JoinColumn(name = "productId", insertable = false, updatable = false)
    private Product product;

    public ProductPurchase(ProductPurchasePK id, Integer quantity, Double total, Boolean state) {
        this.id = id;
        this.quantity = quantity;
        this.total = total;
        this.state = state;
    }

    
}
