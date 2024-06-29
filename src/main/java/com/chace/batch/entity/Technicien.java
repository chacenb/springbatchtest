package com.chace.batch.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.ZonedDateTime;
import java.util.HashSet;
import java.util.Set;

@Entity(name="technicien")
@Getter @Setter @AllArgsConstructor @NoArgsConstructor
public class Technicien extends _AbstractCommonModel {
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="idprestataire",/*  nullable=false,  */foreignKey = @ForeignKey(name = "FK_TECHNICIEN_PRESTATAIRE"))
	private Prestataire prestataire;
	
	private String nomtechnicien;
	private Boolean boo_desac;
	
	@Lob
//	@Type(type="org.hibernate.type.BinaryType")
	private Byte[] signature_tech;
	
	private Long etat;

	private ZonedDateTime cccdate;
	
	private String login;
	
	private String token;
	
	private String password;
	
	private Long idcentre;
	
	@OneToMany(mappedBy = "technicien")
	private Set<Derangement> derangements = new HashSet<>();
	
	@OneToMany(mappedBy = "technicien")
	private Set<Operation> operations = new HashSet<>();


	
}
