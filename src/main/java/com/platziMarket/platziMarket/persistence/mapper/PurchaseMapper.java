package com.platziMarket.platziMarket.persistence.mapper;

import com.platziMarket.platziMarket.domain.PurchaseDom;
import com.platziMarket.platziMarket.persistence.entity.Purchase;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;

@Mapper(componentModel = "spring", uses = {PurchaseItemMapper.class})
public interface PurchaseMapper {

    @Mappings({
            @Mapping(source = "purchaseId", target = "purchaseIdDom"),
            @Mapping(source = "customerId", target = "customerIdDom"),
            @Mapping(source = "date", target = "dateDom"),
            @Mapping(source = "payMethod", target = "payMethodDom"),
            @Mapping(source = "state", target = "stateDom"),
            @Mapping(source = "product", target = "itemDom")
    })
    PurchaseDom toPurchaseDom(Purchase purchase);

    List<PurchaseDom> toPurchases(List<Purchase> purchaseDomList);

    @InheritInverseConfiguration
    @Mappings({
            @Mapping(target = "customer", ignore = true),
            @Mapping(target = "comments", ignore = true)
    })
    Purchase toPurchase(PurchaseDom purchaseDom);
}
