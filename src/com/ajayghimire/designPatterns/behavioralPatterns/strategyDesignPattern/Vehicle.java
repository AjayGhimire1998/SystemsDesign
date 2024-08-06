package com.ajayghimire.designPatterns.behavioralPatterns.strategyDesignPattern;

import com.ajayghimire.designPatterns.behavioralPatterns.strategyDesignPattern.strategy.DriveStrategy;

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
