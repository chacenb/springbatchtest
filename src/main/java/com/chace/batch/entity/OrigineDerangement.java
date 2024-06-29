package com.chace.batch.entity;

import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity(name="origine_derangement")
@Getter @Setter @AllArgsConstructor @NoArgsConstructor
public class OrigineDerangement extends _AbstractCommonModel {
	
	private String codeorigine;
	
	private String descriptionorigine;
	
	private Long idcentre;
}
