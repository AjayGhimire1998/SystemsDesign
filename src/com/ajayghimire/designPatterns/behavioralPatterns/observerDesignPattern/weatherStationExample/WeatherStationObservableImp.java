package com.ajayghimire.designPatterns.behavioralPatterns.observerDesignPattern.weatherStationExample;

import java.util.ArrayList;
import java.util.List;

public class WeatherStationObservableImp implements WeatherStationObservable {

  int temperature;
  private List<DisplayObservable> displayObservableList = new ArrayList<>();

  public List<DisplayObservable> getDisplayObservableList() {
    return displayObservableList;
  }

  public int getTemperature() {
    return temperature;
  }

  public void setTemperature(int temperature) {
    this.temperature = temperature;
  }

  /**
   * @param obj
   */
  @Override
  public void add(DisplayObservable obj) {
    this.displayObservableList.add(obj);
  }

  /**
   * @param obj
   */
  @Override
  public void remove(DisplayObservable obj) {
    this.displayObservableList.remove(obj);
  }

  /** */
  @Override
  public void notifyObservers() {
    for (DisplayObservable observer : displayObservableList) {

      observer.update(this.temperature);
    }
  }

  /** */
  @Override
  public void setNewTemperature(int temp) {
    if (this.temperature == temp) {
      System.out.println("Temperature is same. So no update happened!");
      return;
    }
    this.setTemperature(temp);
    this.notifyObservers();

  }

  //  /**
  //   * @return
  //   */
  //  @Override
  //  public DisplayObservable getObserver() {
  //    return null;
  //  }
}
