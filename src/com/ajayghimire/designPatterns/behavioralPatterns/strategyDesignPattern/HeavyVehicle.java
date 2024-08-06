package com.ajayghimire.designPatterns.behavioralPatterns.strategyDesignPattern;

import com.ajayghimire.designPatterns.behavioralPatterns.strategyDesignPattern.vehiclesExample.strategy.NormalDriveStrategy;

public class HeavyVehicle extends Vehicle {

  HeavyVehicle(int make, String brand) {
    super(new NormalDriveStrategy(), make, brand);
  }
}
