package com.rayco.controller;

import com.rayco.model.PersonEntity;
import com.rayco.service.IPersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/api")
public class PersonController {
    @Autowired
    IPersonService personService;

    @GetMapping("/getPersons")
    public Flux<PersonEntity> getPersons(){
        return personService.findAll();
    }

    @PostMapping("/savePerson")
    public Mono<PersonEntity> save(@RequestBody PersonEntity person){
        return personService.save(person);
    }

    @GetMapping("/getPersonsByEdad/{edad}")
    public Flux<PersonEntity> getPersonByEdad(@PathVariable("edad") int edad){
        return personService.findPersonByEdad(edad);
    }

    @PostMapping("/updatePerson")
    public Mono<PersonEntity> updatePerson(@RequestBody PersonEntity person){
        return personService.update(person);
    }

    @DeleteMapping("/deletePerson/{id}")
    public void deletePerson(@PathVariable("id") String id){
        personService.delete(id);
    }

}
