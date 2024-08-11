package com.ajayghimire.DesignPatterns.StructuralPatterns.BridgeDesignPattern.BreatherExample;

import com.ajayghimire.DesignPatterns.StructuralPatterns.BridgeDesignPattern.BreatherExample.Abstractors.Animal;
import com.ajayghimire.DesignPatterns.StructuralPatterns.BridgeDesignPattern.BreatherExample.Abstractors.Tree;
import com.ajayghimire.DesignPatterns.StructuralPatterns.BridgeDesignPattern.BreatherExample.Abstractors.Water;
import com.ajayghimire.DesignPatterns.StructuralPatterns.BridgeDesignPattern.BreatherExample.Implementors.AnimalBreather;
import com.ajayghimire.DesignPatterns.StructuralPatterns.BridgeDesignPattern.BreatherExample.Implementors.TreeBreather;
import com.ajayghimire.DesignPatterns.StructuralPatterns.BridgeDesignPattern.BreatherExample.Implementors.WaterBreather;

public class ClientMain {
  public static void main(String[] args) {
    Animal animal = new Animal(new AnimalBreather());
    animal.breatheProcess();
    System.out.println("---------------------------------------------");

    Tree tree = new Tree(new TreeBreather());
    tree.breatheProcess();
    System.out.println("---------------------------------------------");

    Water water = new Water(new WaterBreather());
    water.breatheProcess();
    System.out.println("---------------------------------------------");

    Water waterMammal = new Water(new AnimalBreather());
    waterMammal.breatheProcess();
  }
}
