package com.ajayghimire.designPatterns.behavioralPatterns.observerDesignPattern.stockAvailableExample.Observable;

import com.ajayghimire.designPatterns.behavioralPatterns.observerDesignPattern.stockAvailableExample.Observers.AlertObserver;

public interface StockObservable {
  void add(AlertObserver observer);
  void remove(AlertObserver observer);
  void notifySubscribers();
  void setStockCount(int newStockCount);
  int getStockCount();
}
