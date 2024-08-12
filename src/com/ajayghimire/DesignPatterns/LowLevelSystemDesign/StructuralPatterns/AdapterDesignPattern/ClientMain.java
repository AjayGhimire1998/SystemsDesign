package com.ajayghimire.DesignPatterns.LowLevelSystemDesign.StructuralPatterns.AdapterDesignPattern;

import com.ajayghimire.DesignPatterns.LowLevelSystemDesign.StructuralPatterns.AdapterDesignPattern.Adaptee.WeightMachineAdapteeImpl;
import com.ajayghimire.DesignPatterns.LowLevelSystemDesign.StructuralPatterns.AdapterDesignPattern.Adapter.WeightMachineAdapter;
import com.ajayghimire.DesignPatterns.LowLevelSystemDesign.StructuralPatterns.AdapterDesignPattern.Adapter.WeightMachineAdapterImpl;

public class ClientMain {
  public static void main(String[] args) {
    WeightMachineAdapter weightMachine =
        new WeightMachineAdapterImpl(new WeightMachineAdapteeImpl());
    double weightInKilograms = weightMachine.getWeightInKilograms();
    System.out.println("Weight in kilograms: " + weightInKilograms);
  }
}
