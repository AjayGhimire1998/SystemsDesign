package com.ajayghimire.designPatterns.behavioralPatterns.StrategyDesignPattern;

import com.ajayghimire.designPatterns.behavioralPatterns.StrategyDesignPattern.vehiclesExample.strategy.SportDriveStrategy;

public class SportsVehicle extends Vehicle {

  SportsVehicle( int make, String brand) {
    super(new SportDriveStrategy(), make, brand);
  }
}
