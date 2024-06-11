package com.platziMarket.platziMarket.persistence.crud;

import com.platziMarket.platziMarket.persistence.entity.Purchase;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface PurchaseCrudRepository extends CrudRepository<Purchase, Integer> {

    Optional<List<Purchase>> findByCustomerId(String customerId);
}
