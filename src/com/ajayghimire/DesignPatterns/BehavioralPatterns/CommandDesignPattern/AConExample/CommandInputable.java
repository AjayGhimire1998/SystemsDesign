package com.ajayghimire.DesignPatterns.BehavioralPatterns.CommandDesignPattern.AConExample;

public interface CommandInputable extends ICommand {
  <T> void execute(T t);

  /** */
  @Override
  default void execute() {
    execute(0);
  }

  /** */
  @Override
  default void undo() {
    System.out.println("Undo is not supported yet!");
  }
}
