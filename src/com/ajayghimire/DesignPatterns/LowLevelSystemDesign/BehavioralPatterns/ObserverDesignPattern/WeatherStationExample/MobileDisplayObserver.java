package com.ajayghimire.DesignPatterns.LowLevelSystemDesign.BehavioralPatterns.ObserverDesignPattern.WeatherStationExample;

public class MobileDisplayObserver extends DisplayObservableImp {

  public MobileDisplayObserver(WeatherStationObservable observable, String name) {
    super(observable, name);

  }
  ;
}
