package com.ajayghimire.DesignPatterns.LowLevelSystemDesign.CreationalPatterns.FactoryAndAbstractDesignPattern.FactoryPattern.ShapesExample;

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
