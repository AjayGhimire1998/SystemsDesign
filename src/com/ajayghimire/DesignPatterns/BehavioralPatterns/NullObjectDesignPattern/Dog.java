package com.ajayghimire.DesignPatterns.BehavioralPatterns.NullObjectDesignPattern;

public class Dog implements Animal {
  private Dog() {}

  public static final Dog getInstance() {
    return new Dog();
  }
  /** */
  @Override
  public void makeSound() {
    System.out.println("Bark Bark!");
  }
}
