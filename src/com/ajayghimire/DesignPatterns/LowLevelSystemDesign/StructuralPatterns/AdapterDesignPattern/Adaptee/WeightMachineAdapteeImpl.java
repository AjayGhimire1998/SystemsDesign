package com.ajayghimire.DesignPatterns.LowLevelSystemDesign.StructuralPatterns.AdapterDesignPattern.Adaptee;

public class WeightMachineAdapteeImpl implements WeightMachineAdaptee {

  /**
   * @return
   */
  @Override
  public double getWeightInPounds() {
    return 28;
  }
}
