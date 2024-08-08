package com.ajayghimire.DesignPatterns.StructuralPatterns.AdapterDesignPattern.Adapter;

import com.ajayghimire.DesignPatterns.StructuralPatterns.AdapterDesignPattern.Adaptee.WeightMachineAdaptee;

public class WeightMachineAdapterImpl implements WeightMachineAdapter {
  private WeightMachineAdaptee weightMachineAdaptee;

  public WeightMachineAdapterImpl(WeightMachineAdaptee client) {
    this.weightMachineAdaptee = client;
  }

  /**
   * @return
   */
  @Override
  public double getWeightInKilograms() {
    double weightInPounds = this.weightMachineAdaptee.getWeightInPounds();
    double weightInKilograms = weightInPounds * 0.45;
    return weightInKilograms;
  }
}
