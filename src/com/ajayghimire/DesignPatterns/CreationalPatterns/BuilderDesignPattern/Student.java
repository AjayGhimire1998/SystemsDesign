package com.ajayghimire.DesignPatterns.CreationalPatterns.BuilderDesignPattern;

import java.util.List;

public class Student {
  private int rollNumber;
  private int age;
  private String name;
  private String fatherName;
  private String motherName;
  private List<String> subjects;

  public Student(StudentBuilder studentBuilder) {
    this.rollNumber = studentBuilder.getRollNumber();

  }

  @Override
  public String toString() {
    return "Student{"
        + "rollNumber="
        + rollNumber
        + ", age="
        + age
        + ", name='"
        + name
        + '\''
        + ", fatherName='"
        + fatherName
        + '\''
        + ", motherName='"
        + motherName
        + '\''
        + ", subjects="
        + subjects
        + '}';
  }
}
