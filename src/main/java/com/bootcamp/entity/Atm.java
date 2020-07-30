package com.bootcamp.entity;

import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
@Document
public class Atm {

	private String id;
	private String name;
	
}
