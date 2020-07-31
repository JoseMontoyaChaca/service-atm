package com.bootcamp.repository;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import com.bootcamp.entity.Deposit;

public interface DepositInterface extends ReactiveMongoRepository<Deposit, String>{

}
