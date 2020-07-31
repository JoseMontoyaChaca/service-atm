package com.bootcamp.repository;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

import com.bootcamp.entity.Withdrawals;

public interface WithdrawalsInterface extends ReactiveMongoRepository<Withdrawals, String>{

}
