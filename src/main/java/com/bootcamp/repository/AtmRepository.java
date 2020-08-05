package com.bootcamp.repository;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

import com.bootcamp.entity.Atm;

public interface AtmRepository extends ReactiveMongoRepository<Atm, String> {
 
}
