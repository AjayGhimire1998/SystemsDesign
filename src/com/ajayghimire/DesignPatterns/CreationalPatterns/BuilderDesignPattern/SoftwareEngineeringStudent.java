package com.ajayghimire.DesignPatterns.CreationalPatterns.BuilderDesignPattern;

import java.util.ArrayList;
import java.util.List;

public class SoftwareEngineeringStudent extends StudentBuilder {

  /**
   * @return
   */
  @Override
  public StudentBuilder setSubjects(List<String> subjects) {
    this.setSubjects(getSubjects());
    return this;
  }

  public List<String> getSubjects() {
    List<String> subjects = new ArrayList<>();
    subjects.add("Computer Science");
    subjects.add("DSA");
    subjects.add("OOP");
    subjects.add("System Design");
    return subjects;
  }
}
