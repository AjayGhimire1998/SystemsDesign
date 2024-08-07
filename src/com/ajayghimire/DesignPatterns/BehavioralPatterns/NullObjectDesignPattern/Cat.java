package com.ajayghimire.DesignPatterns.BehavioralPatterns.NullObjectDesignPattern;

public class Cat implements Animal {

  private Cat() {}

  public static final Cat getInstance() {
    return new Cat();
  }

  /** */
  @Override
  public void makeSound() {
    System.out.println("Meow Meow!");
  }
}
