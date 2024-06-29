package com.chace.batch.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.Set;

/* NORMALIZED */
@Entity(name = "utilisateur")
@Getter @Setter @AllArgsConstructor @NoArgsConstructor @ToString
public class Utilisateur extends _AbstractCommonModel {

  @ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="id_centre_gabon_telecom", foreignKey = @ForeignKey(name = "FK_UTILISATEUR_CENTRE_GT"))
  private CentreGabonTelecom centreGabonTelecom;

  @ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="id_profil", foreignKey = @ForeignKey(name = "FK_UTILISATEUR_PROFIL"))
  private Profil profil;

  @Column(name = "nomutilisateur")
  private String nomUtilisateur;

  @Column(name = "prenomutilisateur")
  private String prenomUtilisateur;

  @Column(name = "telephoneutilisateur")
  private String telephoneUtilisateur;

  @Column(name = "emailutilisateur")
  private String emailUtilisateur;

  @Column(name = "civilite")
  private String civilite;

  @Column(name = "boo_desac")
  private Boolean booDesac;

  @Column(name = "motdepasse")
  private String motDePasse;

  @Column(name = "login")
  private String login;

  @Column(name = "ldap")
//  private Long ldap;
  private Boolean ldap;

  @Column(name = "portee_centre")
  private Boolean porteeCentre;

  @ManyToOne(fetch = FetchType.LAZY) /* many to one unidirectional relationship with the centre technique */
  @JoinColumn(name = "id_centre", foreignKey = @ForeignKey(name = "FK_UTILISATEUR_CENTRE_TECHNIQUE"))
  private CentreTechnique centreTechnique;

  @Column(name = "actif")
  private Boolean actif;

  @OneToMany(mappedBy = "utilisateur")
  private Set<Derangement> derangements;

}
