package com.ajayghimire.DesignPatterns.LowLevelSystemDesign.CreationalPatterns.BuilderDesignPattern;

import java.util.ArrayList;
import java.util.List;

public class SoftwareEngineeringStudentBuilder extends StudentBuilder {

  /**
   * @return
   */
  @Override
  public StudentBuilder setSubjects() {
    this.subjects = getSubjects();
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
