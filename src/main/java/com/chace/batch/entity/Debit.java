package com.chace.batch.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.HashSet;
import java.util.Set;

@Entity(name="debit")
@Getter @Setter @AllArgsConstructor @NoArgsConstructor
public class Debit extends _AbstractCommonModel {
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="idtypedebit",/*  nullable=false,  */foreignKey = @ForeignKey(name = "FK_DEBIT_TYPE_DEBIT"))
	private TypeDebit typeDebit;
	
	private String debit;
	
	private String descriptiondebit;
	
	private Long idcentre;
	
	@OneToMany(mappedBy = "debit")
	private Set<HistoriqueLigneAbonne> historiqueLigneAbonnes = new HashSet<>();
	
	@OneToMany(mappedBy = "debit")
	private Set<LigneAbonne> ligneAbonnes = new HashSet<>();
	
	@OneToMany(mappedBy = "debit")
	private Set<Operation> operations = new HashSet<>();
}
