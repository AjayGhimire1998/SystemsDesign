package com.ajayghimire.DesignPatterns.StructuralPatterns.DecoratorDesignPattern.PizzaExample;

public class ExtraMushroom extends ToppingsDecorator {
  BasePizza basePizza;

  public ExtraMushroom(BasePizza basePizza) {
    this.basePizza = basePizza;
  }

  /**
   * @return
   */
  @Override
  public int cost() {
    return this.basePizza.cost() + 3;
  }
}
