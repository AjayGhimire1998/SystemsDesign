package com.ajayghimire.DesignPatterns.LowLevelSystemDesign.BehavioralPatterns.ChainOfResponsibilityDesignPattern.LoggerExample;

public class DebugLogProcessor extends LogProcessor {

  public DebugLogProcessor(LogProcessor nextLogProcessor) {
    super(nextLogProcessor);
  }

  /**
   * @param logLevel
   * @param message
   */
  @Override
  public void log(int logLevel, String message) {
    if (DEBUG == logLevel) {
      System.out.println("DEBUG: " + message);
      return;
    }
    super.log(logLevel, message);
  }
}
