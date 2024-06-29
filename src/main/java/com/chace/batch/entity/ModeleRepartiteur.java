package com.chace.batch.entity;


import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity(name="modele_repartiteur")
@Getter @Setter @AllArgsConstructor @NoArgsConstructor
public class ModeleRepartiteur extends _AbstractCommonModel {
	
	private String nom;
	
	private String description;
	
}
