package com.ajayghimire.DesignPatterns.LowLevelSystemDesign.StructuralPatterns.CompositeDesignPattern.FileSystemExample.ProblemStatement;

public class File {
  private String fileName;

  public File(String fileName) {
    this.fileName = fileName;
  }

  public void ls() {
    System.out.println("This is a file: " + fileName);
  }
}
