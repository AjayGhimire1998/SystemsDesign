package com.ajayghimire.DesignPatterns.StructuralPatterns.CompositeDesignPattern.FileSystemExample.SolutionOne;

public class File implements FileSystem {
  private String fileName;

  public File(String fileName) {
    this.fileName = fileName;
  }

  /** */
  @Override
  public void ls() {
    System.out.println("This is a file: " + this.fileName);
  }
}
