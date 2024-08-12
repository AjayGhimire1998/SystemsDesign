package com.ajayghimire.DesignPatterns.LowLevelSystemDesign.BehavioralPatterns.StateDesignPattern.VendingMachineExample.MachineStates.StateImplementations;

import com.ajayghimire.DesignPatterns.LowLevelSystemDesign.BehavioralPatterns.StateDesignPattern.VendingMachineExample.Coin;
import com.ajayghimire.DesignPatterns.LowLevelSystemDesign.BehavioralPatterns.StateDesignPattern.VendingMachineExample.Item;
import com.ajayghimire.DesignPatterns.LowLevelSystemDesign.BehavioralPatterns.StateDesignPattern.VendingMachineExample.MachineStates.State;
import com.ajayghimire.DesignPatterns.LowLevelSystemDesign.BehavioralPatterns.StateDesignPattern.VendingMachineExample.VendingMachine;
import java.util.List;

public class SelectionState implements State {

  public SelectionState() {
    System.out.println("Currently Vending machine is in SelectionState");
  }


  /**
   * @param machine
   * @throws Exception
   */
  @Override
  public void clickToInsertCoin(VendingMachine machine) throws Exception {
    throw new Exception("Cannot click on insert coin while in Selection state");
  }

  /**
   * @param machine
   * @throws Exception
   */
  @Override
  public void clickToStartProductSelection(VendingMachine machine) throws Exception {
    throw new Exception("Already clicked selection,and is in Selection state");
  }

  /**
   * @param machine
   * @param coin
   * @throws Exception
   */
  @Override
  public void insertCoin(VendingMachine machine, Coin coin) throws Exception {
    throw new Exception("Already inserted the coins.");
  }

  /**
   * @param machine
   * @param productCode
   * @throws Exception
   */
  @Override
  public void selectProduct(VendingMachine machine, int productCode) throws Exception {
    // find the product with the code
    Item item = machine.getInventory().getItem(productCode);

    // total amount paid

    int paid = 0;
    for (Coin coin : machine.getCoinList()) {
      paid += coin.value;
    }

    // compare product price and amount paid
    if (paid < item.getPrice()) {
      System.out.println("Insufficient fund! Product price is: " + item.getPrice());
      refundFullMoney(machine);
      throw new Exception("Insufficient fund!");
    } else if (paid > item.getPrice()) {
      getBackChange(paid - item.getPrice());
      machine.setMachineState(new DispenseState(machine, productCode));
    } else {
      machine.setMachineState(new DispenseState(machine, productCode));
    }
  }

  /**
   * @param change
   * @throws Exception
   */
  @Override
  public int getBackChange(int change) throws Exception {
    System.out.println("Returned the change in the Coin Dispense Tray: " + change);
    return change;
  }

  /**
   * @param machine
   * @param productCode
   * @throws Exception
   */
  @Override
  public void dispenseProduct(VendingMachine machine, int productCode) throws Exception {
    throw new Exception("Product can not be dispensed while in Selection state");
  }

  /**
   * @param machine
   * @return
   * @throws Exception
   */
  @Override
  public List<Coin> refundFullMoney(VendingMachine machine) throws Exception {
    System.out.println("Returned the full amount back in the Coin Dispense Tray");
    machine.setMachineState(new IdleState(machine));
    return machine.getCoinList();
  }

  /**
   * @param machine
   * @param item
   * @param code
   * @throws Exception
   */
  @Override
  public void updateInventory(VendingMachine machine, Item item, int code) throws Exception {
    throw new Exception("Inventory can not be updated while in Selection state");
  }
}
