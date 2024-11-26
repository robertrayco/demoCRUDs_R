package com.rayco.service;

import com.rayco.model.PersonEntity;
import com.rayco.model.ProductEntity;
import com.rayco.repository.IProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class ProductServiceImp implements IProductService{

    @Autowired
    IProductRepository prodRepo;

    @Override
    public Flux<ProductEntity> getFillProduct() {
        return prodRepo.findAll();
    }

    @Override
    public Mono<ProductEntity> saveProduct(ProductEntity prod) {
        return prodRepo.save(prod);
    }

    @Override
    public Flux<ProductEntity> getFillProductByStock(Integer stock) {
        return prodRepo.findAll()
                .filter(x ->x.getStock()==stock);
    }
}
