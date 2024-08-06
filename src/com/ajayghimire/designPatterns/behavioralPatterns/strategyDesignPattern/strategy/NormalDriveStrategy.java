package com.ajayghimire.designPatterns.behavioralPatterns.strategyDesignPattern.strategy;

public class NormalDriveStrategy implements DriveStrategy {

  @Override
  public void drive() {
    System.out.println("Normal Drive!");
  }
}
