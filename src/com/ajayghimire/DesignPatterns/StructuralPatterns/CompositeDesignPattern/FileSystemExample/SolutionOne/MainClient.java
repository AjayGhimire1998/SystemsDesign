package com.ajayghimire.DesignPatterns.StructuralPatterns.CompositeDesignPattern.FileSystemExample.SolutionOne;

public class MainClient {
  public static void main(String[] args) {
    Directory watchDirectory = new Directory("Must Watch");
    File documentary = new File("Chernobyl: The Documentary");
    watchDirectory.add(documentary);

    Directory moviesDirectory = new Directory("Movies");
    File movie = new File("Batman");
    moviesDirectory.add(movie);
    watchDirectory.add(moviesDirectory);

    Directory showsDirectory = new Directory("TV Shows");
    File show = new File("Breaking Bad");
    showsDirectory.add(show);
    watchDirectory.add(showsDirectory);

    watchDirectory.ls();
  }
}
