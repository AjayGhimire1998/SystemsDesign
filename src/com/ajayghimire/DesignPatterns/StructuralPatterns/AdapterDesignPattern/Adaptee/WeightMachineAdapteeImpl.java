package com.ajayghimire.DesignPatterns.StructuralPatterns.AdapterDesignPattern.Adaptee;

public class WeightMachineAdapteeImpl implements WeightMachineAdaptee {

  /**
   * @return
   */
  @Override
  public double getWeightInPounds() {
    return 28;
  }
}
