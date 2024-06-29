package com.chace.batch.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.ZonedDateTime;
import java.util.Set;

/* NORMALIZED */
@Entity(name = "operation")
@Getter @Setter @AllArgsConstructor @NoArgsConstructor
public class Operation extends _AbstractCommonModel {

  @Column(name = "numoperation")
  private String numOperation;

  @Column(name = "typeligne")
  private String typeLigne;

  @Column(name = "datedemande")
  private ZonedDateTime dateDemande;

  @Column(name = "dateremise")
  private ZonedDateTime dateRemise;

  @Column(name = "datemiseenservice")
  private ZonedDateTime dateMiseEnService;

  @Column(name = "agentemetteur")
  private String agentEmetteur;

  private Long agence;

  @Column(name = "etatoperation")
  private String etatOperation;

  @Column(name = "statutplanification")
  private String statutPlanification;

  private String observation;

  @Column(name = "typeoperation")
  private String typeOperation;

  @Column(name = "dateretour")
  private ZonedDateTime dateRetour;

  private Long transport1;

  @Column(name = "natureligneinternet")
  private String natureLigneInternet;

  private Long distribution1;

  @Column(name = "datesaisie")
  private ZonedDateTime dateSaisie;

  @ManyToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "id_technicien", foreignKey = @ForeignKey(name = "FK_OPERATION_TECHNICIEN"))
  private Technicien technicien;

  @ManyToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "id_motif", foreignKey = @ForeignKey(name = "FK_OPERATION_MOTIF"))
  private Cause cause;

  @ManyToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "id_ligne", foreignKey = @ForeignKey(name = "FK_OPERATION_LIGNE"))
  private Ligne ligne;

  private String renvoi;

  @ManyToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "id_equipement", foreignKey = @ForeignKey(name = "FK_OPERATION_EQUIPEMENT"))
  private Equipement equipement;

  /* ok */
  @ManyToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "id_abonne", foreignKey = @ForeignKey(name = "FK_OPERATION_ABONNE"))
  private Abonne abonne;


  @ManyToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "id_plan_tarifaire", foreignKey = @ForeignKey(name = "FK_OPERATION_PLAN_TARIFAIRE"))
  private PlanTarifaire planTarifaire;

  private String adresse;

  @ManyToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "id_debit", foreignKey = @ForeignKey(name = "FK_OPERATION_DEBIT"))
  private Debit debit;

  @ManyToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "id_point_concentration", foreignKey = @ForeignKey(name = "FK_OPERATION_POINT_CONCENTRATION"))
  private PointConcentration pointConcentration;

  @Column(name = "motdepasseinternet")
  private String motDePasseInternet;

  @Column(name = "identifiantinternet")
  private String identifiantInternet;

  @Column(name = "portdata")
  private String portData;

  @Column(name = "typeligneinternet")
  private String typeLigneInternet;

  private String email;

  @Column(name = "date_creat")
  private ZonedDateTime dateCreat;

  @ManyToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "id_sla", foreignKey = @ForeignKey(name = "FK_OPERATION_SLA"))
  private Sla sla;

  @ManyToOne(fetch = FetchType.LAZY) /* many to one unidirectional relationship with the centre technique */
  @JoinColumn(name = "id_centre", foreignKey = @ForeignKey(name = "FK_OPERATION_CENTRE_TECHNIQUE"))
  private CentreTechnique centreTechnique;

  @Column(name = "num_equipement")
  private String numEquipement;

  @Lob  //	@Type(type="org.hibernate.type.BinaryType")
  @Column(name = "signature_client")
  private byte[] signatureClient;

  @Lob  //	@Type(type="org.hibernate.type.BinaryType")
  @Column(name = "signature_tech")
  private byte[] signatureTech;

  @OneToMany(mappedBy = "operation")
  private Set<HistoriqueOcot> historiquesOcot;

  @OneToMany(mappedBy = "operation")
  private Set<Programmation> programmations;

}
