package com.chace.batch.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity(name="cause_derangement")
@Getter @Setter @AllArgsConstructor @NoArgsConstructor
public class CauseDerangement extends _AbstractCommonModel {
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="idorigine",/*  nullable=false,  */foreignKey = @ForeignKey(name = "FK_CAUSE_DERANGEMENT_ORIGINE"))
	private Origine origine;
	
	private String codecause;
	
	private String descriptioncause;
	
	private Long idcentre;
}
