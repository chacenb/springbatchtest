package com.chace.batch.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.HashSet;
import java.util.Set;

@Entity(name="ligne")
@Getter @Setter @AllArgsConstructor @NoArgsConstructor
public class Ligne extends _AbstractCommonModel {
	
	private String statutcommercialligne;
	
	private String numligne;
	
	private String statuttechniqueligne;
	
	private Long idcentre;
	
	@OneToMany(mappedBy = "ligne")
	private Set<Derangement> derangements = new HashSet<>();
	
	@OneToMany(mappedBy = "ligne")
	private Set<HistoriqueLigneAbonne> historiqueLigneAbonnes = new HashSet<>();
	
	@OneToMany(mappedBy = "ligne")
	private Set<HistoriqueOcot> historiqueOcotsapres = new HashSet<>();
	
	@OneToMany(mappedBy = "ligne")
	private Set<LigneAbonne> ligneAbonnes = new HashSet<>();
	
	@OneToMany(mappedBy = "ligne")
	private Set<Operation> operations = new HashSet<>();
	
}
