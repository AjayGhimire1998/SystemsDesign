package com.ajayghimire.DesignPatterns.BehavioralPatterns.CommandDesignPattern.AConExample;

public class RemoteController {
  ICommand command;

  public void setCommand(ICommand command) {
    this.command = command;
  }

  public void pressButton() {
    this.command.execute();
  }


}
