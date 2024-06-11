package com.platziMarket.platziMarket.domain;

import java.time.LocalDateTime;
import java.util.List;

public class PurchaseDom {

    private int purchaseIdDom;
    private String customerIdDom;
    private LocalDateTime dateDom;
    private String payMethodDom;
    private String commentsDom;
    private String stateDom;
    private List<PurchaseItemDom> itemDom;

    public int getPurchaseIdDom() {
        return purchaseIdDom;
    }

    public void setPurchaseIdDom(int purchaseIdDom) {
        this.purchaseIdDom = purchaseIdDom;
    }

    public String getCustomerIdDom() {
        return customerIdDom;
    }

    public void setCustomerIdDom(String customerIdDom) {
        this.customerIdDom = customerIdDom;
    }

    public LocalDateTime getDateDom() {
        return dateDom;
    }

    public void setDateDom(LocalDateTime dateDom) {
        this.dateDom = dateDom;
    }

    public String getPayMethodDom() {
        return payMethodDom;
    }

    public void setPayMethodDom(String payMethodDom) {
        this.payMethodDom = payMethodDom;
    }

    public String getCommentsDom() {
        return commentsDom;
    }

    public void setCommentsDom(String commentsDom) {
        this.commentsDom = commentsDom;
    }

    public String getStateDom() {
        return stateDom;
    }

    public void setStateDom(String stateDom) {
        this.stateDom = stateDom;
    }

    public List<PurchaseItemDom> getItemDom() {
        return itemDom;
    }

    public void setItemDom(List<PurchaseItemDom> itemDom) {
        this.itemDom = itemDom;
    }
}
