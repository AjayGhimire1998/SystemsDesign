package com.ajayghimire.DesignPatterns.LowLevelSystemDesign.BehavioralPatterns.ChainOfResponsibilityDesignPattern.LoggerExample;

public class Main {
  public static void main(String[] args) {
    LogProcessor logProcessor =
        new LogProcessor(new InfoLogProcessor(new DebugLogProcessor(new ErrorLogProcessor(null))));

    logProcessor.log(LogProcessor.INFO, "Information about the request");
    logProcessor.log(LogProcessor.DEBUG, "Debugging the request");
    logProcessor.log(LogProcessor.ERROR, "Exception happened in the request");
  }
}
