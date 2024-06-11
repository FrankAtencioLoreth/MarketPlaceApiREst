package com.platziMarket.platziMarket.web.controller;

import com.platziMarket.platziMarket.domain.ProductDom;
import com.platziMarket.platziMarket.domain.service.ProductService;
import org.apache.coyote.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/products")
public class ProductController {

    @Autowired
    private ProductService productService;

    @GetMapping("/all")
    public ResponseEntity<List<ProductDom>> getAll() {
        return new ResponseEntity<>(
                this.productService.getAll(),
                HttpStatus.OK
        );
    }

    @GetMapping("/{id}")
    public ResponseEntity<ProductDom> getProduct(@PathVariable("id") int id) {
        return this.productService.getProduct(id).map(prod -> new ResponseEntity<>(
                prod, HttpStatus.OK
        )).orElse(
                new ResponseEntity<>(HttpStatus.NOT_FOUND)
        );
    }

    @GetMapping("/category/{id}")
    public ResponseEntity<List<ProductDom>> getByCategory(@PathVariable("id") int id) {
        return this.productService.getByCategory(id)
                .map(prod -> new ResponseEntity<>(prod, HttpStatus.OK))
                .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @PostMapping("/save")
    public ResponseEntity<ProductDom> save(@RequestBody ProductDom productDom) {
        return new ResponseEntity<>(
                this.productService.save(productDom),
                HttpStatus.CREATED
        );
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity delete(@PathVariable("id") int id) {
        if(this.productService.delete(id))
            return new ResponseEntity(HttpStatus.OK);
        else
            return new ResponseEntity(HttpStatus.NOT_FOUND);

    }
}