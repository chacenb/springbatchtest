package com.chace.batch.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Set;

/* NORMALIZED */
@Entity(name = "carte")
@Getter @Setter @AllArgsConstructor @NoArgsConstructor
public class Carte extends _AbstractCommonModel {

//  private String support; // MORE REQUEST

  private String nom;
  private String code;

  @ManyToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "id_sousrepartiteur", foreignKey = @ForeignKey(name = "FK_CARTE_SOUS_REPARTITEUR"))
  private SousRepartiteur sousRepartiteur;

  @ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="id_repartiteur",/*  nullable=false,  */foreignKey = @ForeignKey(name = "FK_TRANSPORT_SOUS_REPARTITEUR"))
  private Repartiteur repartiteur;

//  private String source;  // MORE REQUEST

  @ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="id_capacite",/*  nullable=false,  */foreignKey = @ForeignKey(name = "FK_TRANSPORT_SOUS_CAPACITE"))
  private Capacite capacite;


//  @Column(name = "repartiteurcodecarte")
//  private Long repartiteurCodeCarte;  // MORE REQUEST

  @ManyToOne(fetch = FetchType.LAZY) /* many to one unidirectional relationship with the centre technique */
  @JoinColumn(name = "id_centre", foreignKey = @ForeignKey(name = "FK_CARTE_CENTRE_TECHNIQUE"))
  private CentreTechnique centreTechnique;

  private Boolean transported;

//  private Long transportation;  // MORE REQUEST

  private Boolean transportable;

  @Column(name = "nombre_brin")
  private Long nombreBrin;

  @OneToMany(mappedBy = "carteAvant")
  private Set<HistoriqueOcot> historiqueOcotsAvant;

  @OneToMany(mappedBy = "carteApres")
  private Set<HistoriqueOcot> historiqueOcotsApres;

  @OneToMany(mappedBy = "carteAvant")
  private Set<HistoriqueDerangement> historiqueDerangementsAvant;

  @OneToMany(mappedBy = "carteApres")
  private Set<HistoriqueDerangement> historiqueDerangementsApres;

  @OneToMany(mappedBy = "carte")
  private Set<CarteTransporteSousRepartiteur> carteTransporteSousRepartiteurs;

  @OneToMany(mappedBy = "carte")
  private Set<HistoriqueLigneAbonne> historiqueLigneAbonnes;

  @OneToMany(mappedBy = "carte")
	private Set<LigneAbonne> ligneAbonnes;

  @OneToMany(mappedBy = "carte")
  private Set<Paired> paireds;

  @OneToMany(mappedBy = "carte")
  private Set<Pairet> pairets;

  @OneToMany(mappedBy = "carte")
  private Set<SousRepartiteur> sousRepartiteurs;

  @Transient /* calculated field that won't be saved inside the DB */
  private Long tauxOccupation = 0L;

}
