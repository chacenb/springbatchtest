package com.chace.batch.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.HashSet;
import java.util.Set;

@Entity(name = "centre_gabon_telecom")
@Getter @Setter @AllArgsConstructor @NoArgsConstructor
public class CentreGabonTelecom extends _AbstractCommonModel {

  private String codecentregabontelecom;

  /* OK */
  @ManyToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "id_ville", foreignKey = @ForeignKey(name = "FK_CENTRE_GT_VILLE"))
  private Ville ville;

  private String descriptioncentregabontelecom;

  @ManyToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "id_type_centre_gabon_telecom", foreignKey = @ForeignKey(name = "FK_CENTRE_GT_TYPE_CENTRE_GT"))
  private TypeCentreGabonTelecom typeCentreGabonTelecom;

  private Double latcentre;

  private Double longcentre;

//  private Long idcentre;

  @OneToMany(mappedBy = "centreGabonTelecom")
  private Set<Repartiteur> repartiteurs = new HashSet<>();

  @OneToMany(mappedBy = "centreGabonTelecom")
  private Set<Utilisateur> utilisateurs = new HashSet<>();
}
