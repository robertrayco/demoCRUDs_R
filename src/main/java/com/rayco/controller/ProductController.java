package com.rayco.controller;

import com.rayco.model.ProductEntity;
import com.rayco.service.IPersonService;
import com.rayco.service.IProductService;
import com.rayco.service.ProductServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/api")
public class ProductController {

    @Autowired
    IProductService prodServ;

    @GetMapping("/getAllProduct")
    public Flux<ProductEntity> getAllProduct(){
        return prodServ.getFillProduct();
    }

    @PostMapping("/saveProduct")
    public Mono<ProductEntity> save(@RequestBody ProductEntity prod){
        return prodServ.saveProduct(prod);
    }

    @GetMapping("/getAllProductByStock/{stock}")
    public Flux<ProductEntity> getProductoByStock(@PathVariable("stock") int stok){
        return prodServ.getFillProductByStock(stok);
    }

}
