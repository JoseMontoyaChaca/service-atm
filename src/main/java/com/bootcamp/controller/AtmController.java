package com.bootcamp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bootcamp.entity.BankAccountDto;
import com.bootcamp.service.AtmService;

import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/atm")
public class AtmController {
	
	
	@Autowired
	AtmService service;
	
	
	@PostMapping("/deposit/{dniCustomer}/{accountNumber}/{amount}")
	public Mono<BankAccountDto> depositAtm (@PathVariable String dniCustomer,@PathVariable String accountNumber ,@PathVariable double amount){
		return service.deposit(dniCustomer, accountNumber, amount);
	}
	
	//Withdrawal 
	@PostMapping("/withdrawal/{dniCustomer}/{accountNumber}/{amount}")
	public Mono<BankAccountDto> withdrawaltBankAccount (@PathVariable String dniCustomer,@PathVariable String accountNumber ,@PathVariable double amount){		
		return service.withdrawal(dniCustomer,accountNumber,amount);
	}

}
