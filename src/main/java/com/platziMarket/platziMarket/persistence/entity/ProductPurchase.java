package com.platziMarket.platziMarket.persistence.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Table(name = "purchase_products", schema = "public")
//@Data
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
    @ManyToOne @MapsId("purchaseId") @JoinColumn(name = "purchaseId", insertable = false, updatable = false)
    private Purchase purchase;

    @ManyToOne @JoinColumn(name = "productId", insertable = false, updatable = false)
    private Product product;

    public ProductPurchasePK getId() {
        return id;
    }

    public void setId(ProductPurchasePK id) {
        this.id = id;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Double getTotal() {
        return total;
    }

    public void setTotal(Double total) {
        this.total = total;
    }

    public Boolean getState() {
        return state;
    }

    public void setState(Boolean state) {
        this.state = state;
    }

    public Purchase getPurchase() {
        return purchase;
    }

    public void setPurchase(Purchase purchase) {
        this.purchase = purchase;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }
}
