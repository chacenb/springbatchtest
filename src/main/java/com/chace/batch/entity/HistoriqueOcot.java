package com.chace.batch.entity;

//import jakarta.persistence.Entity;
//import jakarta.persistence.FetchType;
//import jakarta.persistence.JoinColumn;
//import jakarta.persistence.ManyToOne;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity(name="historique_oc_ot")
@Getter @Setter @AllArgsConstructor @NoArgsConstructor
public class HistoriqueOcot extends _AbstractCommonModel {
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="idtransportavant", foreignKey = @ForeignKey(name = "FK_HISTORIQUE_OCOT_CARTE_AVANT"))
	private Carte carteAvant;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="idtransportapres", foreignKey = @ForeignKey(name = "FK_HISTORIQUE_OCOT_CARTE_APRES"))
	private Carte carteApres;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="idpcavant", foreignKey = @ForeignKey(name = "FK_HISTORIQUE_OCOT_PC_AVANT"))
	private PointConcentration pcAvant;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="idpcapres", foreignKey = @ForeignKey(name = "FK_HISTORIQUE_OCOT_PC_APRES"))
	private PointConcentration pcApres;
	
	private Long iddistributionavant;
	
	private Long iddistributionapres;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="idligne", foreignKey = @ForeignKey(name = "FK_HISTORIQUE_OCOT_LIGNE"))
	private Ligne ligne;

	/* OK */
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="id_operation", foreignKey = @ForeignKey(name = "FK_HISTORIQUE_OCOT_OPERATION"))
	private Operation operation;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="idsousrepartiteur", foreignKey = @ForeignKey(name = "FK_HISTORIQUE_OCOT_SOUS_REPARTITEUR"))
	private SousRepartiteur sousRepartiteur;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="idrepartiteur", foreignKey = @ForeignKey(name = "FK_HISTORIQUE_OCOT_REPARTITEUR"))
	private Repartiteur repartiteur;
}
