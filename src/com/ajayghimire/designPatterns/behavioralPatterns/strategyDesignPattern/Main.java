package com.ajayghimire.designPatterns.behavioralPatterns.strategyDesignPattern;

import com.ajayghimire.designPatterns.behavioralPatterns.strategyDesignPattern.strategy.NormalDriveStrategy;
import com.ajayghimire.designPatterns.behavioralPatterns.strategyDesignPattern.strategy.SportDriveStrategy;

public class Main {
  public static void main(String[] args) {
    Vehicle car = new SportsVehicle(2020, "Porsche");
    car.drive();

    Vehicle lorry = new HeavyVehicle(2015, "Mercedes");
    lorry.drive();

    Vehicle jeep = new OffRoadVehicle(2010, "Mahindra");
    jeep.drive();
  }
}
