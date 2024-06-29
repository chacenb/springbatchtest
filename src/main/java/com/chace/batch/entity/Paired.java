package com.chace.batch.entity;

//import jakarta.persistence.Entity;
//import jakarta.persistence.FetchType;
//import jakarta.persistence.JoinColumn;
//import jakarta.persistence.ManyToOne;
//import jakarta.persistence.OneToMany;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity(name="paired")
@Getter @Setter @AllArgsConstructor @NoArgsConstructor
public class Paired extends _AbstractCommonModel {
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="idligneabonne", foreignKey = @ForeignKey(name = "FK_PAIRED_LIGNE_ABONNE"))
	private LigneAbonne ligneAbonne;
	
	private String numeroappel;
	
	private String numerotechnique;
	
	private Long codeamorce;
	
	private String codepaire;
	
	private String codepon;
	
	private String codebrin;
	
	private String nature;
	
	private String statut;
	
	private String codetransport;

	/* ok */
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="id_carte", foreignKey = @ForeignKey(name = "FK_PAIRED_CARTE"))
	private Carte carte;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="id_sous_repartiteur", foreignKey = @ForeignKey(name = "FK_PAIRED_SOUS_REPARTITEUR"))
	private SousRepartiteur sousRepartiteur;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="idpc", foreignKey = @ForeignKey(name = "FK_PAIRED_POINT_CONCENTRATION"))
	private PointConcentration pointConcentration;

	private Long idcentre;


	/* NumeroSerie.class has been deleted from project  */
//	@OneToMany(mappedBy = "paired")
//	private Set<NumeroSerie> numeroSeries = new HashSet<>();
}
