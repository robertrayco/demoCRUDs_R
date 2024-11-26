package com.rayco.service;

import com.rayco.model.PersonEntity;
import com.rayco.repository.IPersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class PersonServiceImp implements IPersonService {

    @Autowired
    IPersonRepository repo;

    @Override
    public Flux<PersonEntity> findAll() {
        return repo.findAll();
    }

    @Override
    public Mono<PersonEntity> save(PersonEntity person) {
        return repo.save(person);
    }

    @Override
    public Flux<PersonEntity> findPersonByEdad(int edad) {
        return repo.findAll()
                .filter(x -> x.getEdad()==edad);
    }
}
