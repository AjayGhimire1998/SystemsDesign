package com.ajayghimire.DesignPatterns.BehavioralPatterns.InterpreterDesignPattern.EmployeePaymentExample;

public enum PayIntervalContext {
  WEEKLY(5);

  private int numberOfDaysToWork;

  PayIntervalContext(int days) {
    this.numberOfDaysToWork = days;
  }

  public int getWeeklyWorkingDays() {
    return PayIntervalContext.WEEKLY.numberOfDaysToWork;
  }
}
