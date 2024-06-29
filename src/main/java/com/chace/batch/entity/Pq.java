package com.chace.batch.entity;

import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity(name="pq")
@Getter @Setter @AllArgsConstructor @NoArgsConstructor
public class Pq extends _AbstractCommonModel {
	private String valeur;
}
