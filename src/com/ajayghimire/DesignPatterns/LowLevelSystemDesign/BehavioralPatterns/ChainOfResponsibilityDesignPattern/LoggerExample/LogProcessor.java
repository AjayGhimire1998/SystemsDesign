package com.ajayghimire.DesignPatterns.LowLevelSystemDesign.BehavioralPatterns.ChainOfResponsibilityDesignPattern.LoggerExample;

public class LogProcessor {

  public static final int INFO = 1;
  public static final int DEBUG = 2;
  public static final int ERROR = 3;

  public LogProcessor nextLogProcessor;

  public LogProcessor(LogProcessor logProcessor) {
    this.nextLogProcessor = logProcessor;
  }

  public void log(int logLevel, String message) {
    if (this.nextLogProcessor != null) {
      nextLogProcessor.log(logLevel, message);
    }
  }
}
