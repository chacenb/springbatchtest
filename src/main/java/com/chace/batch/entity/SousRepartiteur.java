package com.chace.batch.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.HashSet;
import java.util.Set;

@Entity(name="sous_repartiteur")
@Getter @Setter @AllArgsConstructor @NoArgsConstructor
public class SousRepartiteur extends _AbstractCommonModel {
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="idrepartiteur", foreignKey = @ForeignKey(name = "FK_SOUS_SOUS_REPARTITEUR_REPARTITEUR"))
	private Repartiteur repartiteur;

	/* ok */
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="id_carte", foreignKey = @ForeignKey(name = "FK_SOUS_REPARTITEUR_CARTE"))
	private Carte carte;
	
	private String codesousrepartiteur;
	
	private String descriptionsousrepartiteur;
	
	private Double latsousrepartiteur;
	
	private Double longsousrepartiteur;
	
	private Long idcentre;
	
	@OneToMany(mappedBy = "sousRepartiteur")
	private Set<CarteTransporteSousRepartiteur> carteTransporteSousRepartiteurs = new HashSet<>();
	
	@OneToMany(mappedBy = "sousRepartiteur")
	private Set<Derangement> derangements = new HashSet<>();
	
	@OneToMany(mappedBy = "sousRepartiteur")
	private Set<HistoriqueDerangement> historiqueDerangements = new HashSet<>();
	
	@OneToMany(mappedBy = "sousRepartiteur")
	private Set<HistoriqueOcot> historiqueOcots = new HashSet<>();
	
	@OneToMany(mappedBy = "sousRepartiteur")
	private Set<Pairet> pairets = new HashSet<>();
	
	@OneToMany(mappedBy = "sousRepartiteur")
	private Set<PointConcentration> pointConcentrateurs = new HashSet<>();
	
	@OneToMany(mappedBy = "sousRepartiteur")
	private Set<Carte> cartes = new HashSet<>();
	
}
