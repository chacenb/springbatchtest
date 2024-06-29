package com.chace.batch.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.HashSet;
import java.util.Set;

@Entity(name="type_centre_gabon_telecom")
@Getter @Setter @AllArgsConstructor @NoArgsConstructor
public class TypeCentreGabonTelecom extends _AbstractCommonModel {
	
	private String nom;
	
	private String description;
	
	private String descritpioncentregabontelecom;
	
	private String codetypecentre;
	
	private Long idcentre;
	
	@OneToMany(mappedBy = "typeCentreGabonTelecom")
	private Set<CentreGabonTelecom> centreGabonTelecoms = new HashSet<>();
}
