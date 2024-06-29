package com.chace.batch.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity(name = "carte_transportee_sous_repartiteur")
@Getter @Setter @AllArgsConstructor @NoArgsConstructor
public class CarteTransporteSousRepartiteur {
  @Id
  @GeneratedValue
  private Long id;

  /* OK */
  @ManyToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "id_carte", foreignKey = @ForeignKey(name = "FK_CARTE_TRANSPORTE_SOUS_REPARTITEUR_CARTE"))
  private Carte carte;

  @ManyToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "id_sousrepartiteur", foreignKey = @ForeignKey(name = "FK_CARTE_TRANSPORTE_SOUS_REPARTITEUR_SOUS_REPARTITEUR"))
  private SousRepartiteur sousRepartiteur;
}
