package com.ajayghimire.designPatterns.behavioralPatterns.strategyDesignPattern;

import com.ajayghimire.designPatterns.behavioralPatterns.strategyDesignPattern.strategy.DriveStrategy;
import com.ajayghimire.designPatterns.behavioralPatterns.strategyDesignPattern.strategy.NormalDriveStrategy;

public class OffRoadVehicle extends Vehicle {

  OffRoadVehicle(int make, String brand) {
    super(new NormalDriveStrategy(), make, brand);
  }
}
