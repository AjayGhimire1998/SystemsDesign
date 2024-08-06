package com.ajayghimire.DesignPatterns.BehavioralPatterns.CommandDesignPattern.AConExample;

public class Main {
  public static void main(String[] args) {
    AirConditioner airConditioner = new AirConditioner();

    ICommand turnOnCommand = new TurnOnCommand(airConditioner);
    turnOnCommand.execute();

    CommandInputable setTempCommand = new SetTemperatureCommand(airConditioner);
    setTempCommand.execute(19);

    ICommand turnOffCommand = new TurnOffCommand(airConditioner);
    turnOffCommand.execute();
    setTempCommand.execute(15);
  }
}
