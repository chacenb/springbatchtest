package com.chace.batch.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.HashSet;
import java.util.Set;

@Entity(name="point_concentration")
	@Getter @Setter @AllArgsConstructor @NoArgsConstructor

public class PointConcentration extends _AbstractCommonModel {
	
	private String codepc;
	
	private Double latpc;
	
	private Double longpc;
	
	private String zonepc;
	
	private String nature;
	
	private String typepc;
	
	private String source;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="idrepartiteur", foreignKey = @ForeignKey(name = "FK_POINT_CONCENTRATION_REPARTITEUR"))
	private Repartiteur repartiteur;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="idsousrepartiteur", foreignKey = @ForeignKey(name = "FK_POINT_CONCENTRATION_SOUS_REPARTITEUR"))
	private SousRepartiteur sousRepartiteur;
	
	private Long idcentre;
	
	@OneToMany(mappedBy = "pcAvant")
	private Set<HistoriqueDerangement> historiqueDerangementsavant = new HashSet<>();
	
	@OneToMany(mappedBy = "pcApres")
	private Set<HistoriqueDerangement> historiqueDerangementsapres = new HashSet<>();
	
	@OneToMany(mappedBy = "pointConcentration")
	private Set<HistoriqueLigneAbonne> historiqueLigneAbonnes = new HashSet<>();
	
	@OneToMany(mappedBy = "pcAvant")
	private Set<HistoriqueOcot> historiqueOcotsavant = new HashSet<>();
	
	
	@OneToMany(mappedBy = "pcApres")
	private Set<HistoriqueOcot> historiqueOcotsapres = new HashSet<>();
	
	@OneToMany(mappedBy = "pointConcentration")
	private Set<LigneAbonne> ligneAbonnes = new HashSet<>();
	
	@OneToMany(mappedBy = "pointConcentration")
	private Set<Operation> operations = new HashSet<>();
	
	@OneToMany(mappedBy = "pointConcentration")
	private Set<Paired> paireds = new HashSet<>();
	
	@OneToMany(mappedBy = "pointConcentration")
	private Set<Pairet> pairets = new HashSet<>();

	@OneToMany(mappedBy = "pointConcentration")
	private Set<PcPairet> pcPairets = new HashSet<>();
	
	
	
}
