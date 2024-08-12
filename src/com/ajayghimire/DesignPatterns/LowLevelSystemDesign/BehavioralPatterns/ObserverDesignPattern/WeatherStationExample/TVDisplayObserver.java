package com.ajayghimire.DesignPatterns.LowLevelSystemDesign.BehavioralPatterns.ObserverDesignPattern.WeatherStationExample;

public class TVDisplayObserver extends DisplayObservableImp {

  public TVDisplayObserver(WeatherStationObservable observable, String name) {
    super(observable, name);
  }
}
