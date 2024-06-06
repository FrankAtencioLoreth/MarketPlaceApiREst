package com.platziMarket.platziMarket.persistence.entity;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "customers")
@Data
public class Customer {
    
    /**
    * Atributes
    */
    @Id
    @Column(name = "customerId")
    private String customerId;
    @Column(name = "name")
    private String name;
    @Column(name = "lastName")
    private String lastName;
    @Column(name = "telephone")
    private String telephone;
    @Column(name = "address")
    private String address;
    @Column(name = "email")
    private String email;

    /**
     * Relations
    */
    @OneToMany(mappedBy = "customer")
    private List<Purchase> purchase;

    public Customer() {}

    public Customer(String customerId, String name, String lastName, String telephone, String address, String email) {
        this.customerId = customerId;
        this.name = name;
        this.lastName = lastName;
        this.telephone = telephone;
        this.address = address;
        this.email = email;
    }

    

}
