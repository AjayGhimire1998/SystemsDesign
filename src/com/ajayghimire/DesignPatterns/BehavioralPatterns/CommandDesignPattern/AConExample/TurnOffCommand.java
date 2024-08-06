package com.ajayghimire.DesignPatterns.BehavioralPatterns.CommandDesignPattern.AConExample;

public class TurnOffCommand implements ICommand {

  private AirConditioner airConditioner;

  public TurnOffCommand(AirConditioner airConditioner) {
    this.airConditioner = airConditioner;
  }

  /** */
  @Override
  public void execute() {
    this.airConditioner.turnOff();
  }

  /** */
  @Override
  public void undo() {}
}
