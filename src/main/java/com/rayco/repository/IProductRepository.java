package com.rayco.repository;

import com.rayco.model.ProductEntity;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface IProductRepository extends ReactiveMongoRepository<ProductEntity, String> {
}
