package com.chace.batch.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.HashSet;
import java.util.Set;

@Entity(name="type_repartiteur")
@Getter @Setter @AllArgsConstructor @NoArgsConstructor
public class TypeRepartiteur extends _AbstractCommonModel {
	
	private String nomtyperepartiteur;
	
	private Long idcentre;
	
	@OneToMany(mappedBy = "typeRepartiteur")
	private Set<Repartiteur> repartiteurs = new HashSet<>();
}
