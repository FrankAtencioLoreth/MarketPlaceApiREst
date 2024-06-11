package com.platziMarket.platziMarket.persistence.mapper;

import com.platziMarket.platziMarket.domain.PurchaseItemDom;
import com.platziMarket.platziMarket.persistence.entity.ProductPurchase;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

@Mapper(componentModel = "spring")
public interface PurchaseItemMapper {

    @Mappings({
            @Mapping(source = "id.productId", target = "productIdDom"),
            @Mapping(source = "quantity", target = "quantityDom"),
            @Mapping(source = "total", target = "totalDom"),
            @Mapping(source = "state", target = "activeDom")
    })
    PurchaseItemDom toPurchaseItemDom(ProductPurchase productPurchase);

    @InheritInverseConfiguration
    @Mappings({
            @Mapping(target = "purchase", ignore = true),
            @Mapping(target = "product", ignore = true),
            @Mapping(target = "id.productId", ignore = true)
    })
    ProductPurchase toProductPurchase(PurchaseItemDom purchaseItemDom);
}
