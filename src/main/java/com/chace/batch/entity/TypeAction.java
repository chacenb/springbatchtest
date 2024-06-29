package com.chace.batch.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.HashSet;
import java.util.Set;

@Entity(name="type_action")
@Getter @Setter @AllArgsConstructor @NoArgsConstructor
public class TypeAction extends _AbstractCommonModel {
	
	private String nomtypeaction;
	
	private Long idcentre;
	
	@OneToMany(mappedBy = "typeAction1")
	private Set<Derangement> derangements = new HashSet<>();
	
}
