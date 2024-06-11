package com.platziMarket.platziMarket.domain.service;

import com.platziMarket.platziMarket.domain.ProductDom;
import com.platziMarket.platziMarket.domain.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    public List<ProductDom> getAll() {
        return productRepository.getAll();
    }

    public Optional<ProductDom> getProduct(int id) {
        return productRepository.getProduct(id);
    }

    public Optional<List<ProductDom>> getByCategory(int id) {
        return productRepository.getByCategory(id);
    }

    public ProductDom save(ProductDom product) {
        return productRepository.save(product);
    }

    public boolean delete(int id) {
        return this.getProduct(id).map(
                prod -> {
                    productRepository.delete(id);
                    return true;
                }).orElse(false);
    }
}
