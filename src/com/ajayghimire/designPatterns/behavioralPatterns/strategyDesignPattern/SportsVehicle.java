package com.ajayghimire.designPatterns.behavioralPatterns.strategyDesignPattern;

import com.ajayghimire.designPatterns.behavioralPatterns.strategyDesignPattern.strategy.DriveStrategy;
import com.ajayghimire.designPatterns.behavioralPatterns.strategyDesignPattern.strategy.SportDriveStrategy;

public class SportsVehicle extends Vehicle {

  SportsVehicle( int make, String brand) {
    super(new SportDriveStrategy(), make, brand);
  }
}
