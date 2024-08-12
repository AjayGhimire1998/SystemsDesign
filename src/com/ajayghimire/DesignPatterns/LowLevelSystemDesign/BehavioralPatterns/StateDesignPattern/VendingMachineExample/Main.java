package com.ajayghimire.DesignPatterns.LowLevelSystemDesign.BehavioralPatterns.StateDesignPattern.VendingMachineExample;

import com.ajayghimire.DesignPatterns.LowLevelSystemDesign.BehavioralPatterns.StateDesignPattern.VendingMachineExample.MachineStates.State;

public class Main {
  public static void main(String[] args) {
    VendingMachine vendingMachine = new VendingMachine();

    try {
      System.out.println("|||||||||");
      System.out.println("Filling up the inventory...");
      System.out.println("|||||||||");

      fillUpInventory(vendingMachine);
      displayInventory(vendingMachine);

      System.out.println("|||||||||");
      System.out.println("Clicking on Insert Coin Button");
      System.out.println("|||||||||");

      State state = vendingMachine.getMachineState();
      state.clickToInsertCoin(vendingMachine);

      state = vendingMachine.getMachineState();
      state.insertCoin(vendingMachine, Coin.NICKEL);
      state.insertCoin(vendingMachine, Coin.QUARTER);

      System.out.println("|||||||||");
      System.out.println("Clicking on Product Selection Button");
      System.out.println("|||||||||");

      state.clickToStartProductSelection(vendingMachine);
      state = vendingMachine.getMachineState();
      state.selectProduct(vendingMachine, 102);

      displayInventory(vendingMachine);

    } catch (Exception e) {
      System.err.println(e.getMessage());
    }
  }

  private static void fillUpInventory(VendingMachine vendingMachine) {
    ItemShelf[] slots = vendingMachine.getInventory().getInventory();
    for (int i = 0; i < slots.length; i++) {
      Item newItem = new Item();
      if (i >= 0 && i < 3) {
        newItem.setType(ItemType.COKE);
        newItem.setPrice(12);
      } else if (i >= 3 && i < 5) {
        newItem.setType(ItemType.PEPSI);
        newItem.setPrice(9);
      } else if (i >= 5 && i < 7) {
        newItem.setType(ItemType.JUICE);
        newItem.setPrice(13);
      } else if (i >= 7 && i < 10) {
        newItem.setType(ItemType.SODA);
        newItem.setPrice(7);
      }
      slots[i].setItem(newItem);
      slots[i].setSoldOut(false);
    }
  }

  private static void displayInventory(VendingMachine vendingMachine) {
    ItemShelf[] slots = vendingMachine.getInventory().getInventory();
    for (int i = 0; i < slots.length; i++) {

      System.out.println(
          "CodeNumber: "
              + slots[i].getProductCode()
              + " Item: "
              + slots[i].getItem().getType().name()
              + " Price: "
              + slots[i].getItem().getPrice()
              + " isAvailable: "
              + !slots[i].isSoldOut());
    }
  }
}
