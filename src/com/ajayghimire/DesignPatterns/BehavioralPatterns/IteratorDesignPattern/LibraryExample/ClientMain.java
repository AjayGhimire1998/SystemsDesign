package com.ajayghimire.DesignPatterns.BehavioralPatterns.IteratorDesignPattern.LibraryExample;

import java.util.List;

public class ClientMain {
  public static void main(String[] args) {
    LibraryAggregateImpl library =
        new LibraryAggregateImpl(
            List.of(new Book("GOT", 230.0), new Book("LOTR", 440.0), new Book("HP", 120.5)));

    IIterator booksIterator = library.iterator();
    while (booksIterator.hasNext()) {
      Book nextBook = (Book) booksIterator.next();
      System.out.printf("%s costs about %.2f\n", nextBook.getTitle(), nextBook.getPrice());
    }
  }
}
