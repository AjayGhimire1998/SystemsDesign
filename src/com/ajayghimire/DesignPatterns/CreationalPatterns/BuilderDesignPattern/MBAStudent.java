package com.ajayghimire.DesignPatterns.CreationalPatterns.BuilderDesignPattern;

import java.util.ArrayList;
import java.util.List;

public class MBAStudent extends StudentBuilder {

  /**
   * @param subjects
   * @return
   */
  @Override
  public StudentBuilder setSubjects() {
    this.subjects = getSubjects();
    return this;
  }

  public List<String> getSubjects() {
    List<String> subjects = new ArrayList<>();
    subjects.add("Economics");
    subjects.add("Business Studies");
    subjects.add("Accounting");
    subjects.add("Business Design");
    return subjects;
  }
}
