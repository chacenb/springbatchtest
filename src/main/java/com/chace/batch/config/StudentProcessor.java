package com.chace.batch.config;

import com.chace.batch.student.Student;
import com.chace.batch.student.Studentnew;
import lombok.extern.slf4j.Slf4j;
import org.springframework.batch.item.ItemProcessor;

@Slf4j
//public class StudentProcessor implements ItemProcessor<Student,Student> {
public class StudentProcessor implements ItemProcessor<Student, Studentnew> {

  @Override
//    public Student process(Student student) {
  public Studentnew process(Student student) {

    log.info("[PROCESSING] processing utilisateur =  {}", student.toString());

    Studentnew newStudent = Studentnew.builder()
      .id(student.getId())
      .firstname(student.getFirstname())
      .lastname(student.getLastname())
      .age(student.getAge() > 0)
      .majeur(student.getAge() > 21)
      .build();

    log.info("[PROCESSING] :: about to return newStudent =  {}", newStudent.toString());
    return newStudent;
  }
}
