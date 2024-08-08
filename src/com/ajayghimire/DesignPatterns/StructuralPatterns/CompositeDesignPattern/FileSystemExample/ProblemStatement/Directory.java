package com.ajayghimire.DesignPatterns.StructuralPatterns.CompositeDesignPattern.FileSystemExample.ProblemStatement;

import java.util.ArrayList;
import java.util.List;

public class Directory {
  private String directoryName;
  private List<Object> objectList;

  public Directory(String directoryName) {
    this.directoryName = directoryName;
    this.objectList = new ArrayList<>();
  }

  public void add(Object obj) {
    this.objectList.add(obj);
  }
}
