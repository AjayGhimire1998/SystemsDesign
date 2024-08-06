package com.ajayghimire.designPatterns.behavioralPatterns.StrategyDesignPattern.vehiclesExample.strategy;

public class SportDriveStrategy implements  DriveStrategy{

/**
*
*/
  @Override
  public void drive() {
    System.out.println("Sports Drive!");
  }
}
