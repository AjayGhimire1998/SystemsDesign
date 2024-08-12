package com.ajayghimire.DesignPatterns.LowLevelSystemDesign.BehavioralPatterns.NullObjectDesignPattern;

public class Cat implements Animal {
  private static final Cat CAT_INSTANCE = new Cat();

  private Cat() {}

  public static final Cat getInstance() {

    if (CAT_INSTANCE != null) {
      return CAT_INSTANCE;
    }
    return new Cat();
  }

  /** */
  @Override
  public void makeSound() {
    System.out.println("Meow Meow!");
  }
}
