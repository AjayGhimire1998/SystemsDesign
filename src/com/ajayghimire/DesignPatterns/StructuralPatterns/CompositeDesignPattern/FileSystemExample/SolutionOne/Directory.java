package com.ajayghimire.DesignPatterns.StructuralPatterns.CompositeDesignPattern.FileSystemExample.SolutionOne;

import java.util.ArrayList;
import java.util.List;

public class Directory implements FileSystem {
  private String directoryName;
  private List<FileSystem> fileSystemList;

  public Directory(String directoryName) {
    this.directoryName = directoryName;
    this.fileSystemList = new ArrayList<>();
  }

  /** */
  @Override
  public void ls() {
    for (FileSystem fileSystem : fileSystemList) {
      fileSystem.ls();
    }
  }
}
