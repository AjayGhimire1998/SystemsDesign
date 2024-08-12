package com.ajayghimire.DesignPatterns.LowLevelSystemDesign.StructuralPatterns.BridgeDesignPattern.BreatherExample.Implementors;

public class WaterBreather implements IBreather {

  /** */
  @Override
  public void breathe() {
    System.out.println("Aquatic animals have gills to breathe from!");
    System.out.println("They inhale oxygen from water and exhale carbon dioxide.");
  }
}
