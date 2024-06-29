package com.chace.batch.entity;

//import jakarta.persistence.Entity;
//import jakarta.persistence.FetchType;
//import jakarta.persistence.JoinColumn;
//import jakarta.persistence.ManyToOne;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity(name = "historique_derangement")
@Getter @Setter @AllArgsConstructor @NoArgsConstructor
public class HistoriqueDerangement extends _AbstractCommonModel {

  /* OK */
  @ManyToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "idtransportavant", foreignKey = @ForeignKey(name = "FK_HISTORIQUE_DERANG_CARTE_AVANT"))
  private Carte carteAvant;

  private int iddistributionavant;

  private int iddistributionapres;

  /* OK */
  @ManyToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "idtransportapres", foreignKey = @ForeignKey(name = "FK_HISTORIQUE_DERANG_CARTE_APRES"))
  private Carte carteApres;

  @ManyToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "idpcavant", foreignKey = @ForeignKey(name = "FK_HISTORIQUE_DERANG_PC_AVANT"))
  private PointConcentration pcAvant;

  @ManyToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "idpcapres", foreignKey = @ForeignKey(name = "FK_HISTORIQUE_DERANG_PC_APRES"))
  private PointConcentration pcApres;

  @ManyToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "idderangement", foreignKey = @ForeignKey(name = "FK_HISTORIQUE_DERANG_DERANGEMENT"))
  private Derangement derangement;

  @ManyToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "idligne", foreignKey = @ForeignKey(name = "FK_HISTORIQUE_DERANG_LIGNE"))
  private Ligne ligne;

  @ManyToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "idequipement", foreignKey = @ForeignKey(name = "FK_HISTORIQUE_DERANG_EQUIPEMENT"))
  private Equipement equipement;

  private String portdataavant;

  private String portdataapres;

  private Long idportdata;

  @ManyToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "idrepartiteur", foreignKey = @ForeignKey(name = "FK_HISTORIQUE_DERANG_REPARTITEUR"))
  private Repartiteur repartiteur;

  @ManyToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "idsousrepartiteur", foreignKey = @ForeignKey(name = "FK_HISTORIQUE_DERANG_SOUS_REPARTITEUR"))
  private SousRepartiteur sousRepartiteur;

}
