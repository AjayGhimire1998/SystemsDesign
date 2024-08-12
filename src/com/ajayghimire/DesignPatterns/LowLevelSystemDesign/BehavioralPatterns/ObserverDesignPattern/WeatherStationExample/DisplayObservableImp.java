package com.ajayghimire.DesignPatterns.LowLevelSystemDesign.BehavioralPatterns.ObserverDesignPattern.WeatherStationExample;

public class DisplayObservableImp implements DisplayObservable {

  WeatherStationObservable observable;
  int temperature;
  String name;

  public DisplayObservableImp(WeatherStationObservable observable, String name) {
    this.observable = observable;
    this.name = name;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getTemperature() {
    return temperature;
  }

  public void setTemperature(int temperature) {
    this.temperature = temperature;
  }

  /** */
  @Override
  public void update(int newTemp) {
    this.setTemperature(newTemp);
    System.out.printf(
        "%s has been notified!\n The new temperature is %d\n",
        this.getName(), this.getTemperature());
  }
}
