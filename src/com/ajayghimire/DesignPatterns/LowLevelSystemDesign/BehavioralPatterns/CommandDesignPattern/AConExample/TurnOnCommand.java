package com.ajayghimire.DesignPatterns.LowLevelSystemDesign.BehavioralPatterns.CommandDesignPattern.AConExample;

public class TurnOnCommand implements ICommand {
  private AirConditioner airConditioner;

  public TurnOnCommand(AirConditioner airConditioner) {
    this.airConditioner = airConditioner;
  }

  /** */
  @Override
  public void execute() {
    this.airConditioner.turnOn();
  }

  /** */
  @Override
  public void undo() {}
}
