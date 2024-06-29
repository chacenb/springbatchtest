package com.chace.batch.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Set;

@Entity(name = "repartiteur")
@Getter @Setter @AllArgsConstructor @NoArgsConstructor
public class Repartiteur extends _AbstractCommonModel {

  @ManyToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "id_centre_gabon_telecom", foreignKey = @ForeignKey(name = "FK_REPARTITEUR_CENTRE_GT"))
  private CentreGabonTelecom centreGabonTelecom;

  @ManyToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "id_type_repartiteur", foreignKey = @ForeignKey(name = "FK_REPARTITEUR_TYPE_REPARTITEUR"))
  private TypeRepartiteur typeRepartiteur;

  /* OK */
  @ManyToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "id_ville", foreignKey = @ForeignKey(name = "FK_REPARTITEUR_VILLE"))
  private Ville ville;

  @Column(name = "coderepartiteur")
  private String codeRepartiteur;

  @Column(name = "descriptionrepartiteur")
  private String descriptionRepartiteur;

  @Column(name = "latrepartiteur")
  private Double latRepartiteur;

  @Column(name = "longrepartiteur")
  private Double longRepartiteur;

  private String modele;

  @ManyToOne(fetch = FetchType.LAZY) /* many to one unidirectional relationship with the centre technique */
  @JoinColumn(name = "id_centre", foreignKey = @ForeignKey(name = "FK_REPARTITEUR_CENTRE_TECHNIQUE"))
  private CentreTechnique centreTechnique;

  @OneToMany(mappedBy = "repartiteur")
  private Set<Equipement> equipements;

  @OneToMany(mappedBy = "repartiteur")
  private Set<HistoriqueDerangement> historiqueDerangements;

  @OneToMany(mappedBy = "repartiteur")
  private Set<HistoriqueOcot> historiqueOcots;

  @OneToMany(mappedBy = "repartiteur")
  private Set<Pairet> pairets;

  @OneToMany(mappedBy = "repartiteur")
  private Set<PointConcentration> pointConcentrations;

  @OneToMany(mappedBy = "repartiteur")
  private Set<SousRepartiteur> sousRepartiteurs;

  @OneToMany(mappedBy = "repartiteur")
  private Set<Carte> cartes;

  @Transient /* calculated field that won't be saved inside the DB */
  private Long tauxOccupation = 0L;
}
