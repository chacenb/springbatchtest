package com.chace.batch.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Set;

/* NORMALIZED */
@Entity(name = "capacite")
@Getter @Setter @NoArgsConstructor @AllArgsConstructor
public class Capacite extends _AbstractCommonModel {

  private String type;
  private String valeur;
//  private String designation; // MORE REQUEST

  @OneToMany(mappedBy = "capacite")
  private Set<Carte> cartes;  // = new HashSet<>();
}
