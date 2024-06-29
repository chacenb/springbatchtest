package com.chace.batch.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.ZonedDateTime;
import java.util.HashSet;
import java.util.Set;

@Entity(name = "derangement")
@Getter @Setter @AllArgsConstructor @NoArgsConstructor
public class Derangement extends _AbstractCommonModel {

  /* OK */
  @ManyToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "id_utilisateur", foreignKey = @ForeignKey(name = "FK_DERANGEMENT_UTILISATEUR"))
  private Utilisateur utilisateur;

  @ManyToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "id_sous_repartiteur", foreignKey = @ForeignKey(name = "FK_DERANGEMENT_SOUS_REPARTITEUR"))
  private SousRepartiteur sousRepartiteur;

  @ManyToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "id_type_action", foreignKey = @ForeignKey(name = "FK_DERANGEMENT_TYPE_ACTION"))
  private TypeAction typeAction1;

  private String typeligne;

  private ZonedDateTime  datedemande;

  private String agentemetteur;

  private Long agence;

  private String etatderangement;

  private String observation;

  private String statutplanification;

  private String typeaction;

  private String statutderangement;

  @ManyToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "idligne", foreignKey = @ForeignKey(name = "FK_DERANGEMENT_LIGNE"))
  private Ligne ligne;

  private String numderangement;

  private String typederangement;

  private String naturederangement;

  @ManyToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "idequipement", foreignKey = @ForeignKey(name = "FK_DERANGEMENT_EQUIPEMENT"))
  private Equipement equipement;

  @ManyToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "idtechnicien", foreignKey = @ForeignKey(name = "FK_DERANGEMENT_TECHNICIEN"))
  private Technicien technicien;

  private ZonedDateTime dateremise;

  private ZonedDateTime  dateretour;

  private ZonedDateTime  datemiseenservice;

  @ManyToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "idcause", foreignKey = @ForeignKey(name = "FK_DERANGEMENT_CAUSE"))
  private Cause cause;

  @ManyToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "idcauseretour", foreignKey = @ForeignKey(name = "FK_DERANGEMENT_CAUSE_RETOUR"))
  private Cause causeretour;

  private String contactemetteur;

  private ZonedDateTime  datesaisie;

  @Lob
//	@Type(type="org.hibernate.type.BinaryType") // becomes  @Convert(converter=byte.class)
  private Byte[] signature_client;
//	
//	@Lob
//	@Type(type="org.hibernate.type.BinaryType")
//	private Byte[] signature_tech;

  private Long idcentre;

  @OneToMany(mappedBy = "derangement")
  private Set<HistoriqueDerangement> historiqueDerangements = new HashSet<>();

}
