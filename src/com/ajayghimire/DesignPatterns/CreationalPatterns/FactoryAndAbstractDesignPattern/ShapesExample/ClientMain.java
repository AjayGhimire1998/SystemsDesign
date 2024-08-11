package com.ajayghimire.DesignPatterns.CreationalPatterns.FactoryAndAbstractDesignPattern.ShapesExample;

public class ClientMain {
  public static void main(String[] args) {
    ShapeFactory.getShapeObject("CiRCLE").draw();
    ShapeFactory.getShapeObject("RECtanGLE").draw();

  }
}
