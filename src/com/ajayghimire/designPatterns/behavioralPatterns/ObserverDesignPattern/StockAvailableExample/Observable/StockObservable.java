package com.ajayghimire.designPatterns.behavioralPatterns.ObserverDesignPattern.StockAvailableExample.Observable;

import com.ajayghimire.designPatterns.behavioralPatterns.ObserverDesignPattern.StockAvailableExample.Observers.AlertObserver;

public interface StockObservable {
  void add(AlertObserver observer);
  void remove(AlertObserver observer);
  void notifySubscribers();
  void setStockCount(int newStockCount);
  int getStockCount();
}
