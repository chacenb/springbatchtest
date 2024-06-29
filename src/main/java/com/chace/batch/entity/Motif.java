package com.chace.batch.entity;

import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity(name = "motif")
@Getter @Setter @AllArgsConstructor @NoArgsConstructor
public class Motif extends _AbstractCommonModel {

  private String codemotif;

  private String descriptionmotif;

  private Long idcentre;

  /* this field is not mapped to operations :: the field Operation.motif references a Cause instance, NOT a Motif instance */
//	@OneToMany(mappedBy = "motif")
//	private Set<Operation> operations = new HashSet<>();
}
