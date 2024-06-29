package com.chace.batch.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity(name="pc_pairet")
@Getter @Setter @AllArgsConstructor @NoArgsConstructor
public class PcPairet{
	@Id @GeneratedValue
	private Long id;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="id_pc", foreignKey = @ForeignKey(name = "FK_PC_PAIRET_POINT_CONCENTRATION"))
	private PointConcentration pointConcentration;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="id_pairet", foreignKey = @ForeignKey(name = "FK_PC_PAIRET_PAIRET"))
	private Pairet pairet;
	
	private String depart;
	
	private String source;
	
	private Long nombrebrin;
	
	private Long nombreamorce;
	
	private Long nombrepont;
	
	private Boolean boo_suppr;
	
	private Long idcentre;
}
