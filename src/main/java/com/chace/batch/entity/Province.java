package com.chace.batch.entity;


import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.HashSet;
import java.util.Set;

@Entity(name="province")
@Getter @Setter @AllArgsConstructor @NoArgsConstructor
public class Province extends _AbstractCommonModel {
	
	private String codeprovince;
	
	private String descriptionprovince;
	
	private double latprovince;
	
	private double longprovince;
	
	private Long idcentre;
	
	@OneToMany(mappedBy = "province")
	private Set<Ville> ville = new HashSet<>();
	
}
