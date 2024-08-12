package com.ajayghimire.DesignPatterns.LowLevelSystemDesign.BehavioralPatterns.MementoDesignPattern.ConfigurationExample;

public class ConfigMemento {
  private String configName;
  private double configVersion;

  public ConfigMemento(String configName, double configVersion) {
    this.configName = configName;
    this.configVersion = configVersion;
  }

  public String getConfigName() {
    return configName;
  }

  public void setConfigName(String configName) {
    this.configName = configName;
  }

  public double getConfigVersion() {
    return configVersion;
  }

  public void setConfigVersion(double configVersion) {
    this.configVersion = configVersion;
  }
}
