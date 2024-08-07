package com.ajayghimire.DesignPatterns.BehavioralPatterns.NullObjectDesignPattern;

public class ClientMain {
  public static void main(String[] args) {
    Animal dog = AnimalFactory.getAnimalInstance("dog");
    Animal dog2 = AnimalFactory.getAnimalInstance("dog");

    System.out.println(dog == dog2);
    Animal cat = AnimalFactory.getAnimalInstance("cat");
    Animal fox = AnimalFactory.getAnimalInstance("fox");
    dog.makeSound();
    cat.makeSound();
    fox.makeSound();
  }
}
