package com.ajayghimire.DesignPatterns.LowLevelSystemDesign.BehavioralPatterns.ObserverDesignPattern.StockAvailableExample.Observable;

import com.ajayghimire.DesignPatterns.LowLevelSystemDesign.BehavioralPatterns.ObserverDesignPattern.StockAvailableExample.Observers.AlertObserver;

public interface StockObservable {
  void add(AlertObserver observer);
  void remove(AlertObserver observer);
  void notifySubscribers();
  void setStockCount(int newStockCount);
  int getStockCount();
}
