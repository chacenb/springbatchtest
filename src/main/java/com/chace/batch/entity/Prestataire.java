package com.chace.batch.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.HashSet;
import java.util.Set;

@Entity(name="prestataire")
@Getter @Setter @AllArgsConstructor @NoArgsConstructor
public class Prestataire extends _AbstractCommonModel {
	
	private String codeprestataire;
	
	private String nomprestataire;
	
	private String adressemail;
	
	private String telephone;
	
	private String responsable;
	
	private String adresse;
	
	private Boolean boo_desac;
	
	private Long idcentre;
	
	@OneToMany(mappedBy = "prestataire")
	private Set<Technicien> techniciens = new HashSet<>();
}
