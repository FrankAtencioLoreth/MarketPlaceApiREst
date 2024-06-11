package com.platziMarket.platziMarket.domain.service;

import com.platziMarket.platziMarket.domain.PurchaseDom;
import com.platziMarket.platziMarket.domain.repository.PurchaseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PurchaseService {

    @Autowired
    private PurchaseRepository purchaseRepository;

    public List<PurchaseDom> getAll() {
        return this.purchaseRepository.getAll();
    }

    public Optional<List<PurchaseDom>> getByClient(String customerId) {
        return this.purchaseRepository.getByClient(customerId);
    }

    public PurchaseDom save(PurchaseDom purchaseDom) {
        return this.purchaseRepository.save(purchaseDom);
    }


}
