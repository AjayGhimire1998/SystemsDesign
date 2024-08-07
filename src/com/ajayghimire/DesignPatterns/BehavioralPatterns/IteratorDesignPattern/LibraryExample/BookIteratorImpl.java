package com.ajayghimire.DesignPatterns.BehavioralPatterns.IteratorDesignPattern.LibraryExample;

import java.util.List;

public class BookIteratorImpl implements IIterator {
  private List<Book> books;
  private int index;

  public BookIteratorImpl(List<Book> books) {
    this.books = books;
  }

  /**
   * @return
   */
  @Override
  public boolean hasNext() {
    return this.index < this.books.size();
  }

  /**
   * @return
   */
  @Override
  public Object next() {
    if (this.hasNext()) {
      return books.get(index++);
    }
    return null;
  }
}
