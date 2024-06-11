package com.platziMarket.platziMarket.web.controller;

import com.platziMarket.platziMarket.domain.ProductDom;
import com.platziMarket.platziMarket.domain.PurchaseDom;
import com.platziMarket.platziMarket.domain.service.PurchaseService;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/purchases")
public class PurchaseController {

    @Autowired
    PurchaseService purchaseService;

    @PostMapping("/save")
    public ResponseEntity<PurchaseDom> save(@RequestBody PurchaseDom purchaseDom) {
        return new ResponseEntity<>(this.purchaseService.save(purchaseDom), HttpStatus.CREATED);
    }

    @GetMapping("/all")
    @ApiOperation("Get all purchases")
    @ApiResponse(code = 200, message = "OK")
    public ResponseEntity<List<PurchaseDom>> getAll() {
        return new ResponseEntity<>(this.purchaseService.getAll(), HttpStatus.OK);
    }

    @GetMapping("customer/{id}")
    @ApiOperation("Get purchases by customer id")
    @ApiResponses({
            @ApiResponse(code = 200, message = "OK"),
            @ApiResponse(code = 404, message = "NOT FOUND"),
    })
    public ResponseEntity<List<PurchaseDom>> getById(@ApiParam(value = "id of the customer", required = true, example = "9") @PathVariable("id") String id) {
        return this.purchaseService.getByClient(id)
                .map(p -> new ResponseEntity<>(p, HttpStatus.OK))
        .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

}
