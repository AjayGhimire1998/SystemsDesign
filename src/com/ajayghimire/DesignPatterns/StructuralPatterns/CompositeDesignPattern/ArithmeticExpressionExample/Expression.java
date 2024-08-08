package com.ajayghimire.DesignPatterns.StructuralPatterns.CompositeDesignPattern.ArithmeticExpressionExample;

public class Expression implements ArithmeticExpression {
  private ArithmeticExpression leftExpression;
  private ArithmeticExpression rightExpression;
  private Operations operation;

  public Expression(
      ArithmeticExpression leftExpression,
      ArithmeticExpression rightExpression,
      Operations operation) {
    this.leftExpression = leftExpression;
    this.rightExpression = rightExpression;
    this.operation = operation;
  }

  /**
   * @return
   */
  @Override
  public int evaluate() {
    int value = 0;
    switch (this.operation) {
      case ADD:
        value = leftExpression.evaluate() + rightExpression.evaluate();
        break;
      case SUBTRACT:
        value = leftExpression.evaluate() - rightExpression.evaluate();
        break;
      case MULTIPLY:
        value = leftExpression.evaluate() * rightExpression.evaluate();
        break;
      case DIVIDE:
        value = leftExpression.evaluate() / rightExpression.evaluate();
        break;
      default:
        value = 0;
    }
    System.out.println("Evaluated Value is: " + value);
    return value;
  }
}
