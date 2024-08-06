package com.ajayghimire.DesignPatterns.BehavioralPatterns.ObserverDesignPattern.StockAvailableExample;

import com.ajayghimire.DesignPatterns.BehavioralPatterns.ObserverDesignPattern.StockAvailableExample.Observable.DeviceObservableImp;
import com.ajayghimire.DesignPatterns.BehavioralPatterns.ObserverDesignPattern.StockAvailableExample.Observable.StockObservable;
import com.ajayghimire.DesignPatterns.BehavioralPatterns.ObserverDesignPattern.StockAvailableExample.Observers.AlertObserver;
import com.ajayghimire.DesignPatterns.BehavioralPatterns.ObserverDesignPattern.StockAvailableExample.Observers.EmailAlertObserverImpl;
import com.ajayghimire.DesignPatterns.BehavioralPatterns.ObserverDesignPattern.StockAvailableExample.Observers.MessageAlertObserverImpl;

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
