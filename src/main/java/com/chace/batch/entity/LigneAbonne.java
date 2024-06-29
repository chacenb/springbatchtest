package com.chace.batch.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.ZonedDateTime;
import java.util.Set;

/* NORMALIZED */
@Entity(name = "ligne_abonne")
@Getter @Setter @AllArgsConstructor @NoArgsConstructor
public class LigneAbonne extends _AbstractCommonModel {

  @ManyToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "id_abonne", foreignKey = @ForeignKey(name = "FK_LIGNE_ABONNE_ABONNE"))
  private Abonne abonne;

  @ManyToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "id_ville", foreignKey = @ForeignKey(name = "FK_LIGNE_ABONNE_VILLE"))
  private Ville ville;

  @ManyToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "id_ligne", foreignKey = @ForeignKey(name = "FK_LIGNE_ABONNE_LIGNE"))
  private Ligne ligne;

  @ManyToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "id_debit", foreignKey = @ForeignKey(name = "FK_LIGNE_ABONNE_DEBIT"))
  private Debit debit;

  @ManyToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "id_equipement", foreignKey = @ForeignKey(name = "FK_LIGNE_ABONNE_EQUIPEMENT"))
  private Equipement equipement;

  @Column(name = "datedemandeligneabonne")
  private ZonedDateTime dateDemandeLigneAbonne;

  @Column(name = "typeligne")
  private String typeLigne;

  private String renvoi;

  @Column(name = "portvoix")
  private String portVoix;

  @Column(name = "natureinternet")
  private String natureInternet;

  @Column(name = "identifiantinternet")
  private String identifiantInternet;

  @Column(name = "motdepasseinternet")
  private String motDePasseInternet;

  @Column(name = "etatligneabonne")
  private String etatLigneAbonne;

  @Column(name = "zoneligneabonne")
  private String zoneLigneAbonne;

  @Column(name = "portdata")
  private String portData;

  @Column(name = "adresseip")
  private String adresseIp;

  @Column(name = "numeroserie")
  private String numeroSerie;

  @Column(name = "numligneinternet")
  private String numLigneInternet;

  @Column(name = "typeligneinternet")
  private String typeLigneInternet;

  @Column(name = "statutcommercialligne")
  private String statutCommercialLigne;

  @Column(name = "datedemandeligneinternet")
  private ZonedDateTime dateDemandeLigneInternet;

  @Column(name = "dateattributionligneinternet")
  private ZonedDateTime dateAttributionLigneInternet;

  private String service;

  @Column(name = "adresseabonne")
  private String adresseAbonne;

  @Column(name = "abonnecontact1")
  private String abonneContact1;

  @Column(name = "abonnecontact2")
  private String abonneContact2;

  @Column(name = "emailabonne")
  private String emailAbonne;

  @Column(name = "latligneabonne")
  private Double latLigneAbonne;

  @Column(name = "longligneabonne")
  private Double longLigneAbonne;

  @Column(name = "natureligneinternet")
  private String natureLigneInternet;

  @Column(name = "statuttechniqueligne")
  private String statutTechniqueLigne;

  @ManyToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "id_pc", foreignKey = @ForeignKey(name = "FK_LIGNE_ABONNE_POINT_CONCENTRATION"))
  private PointConcentration pointConcentration;

  @ManyToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "id_transport", foreignKey = @ForeignKey(name = "FK_LIGNE_ABONNE_CARTE"))
  private Carte carte;

  private Long iddistribution;

  private Long idagence;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="id_plan_tarifaire", foreignKey = @ForeignKey(name = "FK_LIGNE_ABONNE_PLAN_TARIFAIRE"))
	private PlanTarifaire planTarifaire;

  @ManyToOne(fetch = FetchType.LAZY) /* many to one unidirectional relationship with the centre technique */
  @JoinColumn(name = "id_centre", foreignKey = @ForeignKey(name = "FK_LIGNE_ABONNE_CENTRE_TECHNIQUE"))
  private CentreTechnique centreTechnique;

  @Column(name = "est_resilie")
  private Boolean estResilie;

  @Column(name = "num_equipement")
  private String numEquipement;

  @OneToMany(mappedBy = "ligneAbonne")
  private Set<Paired> paireds;

}
