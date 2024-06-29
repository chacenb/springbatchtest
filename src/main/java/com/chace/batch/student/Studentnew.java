package com.chace.batch.student;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.*;

@Getter
@Setter
@Entity
@ToString
@Builder
@AllArgsConstructor @NoArgsConstructor
public class Studentnew/* extends _AbstractCommonModel*/{

    @Id
    @GeneratedValue
    private Integer id;
    private String firstname;
    private String lastname;
    private Boolean age;
    private Boolean majeur;
}
