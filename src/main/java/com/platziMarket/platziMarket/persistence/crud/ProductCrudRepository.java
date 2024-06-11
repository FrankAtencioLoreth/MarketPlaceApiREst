package com.platziMarket.platziMarket.persistence.crud;

import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.platziMarket.platziMarket.persistence.entity.Product;

public interface ProductCrudRepository extends CrudRepository<Product, Integer>{
    
    
    //Native query
    //@Query (value = "SELECT * FROM categories WHERE categoryId = ?", nativeQuery = true)
    //Query methods. Queries without sql
    List<Product> findByCategoryIdOrderByNameAsc(int categoryId);
    Optional<List<Product>> findByStockLessThanAndState(int stock, boolean state);
}
