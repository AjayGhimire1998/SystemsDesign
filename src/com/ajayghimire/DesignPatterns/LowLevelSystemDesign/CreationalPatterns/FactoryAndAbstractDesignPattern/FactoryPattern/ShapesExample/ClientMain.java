package com.ajayghimire.DesignPatterns.LowLevelSystemDesign.CreationalPatterns.FactoryAndAbstractDesignPattern.FactoryPattern.ShapesExample;

public class ClientMain {
  public static void main(String[] args) {
    ShapeFactory.getShapeObject("CiRCLE").draw();
    ShapeFactory.getShapeObject("RECtanGLE").draw();

  }
}
