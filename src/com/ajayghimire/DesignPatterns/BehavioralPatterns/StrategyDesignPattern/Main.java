package com.ajayghimire.DesignPatterns.BehavioralPatterns.StrategyDesignPattern;

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
