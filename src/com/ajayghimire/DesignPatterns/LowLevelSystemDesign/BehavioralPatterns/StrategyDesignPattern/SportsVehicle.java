package com.ajayghimire.DesignPatterns.LowLevelSystemDesign.BehavioralPatterns.StrategyDesignPattern;

import com.ajayghimire.DesignPatterns.LowLevelSystemDesign.BehavioralPatterns.StrategyDesignPattern.vehiclesExample.strategy.SportDriveStrategy;

public class SportsVehicle extends Vehicle {

  SportsVehicle(int make, String brand) {
    super(new SportDriveStrategy(), make, brand);
  }
}
