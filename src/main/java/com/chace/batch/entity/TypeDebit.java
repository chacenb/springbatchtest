package com.chace.batch.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.HashSet;
import java.util.Set;

@Entity(name="type_debit")
@Getter @Setter @AllArgsConstructor @NoArgsConstructor
public class TypeDebit extends _AbstractCommonModel/*AbstractCommonModel2*/{
	@Id @GeneratedValue
	private Long id;
	
	private String nomtypedebit;
	
	
	private Long idcentre;
	
	@OneToMany(mappedBy = "typeDebit")
	private Set<Debit> debits = new HashSet<>();
	
	
}
