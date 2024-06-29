package com.chace.batch.entity;


import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.HashSet;
import java.util.Set;

@Entity(name="origine")
@Getter @Setter @AllArgsConstructor @NoArgsConstructor
public class Origine extends _AbstractCommonModel {
	
	private String codeorigine;
	
	private String descriptionorigine;
	
	private Long idcentre;
	
	@OneToMany(mappedBy = "origine")
	private Set<Cause> causes = new HashSet<>();
	
	@OneToMany(mappedBy = "origine")
	private Set<CauseDerangement> causeDerangements = new HashSet<>();
	
}
