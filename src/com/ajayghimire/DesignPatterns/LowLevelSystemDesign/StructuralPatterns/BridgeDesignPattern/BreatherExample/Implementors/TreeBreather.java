package com.ajayghimire.DesignPatterns.LowLevelSystemDesign.StructuralPatterns.BridgeDesignPattern.BreatherExample.Implementors;

public class TreeBreather implements IBreather {

  /** */
  @Override
  public void breathe() {
    System.out.println("Trees breathe through leaves during photosynthesis process!");
    System.out.println("They inhale carbon dioxide from air and exhale carbon dioxide.");
  }
}
