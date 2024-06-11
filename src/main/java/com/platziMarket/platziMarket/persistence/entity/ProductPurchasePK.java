package com.platziMarket.platziMarket.persistence.entity;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.Data;

@Embeddable
//@Data
public class ProductPurchasePK implements Serializable{
    
    /**
    * Atributes
    */
    @Column(name = "productId")
    private Integer productId;
    @Column(name = "purchaseId")
    private Integer purchaseId;

    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    public Integer getPurchaseId() {
        return purchaseId;
    }

    public void setPurchaseId(Integer purchaseId) {
        this.purchaseId = purchaseId;
    }
}
