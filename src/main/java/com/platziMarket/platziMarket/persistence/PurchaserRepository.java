package com.platziMarket.platziMarket.persistence;

import com.platziMarket.platziMarket.domain.PurchaseDom;
import com.platziMarket.platziMarket.domain.repository.PurchaseRepository;
import com.platziMarket.platziMarket.persistence.crud.PurchaseCrudRepository;
import com.platziMarket.platziMarket.persistence.entity.Purchase;
import com.platziMarket.platziMarket.persistence.mapper.PurchaseMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class PurchaserRepository implements PurchaseRepository {

    @Autowired
    private PurchaseCrudRepository purchaseCrudRepository;
    @Autowired
    private PurchaseMapper purchaseMapper;

    @Override
    public List<PurchaseDom> getAll() {
        return this.purchaseMapper.toPurchases((List<Purchase>) this.purchaseCrudRepository.findAll());
    }

    @Override
    public Optional<List<PurchaseDom>> getByClient(String id) {
        return this.purchaseCrudRepository.findByCustomerId(id)
                .map(purchases -> this.purchaseMapper.toPurchases(purchases));
    }

    @Override
    public PurchaseDom save(PurchaseDom purchaseDom) {
        Purchase purchase =  this.purchaseMapper.toPurchase(purchaseDom);
        purchase.getProduct().forEach(product -> product.setPurchase(purchase));
        return this.purchaseMapper.toPurchaseDom(this.purchaseCrudRepository.save(purchase));
    }
}
