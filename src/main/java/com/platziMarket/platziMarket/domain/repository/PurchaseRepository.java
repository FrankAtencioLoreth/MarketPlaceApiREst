package com.platziMarket.platziMarket.domain.repository;

import com.platziMarket.platziMarket.domain.PurchaseDom;

import java.util.List;
import java.util.Optional;

public interface PurchaseRepository {

    List<PurchaseDom> getAll();
    Optional<List<PurchaseDom>> getByClient(String customerId);
    PurchaseDom save(PurchaseDom purchaseDom);

}
