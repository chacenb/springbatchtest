package com.chace.batch.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Set;

@Entity(name = "classe")
@Getter @Setter @AllArgsConstructor @NoArgsConstructor
public class Classe extends _AbstractCommonModel {

  private String nomclasse;
  private Long deliasexecutionoc;
  private Long delaisexecutionsav;
  private Long idcentre;

  @OneToMany(mappedBy = "classe")
  private Set<Categorie> categories;

}
