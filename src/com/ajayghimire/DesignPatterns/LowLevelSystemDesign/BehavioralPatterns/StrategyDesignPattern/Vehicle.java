package com.ajayghimire.DesignPatterns.LowLevelSystemDesign.BehavioralPatterns.StrategyDesignPattern;

import com.ajayghimire.DesignPatterns.LowLevelSystemDesign.BehavioralPatterns.StrategyDesignPattern.vehiclesExample.strategy.DriveStrategy;

public class Vehicle {
  public DriveStrategy driveStrategy;
  int make;
  String brand;


  Vehicle(DriveStrategy strategy, int make, String brand) {
    this.driveStrategy = strategy;
    this.make = make;
    this.brand = brand;
  }

  public void drive() {
    this.driveStrategy.drive();
  }
}
