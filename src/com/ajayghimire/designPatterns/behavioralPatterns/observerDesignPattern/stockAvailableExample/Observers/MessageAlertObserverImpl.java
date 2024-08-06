package com.ajayghimire.designPatterns.behavioralPatterns.observerDesignPattern.stockAvailableExample.Observers;

import com.ajayghimire.designPatterns.behavioralPatterns.observerDesignPattern.stockAvailableExample.Observable.StockObservable;

public class MessageAlertObserverImpl implements AlertObserver{
  String phoneNumber;
  StockObservable stockObservable;

  public MessageAlertObserverImpl(String phoneNumber, StockObservable stockObservable) {
    this.phoneNumber = phoneNumber;
    this.stockObservable = stockObservable;
  }

  /**
*
*/
  @Override
  public void update() {
    sendMessage(this.phoneNumber, "Product is back in stock, hurry up!");
  }

  private void sendMessage(String phoneNumber, String msg) {
    System.out.printf("Message is sent to %s.", this.phoneNumber + " " +  msg);
    System.out.println();
  }
}
