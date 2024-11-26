package com.rayco.repository;

import com.rayco.model.PersonEntity;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IPersonRepository extends ReactiveMongoRepository<PersonEntity, String> {
}
