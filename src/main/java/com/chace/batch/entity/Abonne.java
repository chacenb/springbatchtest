package com.chace.batch.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Set;

/* NORMALIZED */
@Entity(name = "abonne")
@Getter @Setter @AllArgsConstructor @NoArgsConstructor
public class Abonne extends _AbstractCommonModel {

  @ManyToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "id_categorie", foreignKey = @ForeignKey(name = "FK_ABONNE_CATEGORIE"))
  private Categorie categorie;

  @Column(name = "numcompteabonne")
  private String numCompteAbonne;

  @Column(name = "raisonsociale")
  private String raisonSociale;

  @Column(name = "typeabonne")
  private String typeAbonne;

  @Column(name = "adresse")
  private String adresse;

  @Column(name = "contact1")
  private String contact1;

  @Column(name = "contact2")
  private String contact2;

  @Column(name = "email")
  private String email;

  @ManyToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "id_ville", foreignKey = @ForeignKey(name = "FK_ABONNE_VILLE"))
  private Ville ville;

  @OneToMany(mappedBy = "abonne")
  private Set<HistoriqueLigneAbonne> historiqueLigneAbonnes;  // = new HashSet<>();

  @OneToMany(mappedBy = "abonne")
  private Set<LigneAbonne> ligneAbonnes;  //= new HashSet<>();

	@OneToMany(mappedBy = "abonne")
	private Set<Operation> operations;  // = new HashSet<>();

}
