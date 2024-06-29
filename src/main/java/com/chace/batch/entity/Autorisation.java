package com.chace.batch.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Set;

/* NORMALIZED */
@Entity(name = "autorisation")
@Getter @Setter @AllArgsConstructor @NoArgsConstructor
public class Autorisation extends _AbstractCommonModel {

  @ManyToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "id_ressouce", foreignKey = @ForeignKey(name = "FK_AUTORISATION_RESSOURCE"))
  private Ressource ressource;

  @Column(name = "autorisation")
  private String nomAutorisation;

  @OneToMany(mappedBy = "autorisation")
  private Set<UtilisateurAutorisation> utilisateurAutorisations;  // = new HashSet<>();
}
