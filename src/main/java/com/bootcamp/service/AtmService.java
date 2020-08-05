package com.bootcamp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import com.bootcamp.entity.BankAccountDto;
import com.bootcamp.repository.AtmRepository;
import reactor.core.publisher.Mono;

@Service
public class AtmService {
	
	@Autowired
	AtmRepository repository;
	
	
	private WebClient bankAccount = WebClient.create("htpp://localhost:8072/bankAccount");

	
	public Mono<BankAccountDto> deposit (String dniCustomer, String accountNumber , double amount){
		 Mono<BankAccountDto>  mono = bankAccount.post()
			.uri("/deposit/{dniCustomer}/{accountNumber}/{amount}",dniCustomer,accountNumber,amount)
			.accept(MediaType.APPLICATION_JSON)
			.retrieve()
			.bodyToMono(BankAccountDto.class)
			.map(d -> {
				if(d.getAvailableBalance() < amount){
			 		return null;
		 		}
					d.setAvailableBalance(d.getAvailableBalance() - amount);
					return d;
			
			});
		 			return mono;
	}
	
	
	public Mono<BankAccountDto> withdrawal (String dniCustomer, String accountNumber , double amount){
		 Mono<BankAccountDto>  mono = bankAccount.post()
			.uri("/withdrawal/{dniCustomer}/{accountNumber}/{amount}",dniCustomer,accountNumber,amount)
			.accept(MediaType.APPLICATION_JSON)
			.retrieve()
			.bodyToMono(BankAccountDto.class)
			.map(d -> {
				if(d.getAvailableBalance() < amount){
			 		return null;
		 		}
					d.setAvailableBalance(d.getAvailableBalance() - amount);
					return d;
			
			});
		 			return mono;
	}
	


}
