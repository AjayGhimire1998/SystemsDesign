package com.ajayghimire.DesignPatterns.BehavioralPatterns.StrategyDesignPattern;

import com.ajayghimire.DesignPatterns.BehavioralPatterns.StrategyDesignPattern.vehiclesExample.strategy.NormalDriveStrategy;

public class OffRoadVehicle extends Vehicle {

  OffRoadVehicle(int make, String brand) {
    super(new NormalDriveStrategy(), make, brand);
  }
}
