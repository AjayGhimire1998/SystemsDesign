package com.ajayghimire.DesignPatterns.BehavioralPatterns.MementoDesignPattern.ConfigurationExample;

public class ConfigOriginator {
  private String configName;
  private double configVersion;

  public ConfigOriginator(String configName, double configVersion) {
    this.configName = configName;
    this.configVersion = configVersion;
  }

  public void setConfigName(String configName) {
    this.configName = configName;
  }

  public void setConfigVersion(double configVersion) {
    this.configVersion = configVersion;
  }

  public ConfigMemento createMemento() {
    return new ConfigMemento(this.configName, this.configVersion);
  }

  public void restoreMemento(ConfigMemento mementoToRestore) {
    this.configName = mementoToRestore.getConfigName();
    this.configVersion = mementoToRestore.getConfigVersion();
  }

  @Override
  public String toString() {
    return "ConfigOriginator{"
        + "configName='"
        + configName
        + '\''
        + ", configVersion="
        + configVersion
        + '}';
  }
}
