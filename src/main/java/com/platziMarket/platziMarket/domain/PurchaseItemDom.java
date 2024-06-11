package com.platziMarket.platziMarket.domain;

import java.time.LocalDateTime;
import java.util.List;

public class PurchaseItemDom {

    private int productIdDom;
    private int quantityDom;
    private double totalDom;
    private boolean activeDom;

    public int getProductIdDom() {
        return productIdDom;
    }

    public void setProductIdDom(int productIdDom) {
        this.productIdDom = productIdDom;
    }

    public int getQuantityDom() {
        return quantityDom;
    }

    public void setQuantityDom(int quantityDom) {
        this.quantityDom = quantityDom;
    }

    public double getTotalDom() {
        return totalDom;
    }

    public void setTotalDom(double totalDom) {
        this.totalDom = totalDom;
    }

    public boolean isActiveDom() {
        return activeDom;
    }

    public void setActiveDom(boolean activeDom) {
        this.activeDom = activeDom;
    }
}
