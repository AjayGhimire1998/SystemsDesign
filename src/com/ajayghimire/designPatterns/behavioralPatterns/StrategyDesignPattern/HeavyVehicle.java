package com.ajayghimire.designPatterns.behavioralPatterns.StrategyDesignPattern;

import com.ajayghimire.designPatterns.behavioralPatterns.StrategyDesignPattern.vehiclesExample.strategy.NormalDriveStrategy;

public class HeavyVehicle extends Vehicle {

  HeavyVehicle(int make, String brand) {
    super(new NormalDriveStrategy(), make, brand);
  }
}
