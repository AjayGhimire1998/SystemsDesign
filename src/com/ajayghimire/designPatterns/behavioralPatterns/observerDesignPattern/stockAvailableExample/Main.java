package com.ajayghimire.designPatterns.behavioralPatterns.observerDesignPattern.stockAvailableExample;

import com.ajayghimire.designPatterns.behavioralPatterns.observerDesignPattern.stockAvailableExample.Observable.DeviceObservableImp;
import com.ajayghimire.designPatterns.behavioralPatterns.observerDesignPattern.stockAvailableExample.Observable.StockObservable;
import com.ajayghimire.designPatterns.behavioralPatterns.observerDesignPattern.stockAvailableExample.Observers.AlertObserver;
import com.ajayghimire.designPatterns.behavioralPatterns.observerDesignPattern.stockAvailableExample.Observers.EmailAlertObserverImpl;
import com.ajayghimire.designPatterns.behavioralPatterns.observerDesignPattern.stockAvailableExample.Observers.MessageAlertObserverImpl;

public class Main {
  public static void main(String[] args) {
    StockObservable stockObservable = new DeviceObservableImp();

    AlertObserver emailObserver = new EmailAlertObserverImpl("ajay@gmail.com", stockObservable);
    AlertObserver messageObserver = new MessageAlertObserverImpl("9845235235", stockObservable);

    stockObservable.add(emailObserver);
    stockObservable.add(messageObserver);
//
//    stockObservable.setStockCount(15);
//    stockObservable.setStockCount(20);
    System.out.println(stockObservable.getStockCount());
    stockObservable.setStockCount(10);
    stockObservable.setStockCount(100);
  }
}
