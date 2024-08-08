package com.ajayghimire.DesignPatterns.StructuralPatterns.AdapterDesignPattern;

import com.ajayghimire.DesignPatterns.StructuralPatterns.AdapterDesignPattern.Adaptee.WeightMachineAdapteeImpl;
import com.ajayghimire.DesignPatterns.StructuralPatterns.AdapterDesignPattern.Adapter.WeightMachineAdapter;
import com.ajayghimire.DesignPatterns.StructuralPatterns.AdapterDesignPattern.Adapter.WeightMachineAdapterImpl;

public class ClientMain {
  public static void main(String[] args) {
    WeightMachineAdapter weightMachine =
        new WeightMachineAdapterImpl(new WeightMachineAdapteeImpl());
    double weightInKilograms = weightMachine.getWeightInKilograms();
    System.out.println("Weight in kilograms: " + weightInKilograms);
  }
}
