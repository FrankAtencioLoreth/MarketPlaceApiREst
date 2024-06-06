package com.platziMarket.platziMarket.persistence.entity;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "purchase")
@Data
public class Purchase {
    
    /**
    * Atributes
    */
    @Id
    @Column(name = "purchaseId")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Integer purchaseId;
    @Column(name = "customerId")
    public String customerId;
    @Column(name = "date")
    public String date;
    @Column(name = "payMethod")
    public String payMethod;
    @Column(name = "comments")
    public String comments;
    @Column(name = "state")
    public Boolean state;

    /**
     * Relations
    */
    @ManyToOne @JoinColumn(name = "customerId", insertable = false, updatable = false)
    private Customer customer;

    @OneToMany(mappedBy = "product")
    private List<Product> products;

    public Purchase() {}

    public Purchase(Integer purchaseId, String customerId, String date, String payMethod, String comments, Boolean state) {
        this.purchaseId = purchaseId;
        this.customerId = customerId;
        this.date = date;
        this.payMethod = payMethod;
        this.comments = comments;
        this.state = state;
    }
    
}
