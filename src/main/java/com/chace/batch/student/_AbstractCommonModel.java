package com.chace.batch.student;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.ZonedDateTime;

/* CHACE::OK */
@Getter @Setter
@MappedSuperclass // Designates a class whose mapping information is applied to the entities that inherit from it. It has no separate table defined for it.
public abstract class _AbstractCommonModel {

//  /* --------- I don't know what this is for  ---------- */
//  private static String SYSTEM = "sytem";


  /* --------- Class properties ---------- */

  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "id", nullable = false, unique = true)
  @Id
  private Long id;


  // visit > https://www.baeldung.com/hibernate-date-time
  // Since Java 8, Java Date and Time API deals with temporal values fixing the problems of java.util.Date and java.util.Calendar.
  // java.time package types are directly mapped to corresponding SQL types, thus no need to explicitly specify @Temporal annotation:
  // LocalDate is mapped to DATE. LocalTime and OffsetTime are mapped to TIME. Instant, ZonedDateTime, OffsetDateTime and ZonedDateTime are mapped to TIMESTAMP.
//  @Column(name = "hor_creat", length = 18, updatable = false)
//  @Temporal(TemporalType.TIMESTAMP)
//  private ZonedDateTime creationDate;
//
//  @Column(name = "hor_maj", length = 18)
//  @Temporal(TemporalType.TIMESTAMP)
//  private ZonedDateTime updateDate;
//
//  @Column(name = "hor_suppr", length = 18)
//  @Temporal(TemporalType.TIMESTAMP)
//  private ZonedDateTime deleteDate;
//
//  @Column(name = "id_util_creat", length = 18)
//  private Long creatorCode;
//
//  @Column(name = "id_util_maj", length = 18)
//  private Long updaterCode;
//
//  @Column(name = "id_util_suppr", length = 18)
//  private Long deleterCode;
//
//  @Column(name = "boo_suppr", nullable = false)
//  private Boolean isDeleted = false;
//
//
//
//
//
//  /* --------- Automatic actions on create, update, delete ---------- */
//
//  @PrePersist
//  protected void beforePersist() {
//    if (creationDate == null) this.creationDate = ZonedDateTime.now();
//    if (updateDate == null) this.updateDate = ZonedDateTime.now();
//  }
//
//  @PreUpdate
//  protected void beforeUpdate() {
//    this.updateDate = ZonedDateTime.now();
//  }
//
//  @PreRemove
//  protected void preRemove() {
//    this.updateDate = ZonedDateTime.now();
//    this.deleteDate = ZonedDateTime.now();
//  }
//
//  /* --------- custom methods ---------- */
//
//  public Boolean isDeleted() {
//    return isDeleted;
//  }
//
//  public void setDeleted(Boolean isDeleted) {
//    this.isDeleted = isDeleted;
//  }

}

