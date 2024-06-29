package com.chace.batch.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Set;

/* NORMALIZED */
@Entity(name = "categorie")
@Getter @Setter @AllArgsConstructor @NoArgsConstructor
public class Categorie extends _AbstractCommonModel {

  @Column(name = "nomcategorie")
  private String nomCategorie;

  @Column(name = "descriptioncategorie")
  private String descriptionCategorie;

  @ManyToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "id_classe", foreignKey = @ForeignKey(name = "FK_CATEGORIE_CLASSE"))
  private Classe classe;

  @OneToMany(mappedBy = "categorie")
  private Set<Abonne> abonnes;
}
