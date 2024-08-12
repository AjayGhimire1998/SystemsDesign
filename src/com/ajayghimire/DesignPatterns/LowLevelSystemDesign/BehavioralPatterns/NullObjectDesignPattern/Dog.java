package com.ajayghimire.DesignPatterns.LowLevelSystemDesign.BehavioralPatterns.NullObjectDesignPattern;

public class Dog implements Animal {
  private static final Dog DOG_INSTANCE = new Dog();

  private Dog() {}

  public static final Dog getInstance() {
    if (DOG_INSTANCE != null) {
      return DOG_INSTANCE;
    }
    return new Dog();
  }

  /** */
  @Override
  public void makeSound() {
    System.out.println("Bark Bark!");
  }
}
