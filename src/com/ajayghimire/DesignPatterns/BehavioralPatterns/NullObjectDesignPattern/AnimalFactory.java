package com.ajayghimire.DesignPatterns.BehavioralPatterns.NullObjectDesignPattern;

public class AnimalFactory {
  public static Animal getAnimalInstance(String type) {
    if (type.equalsIgnoreCase("dog")) {
      return Dog.getInstance();
    } else if (type.equalsIgnoreCase("cat")) {
      return Cat.getInstance();
    }
    return new NullAnimal(type);
  }
}
