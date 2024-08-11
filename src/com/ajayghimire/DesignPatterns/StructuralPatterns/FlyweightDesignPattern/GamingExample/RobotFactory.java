package com.ajayghimire.DesignPatterns.StructuralPatterns.FlyweightDesignPattern.GamingExample;

import java.util.HashMap;
import java.util.Map;

public class RobotFactory {
  private static Map<String, IRobot> robotCache = new HashMap<>();

  public static IRobot createRobot(String robotType) {
    if (robotCache.containsKey(robotType)) {
      System.out.println("Returning the already existing " + robotType + ".");
      return robotCache.get(robotType);
    } else {
      if (robotType.equalsIgnoreCase("humanoid")) {
        Sprite humanoidSprite = new Sprite();
        IRobot humanoid = new Humanoid(robotType, humanoidSprite);
        robotCache.put(robotType, humanoid);
        return humanoid;
      } else if (robotType.equalsIgnoreCase("doggonoid")) {
        Sprite doggonoidSprite = new Sprite();
        IRobot doggonoid = new Doggonoid(robotType, doggonoidSprite);
        robotCache.put(robotType, doggonoid);
        return doggonoid;
      }
    }
    return null;
  }
}
