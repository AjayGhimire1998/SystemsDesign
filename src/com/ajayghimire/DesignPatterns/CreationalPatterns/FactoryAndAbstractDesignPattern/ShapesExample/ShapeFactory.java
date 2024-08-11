package com.ajayghimire.DesignPatterns.CreationalPatterns.FactoryAndAbstractDesignPattern.ShapesExample;

public class ShapeFactory {
  public static IShape getShapeObject(String shapeInput) {
    shapeInput = shapeInput.toLowerCase();
    switch (shapeInput) {
      case "circle" -> { return  new Circle();
      }
      case "rectangle" -> { return new Rectangle();}
    }
    return null;
  }
}
