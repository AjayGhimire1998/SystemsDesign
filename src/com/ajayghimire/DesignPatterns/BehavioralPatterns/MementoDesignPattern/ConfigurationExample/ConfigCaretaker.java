package com.ajayghimire.DesignPatterns.BehavioralPatterns.MementoDesignPattern.ConfigurationExample;

import java.util.ArrayList;
import java.util.List;

public class ConfigCaretaker {

  List<ConfigMemento> history = new ArrayList<>();

  public void addMemento(ConfigMemento mementoToAdd) {
    history.add(mementoToAdd);
  }

  public ConfigMemento undo() {
    if (!history.isEmpty()) {
      int lastMementoIndex = history.size() - 1;

      ConfigMemento lastMemento = history.get(lastMementoIndex);
      history.remove(lastMementoIndex);
      return lastMemento;
    }
    return null;
  }
}
