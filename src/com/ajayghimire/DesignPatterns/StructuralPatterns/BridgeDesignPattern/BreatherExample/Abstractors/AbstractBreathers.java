package com.ajayghimire.DesignPatterns.StructuralPatterns.BridgeDesignPattern.BreatherExample.Abstractors;

import com.ajayghimire.DesignPatterns.StructuralPatterns.BridgeDesignPattern.BreatherExample.Implementors.IBreather;

public abstract class AbstractBreathers {
  private IBreather breather;

  public AbstractBreathers(IBreather breather) {
    this.breather = breather;
  }

  public IBreather getBreather() {
    return breather;
  }

  public abstract void breatheProcess();
}
