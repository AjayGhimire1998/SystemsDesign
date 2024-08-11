package com.ajayghimire.DesignPatterns.StructuralPatterns.BridgeDesignPattern.BreatherExample.Abstractors;

import com.ajayghimire.DesignPatterns.StructuralPatterns.BridgeDesignPattern.BreatherExample.Implementors.IBreather;

public class Water extends AbstractBreathers {

  public Water(IBreather breather) {
    super(breather);
  }

  /** */
  @Override
  public void breatheProcess() {
    this.getBreather().breathe();
  }
}
