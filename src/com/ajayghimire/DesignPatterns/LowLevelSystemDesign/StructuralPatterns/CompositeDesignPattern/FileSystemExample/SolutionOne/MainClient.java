package com.ajayghimire.DesignPatterns.LowLevelSystemDesign.StructuralPatterns.CompositeDesignPattern.FileSystemExample.SolutionOne;

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

    Directory shortsDirectory = new Directory("Short Movies");
    File shortMovie = new File("Pika");

    shortsDirectory.add(shortMovie);
    moviesDirectory.add(shortsDirectory);
    watchDirectory.ls();
  }
}
