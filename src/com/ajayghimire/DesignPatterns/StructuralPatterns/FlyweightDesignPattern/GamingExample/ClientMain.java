package com.ajayghimire.DesignPatterns.StructuralPatterns.FlyweightDesignPattern.GamingExample;

public class ClientMain {
  public static void main(String[] args) {
    IRobot humanoid1 = RobotFactory.createRobot("humanoid");
    humanoid1.display(1, 2);

    System.out.println("------------------------------------------------");

    IRobot humanoid2 = RobotFactory.createRobot("humanoid");
    humanoid2.display(2, 3);

    System.out.println("------------------------------------------------");

    IRobot doggonoid1 = RobotFactory.createRobot("doggonoid");
    doggonoid1.display(5, 6);

    System.out.println("------------------------------------------------");

    IRobot doggonoid2 = RobotFactory.createRobot("doggonoid");
    doggonoid2.display(7, 9);
  }
}
