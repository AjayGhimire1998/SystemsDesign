package com.ajayghimire.designPatterns.behavioralPatterns.StateDesignPattern.VendingMachineExample.MachineStates.StateImplementations;

import com.ajayghimire.designPatterns.behavioralPatterns.StateDesignPattern.VendingMachineExample.Coin;
import com.ajayghimire.designPatterns.behavioralPatterns.StateDesignPattern.VendingMachineExample.Item;
import com.ajayghimire.designPatterns.behavioralPatterns.StateDesignPattern.VendingMachineExample.MachineStates.State;
import com.ajayghimire.designPatterns.behavioralPatterns.StateDesignPattern.VendingMachineExample.VendingMachine;
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
  public void insertCoin(VendingMachine machine, Coin coin) throws Exception {}

  /**
   * @param machine
   * @param productCode
   * @throws Exception
   */
  @Override
  public void selectProduct(VendingMachine machine, int productCode) throws Exception {}

  /**
   * @param change
   * @throws Exception
   */
  @Override
  public void getBackChange(int change) throws Exception {}

  /**
   * @param machine
   * @param productCode
   * @throws Exception
   */
  @Override
  public void dispenseProduct(VendingMachine machine, int productCode) throws Exception {}

  /**
   * @param machine
   * @return
   * @throws Exception
   */
  @Override
  public List<Coin> refundFullMoney(VendingMachine machine) throws Exception {
    return List.of();
  }

  /**
   * @param machine
   * @param item
   * @param code
   * @throws Exception
   */
  @Override
  public void updateInventory(VendingMachine machine, Item item, int code) throws Exception {}
}
