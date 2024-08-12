package com.ajayghimire.DesignPatterns.LowLevelSystemDesign.BehavioralPatterns.MementoDesignPattern.ConfigurationExample;

public class ClientMain {
  public static void main(String[] args) {
    ConfigCaretaker configCaretaker = new ConfigCaretaker();

    // initialise an originator
    ConfigOriginator configOriginator = new ConfigOriginator("CI/CD", 2.0);
    System.out.println("Creation: " + configOriginator);
    // save a snapshot
    ConfigMemento configMementoSnapshot1 = configOriginator.createMemento();

    // add the snapshot to the caretaker's history
    configCaretaker.addMemento(configMementoSnapshot1);

    // changing originator's states
    configOriginator.setConfigName("CI/CD");
    configOriginator.setConfigVersion(2.6);
    System.out.println("First Change: " + configOriginator);
    // save another snapshot of originator, add to history and change states again
    ConfigMemento configMementoSnapshot2 = configOriginator.createMemento();
    configCaretaker.addMemento(configMementoSnapshot2);
    configOriginator.setConfigName("CI/CD");
    configOriginator.setConfigVersion(3.1);

    System.out.println("Second Change: " + configOriginator);
    // undo and restoring
    ConfigMemento mementoToRestore = null;
    try {
      mementoToRestore = configCaretaker.undo();
    } catch (Exception e) {
      System.out.println(e.getMessage());
    }
    configOriginator.restoreMemento(mementoToRestore);
    System.out.println("Restored last memento: " + configOriginator);

    try {
      configOriginator.restoreMemento(configCaretaker.undo());
    } catch (Exception e) {
      System.out.println(e.getMessage());
    }
    System.out.println("Last restored memento: " + configOriginator);

    try {
      configOriginator.restoreMemento(configCaretaker.undo());
    } catch (Exception e) {
      System.out.println(e.getMessage());
    }
    System.out.println("Last restored memento: " + configOriginator);
  }
}
