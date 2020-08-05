package com.bootcamp.entity;

import java.io.Serializable;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Data
@Document
public class Atm  implements Serializable{
	
	/**
	 * 
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public  static double availableBalance = 5000;

	@Id
	private String idAtm;
	private String idBank;
	

	

}
