package com.bootcamp.respository;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;

import com.bootcamp.entity.Atm;

@Repository
public interface AtmRepository extends ReactiveMongoRepository<Atm, String>{

}
