package com.ajayghimire.DesignPatterns.LowLevelSystemDesign.BehavioralPatterns.ChainOfResponsibilityDesignPattern.LoggerExample;

public class InfoLogProcessor extends LogProcessor {

  public InfoLogProcessor(LogProcessor nextlogProcessor) {
    super(nextlogProcessor);
  }

  /**
   * @param logLevel
   * @param message
   */
  @Override
  public void log(int logLevel, String message) {
    if (INFO == logLevel) {
      System.out.println("INFO: " + message);
      return;
    }
    super.log(logLevel, message);
  }
}
