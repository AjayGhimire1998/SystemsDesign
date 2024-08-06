package com.ajayghimire.designPatterns.behavioralPatterns.observerDesignPattern.weatherStationExample;

public class MobileDisplayObserver extends DisplayObservableImp {

  public MobileDisplayObserver(WeatherStationObservable observable, String name) {
    super(observable, name);

  }
  ;
}
