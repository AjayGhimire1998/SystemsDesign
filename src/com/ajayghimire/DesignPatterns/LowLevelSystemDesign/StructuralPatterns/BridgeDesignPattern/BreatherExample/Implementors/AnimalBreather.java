package com.ajayghimire.DesignPatterns.LowLevelSystemDesign.StructuralPatterns.BridgeDesignPattern.BreatherExample.Implementors;

public class AnimalBreather implements IBreather {

  /** */
  @Override
  public void breathe() {
    System.out.println("Animals have lungs to breathe from!");
    System.out.println("They inhale oxygen from air and exhale carbon dioxide.");
  }
}
