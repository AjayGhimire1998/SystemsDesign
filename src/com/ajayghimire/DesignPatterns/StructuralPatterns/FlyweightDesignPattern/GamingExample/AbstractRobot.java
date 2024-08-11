package com.ajayghimire.DesignPatterns.StructuralPatterns.FlyweightDesignPattern.GamingExample;

public abstract class AbstractRobot {
  private String type;
  private Sprite body;

  public AbstractRobot(String type, Sprite body) {
    this.type = type;
    this.body = body;
  }

  public String getType() {
    return type;
  }

  public Sprite getBody() {
    return body;
  }

}
