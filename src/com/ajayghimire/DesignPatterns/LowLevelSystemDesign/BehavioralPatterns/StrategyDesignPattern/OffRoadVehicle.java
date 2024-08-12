package com.ajayghimire.DesignPatterns.LowLevelSystemDesign.BehavioralPatterns.StrategyDesignPattern;

import com.ajayghimire.DesignPatterns.LowLevelSystemDesign.BehavioralPatterns.StrategyDesignPattern.vehiclesExample.strategy.NormalDriveStrategy;

public class OffRoadVehicle extends Vehicle {

  OffRoadVehicle(int make, String brand) {
    super(new NormalDriveStrategy(), make, brand);
  }
}
