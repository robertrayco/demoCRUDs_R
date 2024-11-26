package com.rayco.service;

import com.rayco.model.ProductEntity;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface IProductService {

    Flux<ProductEntity> getFillProduct();

    Mono<ProductEntity> saveProduct(ProductEntity prod);

    Flux<ProductEntity> getFillProductByStock(Integer stock);


}
