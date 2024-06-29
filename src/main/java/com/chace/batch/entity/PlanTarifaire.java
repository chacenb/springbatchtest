package com.chace.batch.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.HashSet;
import java.util.Set;

@Entity(name="plan_tarifaire")
@Getter @Setter @AllArgsConstructor @NoArgsConstructor
public class PlanTarifaire extends _AbstractCommonModel /*AbstractCommonModel2*/{
	
	@Id @GeneratedValue
	private Long id;

	/* PLAN TARIFAIRE DOESN'T NEED TO REFERENCE LIGNE ABONNE, ITS REFERENCE IS ALREADY THERE */
//	@ManyToOne(fetch = FetchType.LAZY)
//	@JoinColumn(name="idligneabonne", nullable=true, foreignKey = @ForeignKey(name = "FK_PLAN_TARIFAIRE_LIGNE_ABONNE"))
//	private LigneAbonne ligneAbonne;
	
	private String codeplantarifaire;
	
	private String descriptionplantarifaire;
	
	private String type;
	
	private Long idcentre;
	
	@OneToMany(mappedBy = "planTarifaire")
	private Set<HistoriqueLigneAbonne> historiqueLigneAbonnes = new HashSet<>();
	
//	@OneToMany(mappedBy = "planTarifaire")
//	private Set<LigneAbonne> ligneAbonnes = new HashSet<>();
	
//	@OneToMany(mappedBy = "planTarifaire")
//	private Set<Operation> operations = new HashSet<>();
}
