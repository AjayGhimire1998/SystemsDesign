package com.ajayghimire.DesignPatterns.BehavioralPatterns.InterpreterDesignPattern.EmployeePaymentExample;

public abstract class PayIntervalExpression {
  public final double BASE_PAY_PER_HOUR = 27.09;
  public final int HOURS_TO_WORK_IN_A_DAY = 8;
  public final int HOURS_TO_WORK_IN_A_WEEK = 38;

  public abstract int interpret(PayIntervalContext context);
}
