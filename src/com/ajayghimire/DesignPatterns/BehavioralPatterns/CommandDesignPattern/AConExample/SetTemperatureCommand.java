package com.ajayghimire.DesignPatterns.BehavioralPatterns.CommandDesignPattern.AConExample;

public class SetTemperatureCommand implements CommandInputable {

  private AirConditioner airConditioner;

  public SetTemperatureCommand(AirConditioner airConditioner) {
    this.airConditioner = airConditioner;
  }

  //  /** */
  //  @Override
  //  public void execute() {
  //    throw new
  //  }
  //
  //  /** */
  //  @Override
  //  public void undo() {}

  /**
   * @param t
   * @param <T>
   */
  @Override
  public <T> void execute(T t) {
    this.airConditioner.setTemperature((int) t);
  }
}
