package com.ajayghimire.DesignPatterns.BehavioralPatterns.NullObjectDesignPattern;

public class NullAnimal implements Animal {
  private String type;

  public NullAnimal(String type) {
    this.type = type;
  }

  /** */
  @Override
  public void makeSound() {
    System.err.printf("Sound cannot be identified for a %s.", type);
  }
}
