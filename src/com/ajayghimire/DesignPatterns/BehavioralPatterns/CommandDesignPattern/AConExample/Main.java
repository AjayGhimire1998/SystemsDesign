package com.ajayghimire.DesignPatterns.BehavioralPatterns.CommandDesignPattern.AConExample;

public class Main {
  public static void main(String[] args) {
    AirConditioner airConditioner = new AirConditioner();

    RemoteController remoteController = new RemoteController();
    ICommand turnOnCommand = new TurnOnCommand(airConditioner);
    remoteController.setCommand(turnOnCommand);
    remoteController.pressButton();

    ICommand setTempCommand = new SetTemperatureCommand(airConditioner, 24);
    remoteController.setCommand(setTempCommand);
    remoteController.pressButton();

    ICommand turnOffCommand = new TurnOffCommand(airConditioner);
    remoteController.setCommand(turnOffCommand);
    remoteController.pressButton();

    remoteController.setCommand(new SetTemperatureCommand(airConditioner, 100));
    remoteController.pressButton();
  }
}
