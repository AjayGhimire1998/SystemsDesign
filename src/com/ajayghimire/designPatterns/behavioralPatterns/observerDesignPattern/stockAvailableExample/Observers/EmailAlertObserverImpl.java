package com.ajayghimire.designPatterns.behavioralPatterns.observerDesignPattern.stockAvailableExample.Observers;

import com.ajayghimire.designPatterns.behavioralPatterns.observerDesignPattern.stockAvailableExample.Observable.StockObservable;

public class EmailAlertObserverImpl implements AlertObserver {
  String emailID;
  StockObservable stockObservable;

  public EmailAlertObserverImpl(String emailID, StockObservable stockObservable) {
    this.emailID = emailID;
    this.stockObservable = stockObservable;
  }

  /** */
  @Override
  public void update() {
    sendEmail(emailID, "Product is back in stock, hurry up!!");
  }

  private void sendEmail(String emailID, String msg) {
    System.out.printf("Email is sent to %s.", this.emailID + " " + msg);
    System.out.println();
  }
}
