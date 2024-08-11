package com.ajayghimire.DesignPatterns.StructuralPatterns.FlyweightDesignPattern.GamingExample;

public class Doggonoid extends AbstractRobot implements IRobot {

  public Doggonoid(String type, Sprite body) {
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
            "Displaying %s with x-cord %d and y-cord %d.", this.getClass().getSimpleName(), x, y);
    System.out.println(result);
  }
}
