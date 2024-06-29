package com.chace.batch.student;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@Entity
@ToString
public class Student/* extends _AbstractCommonModel*/{

    @Id
    @GeneratedValue
    private Integer id;
    private String firstname;
    private String lastname;
    private int age;
}
