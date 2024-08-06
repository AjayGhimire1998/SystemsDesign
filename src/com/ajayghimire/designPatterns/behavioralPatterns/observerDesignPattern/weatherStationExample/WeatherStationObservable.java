package com.ajayghimire.designPatterns.behavioralPatterns.observerDesignPattern.weatherStationExample;

import java.util.ArrayList;
import java.util.List;

public interface WeatherStationObservable {

  void add(DisplayObservable obj);

  void remove(DisplayObservable obj);

  void notifyObservers();

  void setNewTemperature(int temperature);

//  DisplayObservable getObserver();
}
