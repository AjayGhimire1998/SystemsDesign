package com.ajayghimire.DesignPatterns.StructuralPatterns.FlyweightDesignPattern.GamingExample;

public class Humanoid extends AbstractRobot implements IRobot {

  public Humanoid(String type, Sprite body) {
    super(type, body);
  }

  /**
   * @param x
   * @param y
   */
  @Override
  public void display(int x, int y) {
    String result =
        String.format(
            "Displaying %s with x-cord %f and y-cord %f.", this.getClass().getName(), x, y);
    System.out.println(result);
  }
}
