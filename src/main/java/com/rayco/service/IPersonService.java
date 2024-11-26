package com.rayco.service;

import com.rayco.model.PersonEntity;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface IPersonService {

    Flux<PersonEntity> findAll();

    Mono<PersonEntity> save(PersonEntity person);

    Flux<PersonEntity> findPersonByEdad(int edad);
}
