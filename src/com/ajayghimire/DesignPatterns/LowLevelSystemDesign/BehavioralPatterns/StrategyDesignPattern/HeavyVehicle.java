package com.ajayghimire.DesignPatterns.LowLevelSystemDesign.BehavioralPatterns.StrategyDesignPattern;

import com.ajayghimire.DesignPatterns.LowLevelSystemDesign.BehavioralPatterns.StrategyDesignPattern.vehiclesExample.strategy.NormalDriveStrategy;

public class HeavyVehicle extends Vehicle {

  HeavyVehicle(int make, String brand) {
    super(new NormalDriveStrategy(), make, brand);
  }
}
