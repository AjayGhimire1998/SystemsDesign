package com.ajayghimire.designPatterns.behavioralPatterns.ObserverDesignPattern.WeatherStationExample;

public class MobileDisplayObserver extends DisplayObservableImp {

  public MobileDisplayObserver(WeatherStationObservable observable, String name) {
    super(observable, name);

  }
  ;
}
