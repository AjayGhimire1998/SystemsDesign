package com.ajayghimire.DesignPatterns.StructuralPatterns.CompositeDesignPattern.ArithmeticExpressionExample;

public class Number implements ArithmeticExpression {
  private int value;

  /**
   * @return
   */
  @Override
  public int evaluate() {
    System.out.println("The number is: " + this.value);
    return this.value;
  }
}
