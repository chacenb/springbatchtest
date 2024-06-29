package com.chace.batch.entity;

import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity(name="config_ldap")
@Getter @Setter @AllArgsConstructor @NoArgsConstructor
public class ConfigLdap extends _AbstractCommonModel {
	
	private String domaine;
	
	private String extension;
	
	private String utilisateur;
	
	private String motdepasse;
	
	private Long etat;
	
	private String hote;
	
	private String port;
	
	private Long idcentre;
}
