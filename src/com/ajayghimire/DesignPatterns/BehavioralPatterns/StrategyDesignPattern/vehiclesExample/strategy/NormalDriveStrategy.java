package com.ajayghimire.DesignPatterns.BehavioralPatterns.StrategyDesignPattern.vehiclesExample.strategy;

public class NormalDriveStrategy implements DriveStrategy {

  @Override
  public void drive() {
    System.out.println("Normal Drive!");
  }
}
