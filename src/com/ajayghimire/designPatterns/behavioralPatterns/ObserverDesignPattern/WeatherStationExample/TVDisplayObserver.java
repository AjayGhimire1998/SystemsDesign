package com.ajayghimire.designPatterns.behavioralPatterns.ObserverDesignPattern.WeatherStationExample;

public class TVDisplayObserver extends DisplayObservableImp {

  public TVDisplayObserver(WeatherStationObservable observable, String name) {
    super(observable, name);
  }
}
