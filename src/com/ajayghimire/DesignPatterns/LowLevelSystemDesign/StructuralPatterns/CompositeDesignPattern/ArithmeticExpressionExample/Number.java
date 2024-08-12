package com.ajayghimire.DesignPatterns.LowLevelSystemDesign.StructuralPatterns.CompositeDesignPattern.ArithmeticExpressionExample;

public class Number implements ArithmeticExpression {
  private int value;

  public Number(int value) {
    this.value = value;
  }

  /**
   * @return
   */
  @Override
  public int evaluate() {
    System.out.println("The number is: " + this.value);
    return this.value;
  }
}
