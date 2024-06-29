package com.chace.batch.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.ZonedDateTime;

@Entity(name = "historique_ligne_abonne")
@Getter @Setter @AllArgsConstructor @NoArgsConstructor
public class HistoriqueLigneAbonne extends _AbstractCommonModel {
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="id_abonne", foreignKey = @ForeignKey(name = "FK_HISTORIQUE_LIGNE_ABONNE_ABONNE"))
	private Abonne abonne;

	/* OK */
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="id_ville", foreignKey = @ForeignKey(name = "FK_HISTORIQUE_LIGNE_ABONNE_VILLE"))
	private Ville ville;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="idligne", foreignKey = @ForeignKey(name = "FK_HISTORIQUE_LIGNE_ABONNE_LIGNE"))
	private Ligne ligne;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="iddebit", foreignKey = @ForeignKey(name = "FK_HISTORIQUE_LIGNE_ABONNE_DEBIT"))
	private Debit debit;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="idequipement", foreignKey = @ForeignKey(name = "FK_HISTORIQUE_LIGNE_ABONNE_EQUIPEMENT"))
	private Equipement equipement;
	
	private ZonedDateTime datedemandeligneabonne;
	
	private String typeligne;
	
	private String renvoi;
	
	private String portvoix;
	
	private String natureinternet;
	
	private String identifiantinternet;
	
	private String motdepasseinternet;
	
	private String etatligneabonne;
	
	private String zoneligneabonne;
	
	private String portdata;
	
	private String adresseip;
	
	private String numeroserie;
	
	private String numligneinternet;
	
	private String typeligneinternet;
	
	private String statutcommercialligne;
	
	private ZonedDateTime  datedemandeligneinternet;
	
	private ZonedDateTime  dateattributionligneinternet;
	
	private String service;
	
	private String adresseabonne;
	
	private String abonnecontact1;
	
	private String abonnecontact2;
	
	private String emailabonne;
	
	private Double latligneabonne;
	
	private Double longligneabonne;
	
	private String natureligneinternet;
	
	private String statuttechniqueligne;
	
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="idpc", foreignKey = @ForeignKey(name = "FK_HISTORIQUE_LIGNE_ABONNE_POINT_CONCENTRATION"))
	private PointConcentration pointConcentration;

	/* OK */
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="idtransport", foreignKey = @ForeignKey(name = "FK_HISTORIQUE_LIGNE_ABONNE_CARTE"))
	private Carte carte;
	
	private Long iddistribution;
	
	private Long idagence;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="id_plan_tarifaire", foreignKey = @ForeignKey(name = "FK_HISTORIQUE_LIGNE_ABONNE_PLAN_TARIFAIRE"))
	private PlanTarifaire planTarifaire;
	
	private String num_equipement;
	
	private Boolean est_resilie;
	
	private Long idcentre;
}
