package com.ajayghimire.designPatterns.behavioralPatterns.StateDesignPattern.VendingMachineExample;

public enum Coin {
  PENNY(1),
  NICKEL(5),
  DIME(10),
  QUARTER(25);

  public int value;

  Coin(int value) {
    this.value = value;
  }
}
