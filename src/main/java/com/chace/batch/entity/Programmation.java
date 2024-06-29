package com.chace.batch.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.ZonedDateTime;

@Entity(name="programmation")
@Getter @Setter @AllArgsConstructor @NoArgsConstructor
public class Programmation extends _AbstractCommonModel {

	/* OK */
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="id_operation", foreignKey = @ForeignKey(name = "FK_PROGRAMMATION_OPERATION"))
	private Operation operation;
	
	private Long id_equipe;
	
	private ZonedDateTime date_programmation;
	
	private String statut;
	
	private Long idcentre;
	
}
