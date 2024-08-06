package com.ajayghimire.designPatterns.behavioralPatterns.StateDesignPattern.VendingMachineExample;

public class Inventory {
  private int numberOfItems;

  public Inventory(int num) {
    this.numberOfItems = num;
  }

  public void addItem(Item item, int code) {}

  public Item getItem(int code) {
    return new Item();
  }

  public void updateSoldOutItem(int productCode) {
  }
}
