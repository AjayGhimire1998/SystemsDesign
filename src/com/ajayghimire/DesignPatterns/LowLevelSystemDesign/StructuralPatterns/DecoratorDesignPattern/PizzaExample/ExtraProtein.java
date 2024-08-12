package com.ajayghimire.DesignPatterns.LowLevelSystemDesign.StructuralPatterns.DecoratorDesignPattern.PizzaExample;

public class ExtraProtein extends ToppingsDecorator {
BasePizza basePizza;

  public ExtraProtein(BasePizza basePizza) {
    this.basePizza = basePizza;
  }

  /**
   * @return
   */
  @Override
  public int cost() {
    return this.basePizza.cost() + 8;
  }
}
