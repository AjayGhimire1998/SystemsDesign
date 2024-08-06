package com.ajayghimire.designPatterns.behavioralPatterns.observerDesignPattern.weatherStationExample;

public class TVDisplayObserver extends DisplayObservableImp {

  public TVDisplayObserver(WeatherStationObservable observable, String name) {
    super(observable, name);
  }
}
