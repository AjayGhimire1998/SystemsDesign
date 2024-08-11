package com.ajayghimire.DesignPatterns.StructuralPatterns.BridgeDesignPattern.BreatherExample.Abstractors;

import com.ajayghimire.DesignPatterns.StructuralPatterns.BridgeDesignPattern.BreatherExample.Implementors.IBreather;

public class Tree extends AbstractBreathers {

  public Tree(IBreather breather) {
    super(breather);
  }

  /** */
  @Override
  public void breatheProcess() {
    this.getBreather().breathe();
  }
}
