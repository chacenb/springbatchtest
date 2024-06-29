package com.chace.batch.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.util.HashSet;
import java.util.Set;

@Entity(name="profil")
@AllArgsConstructor @NoArgsConstructor
public class Profil extends _AbstractCommonModel{
	
	private String code;
	
	private String libelle;
	
	private String description;
	
	private Long idcentre;
	
	@OneToMany(mappedBy = "profil")
	private Set<Utilisateur> utilisateurs = new HashSet<>();
	
	@OneToMany(mappedBy = "profil")
	private Set<UtilisateurAutorisation> utilisateursAutorisations = new HashSet<>();

	public Profil(String code, String libelle, String description, Long idcentre, Set<Utilisateur> utilisateurs) {
		super();
		this.code = code;
		this.libelle = libelle;
		this.description = description;
		this.idcentre = idcentre;
		this.utilisateurs = utilisateurs;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getLibelle() {
		return libelle;
	}

	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Long getIdcentre() {
		return idcentre;
	}

	public void setIdcentre(Long idcentre) {
		this.idcentre = idcentre;
	}

	public Set<Utilisateur> getUtilisateurs() {
		return utilisateurs;
	}

	public void setUtilisateurs(Set<Utilisateur> utilisateurs) {
		this.utilisateurs = utilisateurs;
	}
	
	
}
