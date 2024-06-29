package com.chace.batch.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;
import java.math.BigInteger;


@Getter @Setter @AllArgsConstructor @NoArgsConstructor

public class Port{
	
	private String défectueuse;
	private String allouée;
	private String occupée;
	private String libre;
	private BigInteger nombre;
	private BigInteger total;
	private BigDecimal tautOcuppation;

	
	
	
	
}
