package com.ajayghimire.DesignPatterns.LowLevelSystemDesign.BehavioralPatterns.InterpreterDesignPattern.EmployeePaymentExample;

public class MainClient {
  public static void main(String[] args) {
    PayIntervalExpression terminalPayIntervalExpression = new WeeklyTerminalPayIntervalExpression();

    PayIntervalContext context = PayIntervalContext.WEEKLY;

    PayIntervalExpression weeklyPay = new WeeklyTerminalPayIntervalExpression();
    System.out.println(weeklyPay.interpret(context));

    PayIntervalExpression fortnightlyPay =
        new FortnightlyPayExpression(terminalPayIntervalExpression);
    fortnightlyPay.interpret(context);

    PayIntervalExpression monthlyPay = new MonthlyPayExpression(terminalPayIntervalExpression);
    monthlyPay.interpret(context);
  }
}
