package com.ajayghimire.DesignPatterns.LowLevelSystemDesign.CreationalPatterns.FactoryAndAbstractDesignPattern.FactoryPattern.ShapesExample;

public class Rectangle implements IShape {

  /** */
  @Override
  public void draw() {
    System.out.println("Drawing Rectangle!");
  }
}
