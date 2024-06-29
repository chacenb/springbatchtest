package com.chace.batch.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Set;

/* OK */
@Entity(name = "centre_technique")
@Getter @Setter @AllArgsConstructor @NoArgsConstructor
public class CentreTechnique extends _AbstractCommonModel {

  @Column(name = "nomcentretechnique")
  private String nomCentreTechnique;

  @OneToMany(mappedBy = "centreTechnique")
  private Set<Utilisateur> utilisateurs;
}
