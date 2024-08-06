package com.ajayghimire.DesignPatterns.BehavioralPatterns.CommandDesignPattern.AConExample;

public class AirConditioner {
  private boolean isOn;
  private int temperature;

  public void turnOn() {
    this.isOn = true;
    System.out.println("AC is turned on!");
  }

  public void turnOff() {
    this.isOn = false;
    System.out.println("AC is turned off!");
  }

  public int getTemperature() {
    System.out.println("Current temperature is: " + this.temperature);
    return this.temperature;
  }

  public void setTemperature(int temperature) {
    this.temperature = temperature;
    System.out.println("Temperature is changed to: " + temperature);
  }
}
