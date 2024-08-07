package com.ajayghimire.DesignPatterns.BehavioralPatterns.InterpreterDesignPattern.EmployeePaymentExample;

public enum PayIntervalContext {
  WEEKLY(7),
  FORTNIGHTLY(15),
  MONTHLY(30);

  private int days;

  PayIntervalContext(int numberOfDays) {
    this.days = numberOfDays;
  }

  public int getDays() {
    return days;
  }
}
