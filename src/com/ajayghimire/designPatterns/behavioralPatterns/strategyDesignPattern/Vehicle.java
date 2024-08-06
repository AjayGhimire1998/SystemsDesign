package com.ajayghimire.designPatterns.behavioralPatterns.strategyDesignPattern;

import com.ajayghimire.designPatterns.behavioralPatterns.strategyDesignPattern.strategy.DriveStrategy;

public class Vehicle {
  public DriveStrategy driveStrategy;

  Vehicle(DriveStrategy strategy) {
    this.driveStrategy = strategy;
  }
}
