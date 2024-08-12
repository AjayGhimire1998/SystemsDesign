package com.ajayghimire.DesignPatterns.LowLevelSystemDesign.StructuralPatterns.DecoratorDesignPattern.PizzaExample;

public class ExtraCheese extends ToppingsDecorator {
  BasePizza basePizza;

  public ExtraCheese(BasePizza basePizza) {
    this.basePizza = basePizza;
  }

  /**
   * @return
   */
  @Override
  public int cost() {
    return this.basePizza.cost() + 5;
  }
}
