package com.platziMarket.platziMarket.persistence.entity;

import java.time.LocalDateTime;
import java.util.List;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "purchase", schema = "public")
//@Data
public class Purchase {
    
    /**
    * Atributes
    */
    @Id
    @Column(name = "purchaseId")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer purchaseId;
    @Column(name = "customerId")
    private String customerId;
    @Column(name = "date")
    private LocalDateTime date;
    @Column(name = "payMethod")
    private String payMethod;
    @Column(name = "comments")
    private String comments;
    @Column(name = "state")
    private String state;

    /**
     * Relations
    */
    @ManyToOne @JoinColumn(name = "customerId", insertable = false, updatable = false)
    private Customer customer;

    @OneToMany(mappedBy = "product", cascade = {CascadeType.ALL})
    private List<ProductPurchase> product;

    public Integer getPurchaseId() {
        return purchaseId;
    }

    public void setPurchaseId(Integer purchaseId) {
        this.purchaseId = purchaseId;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public void setDate(LocalDateTime date) {
        this.date = date;
    }

    public String getPayMethod() {
        return payMethod;
    }

    public void setPayMethod(String payMethod) {
        this.payMethod = payMethod;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public List<ProductPurchase> getProduct() {
        return product;
    }

    public void setProduct(List<ProductPurchase> product) {
        this.product = product;
    }
}
