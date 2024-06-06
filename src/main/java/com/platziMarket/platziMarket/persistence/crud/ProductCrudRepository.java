package com.platziMarket.platziMarket.persistence.crud;

import org.springframework.data.repository.CrudRepository;

import com.platziMarket.platziMarket.persistence.entity.Product;

public interface ProductCrudRepository extends CrudRepository<Product, Integer>{
    
}
