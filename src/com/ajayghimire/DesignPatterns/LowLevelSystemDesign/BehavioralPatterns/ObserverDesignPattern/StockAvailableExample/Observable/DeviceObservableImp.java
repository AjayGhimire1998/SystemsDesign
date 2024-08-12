package com.ajayghimire.DesignPatterns.LowLevelSystemDesign.BehavioralPatterns.ObserverDesignPattern.StockAvailableExample.Observable;

import com.ajayghimire.DesignPatterns.LowLevelSystemDesign.BehavioralPatterns.ObserverDesignPattern.StockAvailableExample.Observers.AlertObserver;
import java.util.ArrayList;
import java.util.List;

public class DeviceObservableImp implements StockObservable {

  public List<AlertObserver> observersList = new ArrayList<>();
  public int stockCount = 0;

  /**
   * @param observer
   */
  @Override
  public void add(AlertObserver observer) {
    observersList.add(observer);
  }

  /**
   * @param observer
   */
  @Override
  public void remove(AlertObserver observer) {
    observersList.remove(observer);
  }

  /** */
  @Override
  public void notifySubscribers() {
    for (AlertObserver observer : observersList) {
      observer.update();
    }
  }

  /**
   * @return
   */
  @Override
  public int getStockCount() {
    return this.stockCount;
  }

  /**
   * @param newStockCount
   */
  @Override
  public void setStockCount(int newStockCount) {
    if (getStockCount() == 0) {
      notifySubscribers();
    }
    this.stockCount += newStockCount;
  }
}
