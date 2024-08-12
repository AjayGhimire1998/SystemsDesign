package com.ajayghimire.DesignPatterns.LowLevelSystemDesign.BehavioralPatterns.InterpreterDesignPattern.EmployeePaymentExample;

public class FortnightlyPayExpression extends PayIntervalExpression {
  PayIntervalExpression terminalExpression;

  public FortnightlyPayExpression(PayIntervalExpression terminalExpression) {
    this.terminalExpression = terminalExpression;
  }

  /**
   * @param context
   */
  @Override
  public int interpret(PayIntervalContext context) {
    double fortnightlyPay =
        terminalExpression.interpret(context) * 2;
    System.out.println("Fortnight Paid Out: " + fortnightlyPay);
    return (int) fortnightlyPay;
  }
}
