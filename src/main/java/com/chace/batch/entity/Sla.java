package com.chace.batch.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.HashSet;
import java.util.Set;

@Entity(name="sla")
@Getter @Setter @AllArgsConstructor @NoArgsConstructor
public class Sla extends _AbstractCommonModel {
	
	private String libelle;
	
	private Long duree;
	
	private Long idcentre;
	
	@OneToMany(mappedBy = "sla")
	private Set<Operation> operations = new HashSet<>();
}
