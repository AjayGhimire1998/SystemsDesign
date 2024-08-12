package com.ajayghimire.DesignPatterns.LowLevelSystemDesign.StructuralPatterns.DecoratorDesignPattern.PizzaExample;

public class ClientMain {
  public static void main(String[] args) {
    BasePizza pizza = new DoubleCheese();
    BasePizza extraCheese = new ExtraCheese(pizza);
    BasePizza extraProtein = new ExtraProtein(extraCheese);
    BasePizza extraMushroom = new ExtraMushroom(extraProtein);
    System.out.println(extraMushroom.cost());
  }
}
