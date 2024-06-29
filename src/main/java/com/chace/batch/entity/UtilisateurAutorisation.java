package com.chace.batch.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/* NORMALIZED */
@Entity(name = "utilisateur_autorisation")
@Getter @Setter @AllArgsConstructor @NoArgsConstructor
public class UtilisateurAutorisation /*  extends _AbstractCommonModel  */ {

  /**
   * this one is an association table
   * that might not need to extend _AbstractCommonModel
   */

  @Id @GeneratedValue
  private Long id;

  @ManyToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "id_autorisation", foreignKey = @ForeignKey(name = "FK_UTILISATEUR_AUTORISATION_AUTORISATION"))
  private Autorisation autorisation;

  @ManyToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "id_profil", foreignKey = @ForeignKey(name = "FK_UTILISATEUR_AUTORISATION_PROFIL"))
  private Profil profil;

  private String portee;

  private Boolean boo_suppr;

}
