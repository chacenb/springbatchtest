package com.chace.batch.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.HashSet;
import java.util.Set;

@Entity(name="pairet")
@Getter @Setter @AllArgsConstructor @NoArgsConstructor
public class Pairet extends _AbstractCommonModel {
	
	private Long codeamorce;
	
	private String codepaire;
	
	private String codepon;
	
	private String codebrin;
	
	private String nature;
	
	private String statut;
	
	private String codetransport;

	/* OK */
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="id_carte", foreignKey = @ForeignKey(name = "FK_PAIRET_CARTE"))
	private Carte carte;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="id_repartiteur", foreignKey = @ForeignKey(name = "FK_PAIRET_REPARTITEUR"))
	private Repartiteur repartiteur;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="id_sous_repartiteur", foreignKey = @ForeignKey(name = "FK_PAIRET_SOUS_REPARTITEUR"))
	private SousRepartiteur sousRepartiteur;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="idpc", foreignKey = @ForeignKey(name = "FK_PAIRET_POINT_CONCENTRATION"))
	private PointConcentration pointConcentration;
	
	private Long idcentre;
	
	private String libelle;




	/* ----------------------------------------------------------------------- */
	/* THESE FIELDS ARE NOT MAPPED TO THE DB */

	@OneToMany(mappedBy = "pairet")
	private Set<PcPairet> pcPairets = new HashSet<>();

	/* END THESE FIELDS ARE NOT MAPPED TO THE DB */
	/* ----------------------------------------------------------------------- */

}
