package com.ajayghimire.DesignPatterns.LowLevelSystemDesign.StructuralPatterns.CompositeDesignPattern.ArithmeticExpressionExample;

public class ClientMain {
  public static void main(String[] args) {
    Number number1 = new Number(5);
    Number number2 = new Number(10);
    Number number3 = new Number(20);

    Expression expression = new Expression(number1, number2, Operations.ADD);
    expression.evaluate();

    Expression expression2 = new Expression(number1, number2, Operations.SUBTRACT);
    expression2.evaluate();
  }
}
