package com.ajayghimire.DesignPatterns.LowLevelSystemDesign.BehavioralPatterns.ObserverDesignPattern.WeatherStationExample;

public interface WeatherStationObservable {

  void add(DisplayObservable obj);

  void remove(DisplayObservable obj);

  void notifyObservers();

  void setNewTemperature(int temperature);

//  DisplayObservable getObserver();
}
