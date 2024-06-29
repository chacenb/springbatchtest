package com.chace.batch.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Set;

@Entity(name="ressource")
@Getter @Setter @AllArgsConstructor @NoArgsConstructor
public class Ressource extends _AbstractCommonModel {
	
	private String code;
	
	private String nomressource;
	
	private Long idcentre;


	/* OK */
	@OneToMany(mappedBy = "ressource")
	private Set<Autorisation> autorisations;	// = new HashSet<>();
	
}
