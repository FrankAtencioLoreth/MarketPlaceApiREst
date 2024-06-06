package com.platziMarket.platziMarket.persistence.entity;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.Data;

@Embeddable
@Data
public class ProductPurchasePK implements Serializable{
    
    /**
    * Atributes
    */
    @Column(name = "productId")
    private Integer productId;
    @Column(name = "purchaseId")
    private Integer purchaseId;
}
