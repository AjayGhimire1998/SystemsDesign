package com.ajayghimire.DesignPatterns.BehavioralPatterns.InterpreterDesignPattern.EmployeePaymentExample;

public class MainClient {
  public static void main(String[] args) {
    PayIntervalExpression terminalPayIntervalExpression = new WeeklyTerminalPayIntervalExpression();

    PayIntervalContext context = PayIntervalContext.WEEKLY;
    PayIntervalExpression fortnightlyPay =
        new FortnightlyPayExpression(terminalPayIntervalExpression);
    fortnightlyPay.interpret(context);

    PayIntervalExpression monthlyPay = new MonthlyPayExpression(terminalPayIntervalExpression);
    monthlyPay.interpret(context);
  }
}
