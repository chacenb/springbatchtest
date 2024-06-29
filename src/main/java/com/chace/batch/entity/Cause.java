package com.chace.batch.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.HashSet;
import java.util.Set;

@Entity(name="cause")
@Getter @Setter @AllArgsConstructor @NoArgsConstructor
public class Cause extends _AbstractCommonModel {
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="idorigine",/*  nullable=false,  */foreignKey = @ForeignKey(name = "FK_CAUSE_ORIGINE"))
	private Origine origine; 
	
	private String codecause; 
	
	private String descriptioncause; 
	
	private Long idcentre;
	
	@OneToMany(mappedBy = "cause")
	private Set<Derangement> derangements = new HashSet<>();
	
	@OneToMany(mappedBy = "causeretour")
	private Set<Derangement> derangements2 = new HashSet<>();
	
}
