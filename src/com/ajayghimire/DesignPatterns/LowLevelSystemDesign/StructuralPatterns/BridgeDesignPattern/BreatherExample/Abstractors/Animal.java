package com.ajayghimire.DesignPatterns.LowLevelSystemDesign.StructuralPatterns.BridgeDesignPattern.BreatherExample.Abstractors;

import com.ajayghimire.DesignPatterns.LowLevelSystemDesign.StructuralPatterns.BridgeDesignPattern.BreatherExample.Implementors.IBreather;

public class Animal extends AbstractBreathers {

  public Animal(IBreather breather) {
    super(breather);
  }

  /** */
  @Override
  public void breatheProcess() {
    this.getBreather().breathe();
  }
}
