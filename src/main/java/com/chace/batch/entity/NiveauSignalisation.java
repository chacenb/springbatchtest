package com.chace.batch.entity;

import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity(name="niveau_signalisation")
@Getter @Setter @AllArgsConstructor @NoArgsConstructor
public class NiveauSignalisation extends _AbstractCommonModel {
	
	private String libelle;
	
	private String taux;
}
