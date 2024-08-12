package com.ajayghimire.DesignPatterns.CreationalPatterns.BuilderDesignPattern;

public class Director {
  StudentBuilder studentBuilder;

  public Director(StudentBuilder studentBuilder) {
    this.studentBuilder = studentBuilder;
  }

  public Student createStudent() {
    if (studentBuilder instanceof SoftwareEngineeringStudent) {
      return createSoftwareEngineeringStudent();
    } else if (studentBuilder instanceof MBAStudent) {
      return createMBAStudent();
    }
    return null;
  }

  private Student createMBAStudent() {
    return studentBuilder.setRollNumber(1).setAge(25).setName("AJ").setSubjects().build();
  }

  private Student createSoftwareEngineeringStudent() {
    studentBuilder
        .setRollNumber(2)
        .setAge(26)
        .setName("AJAY")
        .setFatherName("SP")
        .setMotherName("RG")
        .setSubjects()
        .build();
  }
}
