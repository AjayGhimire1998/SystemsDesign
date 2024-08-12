package com.ajayghimire.DesignPatterns.LowLevelSystemDesign.BehavioralPatterns.InterpreterDesignPattern.EmployeePaymentExample;

public class WeeklyTerminalPayIntervalExpression extends PayIntervalExpression {

  /**
   * @param context
   */
  @Override
  public int interpret(PayIntervalContext context) {
    return (int)
        ((int) context.getWeeklyWorkingDays() * HOURS_TO_WORK_IN_A_DAY * BASE_PAY_PER_HOUR);
  }
}
