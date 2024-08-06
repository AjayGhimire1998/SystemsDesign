package com.ajayghimire.DesignPatterns.BehavioralPatterns.ChainOfResponsibilityDesignPattern.LoggerExample;

public class ErrorLogProcessor extends LogProcessor {

  public ErrorLogProcessor(LogProcessor nextLogProcessor) {
    super(nextLogProcessor);
  }

  /**
   * @param logLevel
   * @param message
   */
  @Override
  public void log(int logLevel, String message) {
    if (ERROR == logLevel) {
      System.out.println("Error: " + message);
      return;
    }
    super.log(logLevel, message);
  }
}
