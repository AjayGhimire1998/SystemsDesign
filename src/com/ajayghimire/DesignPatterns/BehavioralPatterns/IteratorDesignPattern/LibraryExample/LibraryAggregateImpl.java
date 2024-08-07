package com.ajayghimire.DesignPatterns.BehavioralPatterns.IteratorDesignPattern.LibraryExample;

import java.util.List;

public class LibraryAggregateImpl implements IAggregate {
  private List<Book> booksList;

  public LibraryAggregateImpl(List<Book> booksList) {
    this.booksList = booksList;
  }

  /**
   * @return
   */
  @Override
  public IIterator iterator() {
    return new BookIteratorImpl(this.booksList);
  }
}
