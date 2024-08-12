package com.ajayghimire.DesignPatterns.LowLevelSystemDesign.StructuralPatterns.CompositeDesignPattern.FileSystemExample.SolutionOne;

import java.util.ArrayList;
import java.util.List;

public class Directory implements FileSystem {
  private String directoryName;
  private List<FileSystem> fileSystemList;

  public Directory(String directoryName) {
    this.directoryName = directoryName;
    this.fileSystemList = new ArrayList<>();
  }

  public void add(FileSystem fileSystem) {
    fileSystemList.add(fileSystem);
  }

  /** */
  @Override
  public void ls() {
    System.out.println("This is a directory: " + this.directoryName);
    for (FileSystem fileSystem : fileSystemList) {
      System.out.print("\t");
      fileSystem.ls();
    }
  }
}
