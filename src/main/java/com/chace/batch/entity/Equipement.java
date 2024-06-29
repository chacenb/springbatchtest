package com.chace.batch.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.HashSet;
import java.util.Set;

@Entity(name="equipement")
@Getter @Setter @AllArgsConstructor @NoArgsConstructor
public class Equipement extends _AbstractCommonModel {
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="id_repartiteur", foreignKey = @ForeignKey(name = "FK_EQUIPEMENT_REPARTITEUR"))
	private Repartiteur repartiteur;
	
	private String numequipement;
	
	private String statutequipement;
	
	private Long idcentre;
	
	@OneToMany(mappedBy = "equipement")
	private Set<Derangement> derangements = new HashSet<>();
	
	@OneToMany(mappedBy = "equipement")
	private Set<HistoriqueDerangement> historiqueDerangements = new HashSet<>();
	
	@OneToMany(mappedBy = "equipement")
	private Set<HistoriqueLigneAbonne> historiqueLigneAbonnes = new HashSet<>();
	
	@OneToMany(mappedBy = "equipement")
	private Set<LigneAbonne> ligneAbonnes = new HashSet<>();
	
//	@OneToMany(mappedBy = "equipement")
//	private Set<Operation> operations = new HashSet<>();
	
}
