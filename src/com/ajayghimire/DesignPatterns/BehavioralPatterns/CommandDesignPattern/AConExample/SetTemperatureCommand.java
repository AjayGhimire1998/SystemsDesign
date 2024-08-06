package com.ajayghimire.DesignPatterns.BehavioralPatterns.CommandDesignPattern.AConExample;

public class SetTemperatureCommand implements ICommand {

  private AirConditioner airConditioner;
  private int temperature;

  public SetTemperatureCommand(AirConditioner airConditioner, int temperature) {
    this.airConditioner = airConditioner;
    this.temperature = temperature;
  }

  /** */
  @Override
  public void execute() {
    this.airConditioner.setTemperature(this.temperature);
  }

  /** */
  @Override
  public void undo() {}
}
