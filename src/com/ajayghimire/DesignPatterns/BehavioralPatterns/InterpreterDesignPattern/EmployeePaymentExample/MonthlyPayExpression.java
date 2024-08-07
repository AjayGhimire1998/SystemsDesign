package com.ajayghimire.DesignPatterns.BehavioralPatterns.InterpreterDesignPattern.EmployeePaymentExample;

public class MonthlyPayExpression extends PayIntervalExpression {
  PayIntervalExpression terminalExpression;

  public MonthlyPayExpression(PayIntervalExpression terminalExpression) {
    this.terminalExpression = terminalExpression;
  }

  /**
   * @param context
   * @return
   */
  @Override
  public int interpret(PayIntervalContext context) {
    double monthlyPay = terminalExpression.interpret(context) * 4;
    System.out.println("Monthly Paid Out: " + monthlyPay);
    return (int) monthlyPay;
  }
}
