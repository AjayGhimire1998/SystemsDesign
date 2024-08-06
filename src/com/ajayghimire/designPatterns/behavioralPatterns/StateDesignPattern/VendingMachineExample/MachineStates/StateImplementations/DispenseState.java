package com.ajayghimire.designPatterns.behavioralPatterns.StateDesignPattern.VendingMachineExample.MachineStates.StateImplementations;

import com.ajayghimire.designPatterns.behavioralPatterns.StateDesignPattern.VendingMachineExample.Coin;
import com.ajayghimire.designPatterns.behavioralPatterns.StateDesignPattern.VendingMachineExample.Item;
import com.ajayghimire.designPatterns.behavioralPatterns.StateDesignPattern.VendingMachineExample.MachineStates.State;
import com.ajayghimire.designPatterns.behavioralPatterns.StateDesignPattern.VendingMachineExample.VendingMachine;
import java.util.List;

public class DispenseState implements State {
  public DispenseState(VendingMachine machine, int productCode) throws Exception {
    System.out.println("Machine is currently in Dispense State.");
    dispenseProduct(machine, productCode);
  }

  /**
   * @param machine
   * @throws Exception
   */
  @Override
  public void clickToInsertCoin(VendingMachine machine) throws Exception {
    throw new Exception("Insert coin button can not clicked on Dispense state.");
  }

  /**
   * @param machine
   * @throws Exception
   */
  @Override
  public void clickToStartProductSelection(VendingMachine machine) throws Exception {
    throw new Exception("Product selection button can not be clicked in Dispense state");
  }

  /**
   * @param machine
   * @param coin
   * @throws Exception
   */
  @Override
  public void insertCoin(VendingMachine machine, Coin coin) throws Exception {
    throw new Exception("Coins can not be inserted in Dispense state");
  }

  /**
   * @param machine
   * @param productCode
   * @throws Exception
   */
  @Override
  public void selectProduct(VendingMachine machine, int productCode) throws Exception {
    throw new Exception("Product can not be selected in Dispense state");
  }

  /**
   * @param change
   * @throws Exception
   */
  @Override
  public int getBackChange(int change) throws Exception {
    throw new Exception("Change can not returned in Dispense state");
  }

  /**
   * @param machine
   * @param productCode
   * @throws Exception
   */
  @Override
  public void dispenseProduct(VendingMachine machine, int productCode) throws Exception {
    System.out.println("Product has been dispensed!");
    Item item = machine.getInventory().getItem(productCode);
    machine.getInventory().updateSoldOutItem(productCode);
    machine.setMachineState(new IdleState(machine));
  }

  /**
   * @param machine
   * @return
   * @throws Exception
   */
  @Override
  public List<Coin> refundFullMoney(VendingMachine machine) throws Exception {
    throw new Exception("Refund can not be made in Dispense state");
  }

  /**
   * @param machine
   * @param item
   * @param code
   * @throws Exception
   */
  @Override
  public void updateInventory(VendingMachine machine, Item item, int code) throws Exception {
    throw new Exception("Inventory can not be updated in Dispense state");
  }
}
