package com.ajayghimire.DesignPatterns.StructuralPatterns.BridgeDesignPattern.BreatherExample.Abstractors;

import com.ajayghimire.DesignPatterns.StructuralPatterns.BridgeDesignPattern.BreatherExample.Implementors.IBreather;

public class TreeBreather extends AbstractBreathers {

  public TreeBreather(IBreather breather) {
    super(breather);
  }

  /** */
  @Override
  public void breatheProcess() {
    this.getBreather().breathe();
  }
}
