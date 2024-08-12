package com.ajayghimire.DesignPatterns.LowLevelSystemDesign.BehavioralPatterns.MementoDesignPattern.ConfigurationExample;

import java.util.ArrayList;
import java.util.List;

public class ConfigCaretaker {

  List<ConfigMemento> history = new ArrayList<>();

  public void addMemento(ConfigMemento mementoToAdd) {
    history.add(mementoToAdd);
  }

  public ConfigMemento undo() throws Exception {
    if (!history.isEmpty()) {
      int lastMementoIndex = history.size() - 1;

      ConfigMemento lastMemento = history.get(lastMementoIndex);
      history.remove(lastMementoIndex);
      return lastMemento;
    }
    throw new Exception("No more memento snapshot to restore.");
  }
}
