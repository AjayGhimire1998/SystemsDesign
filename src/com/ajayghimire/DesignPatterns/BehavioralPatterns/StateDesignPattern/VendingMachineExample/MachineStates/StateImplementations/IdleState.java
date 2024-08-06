package com.ajayghimire.DesignPatterns.BehavioralPatterns.StateDesignPattern.VendingMachineExample.MachineStates.StateImplementations;

import com.ajayghimire.DesignPatterns.BehavioralPatterns.StateDesignPattern.VendingMachineExample.Coin;
import com.ajayghimire.DesignPatterns.BehavioralPatterns.StateDesignPattern.VendingMachineExample.Item;
import com.ajayghimire.DesignPatterns.BehavioralPatterns.StateDesignPattern.VendingMachineExample.MachineStates.State;
import com.ajayghimire.DesignPatterns.BehavioralPatterns.StateDesignPattern.VendingMachineExample.VendingMachine;
import java.util.ArrayList;
import java.util.List;

public class IdleState implements State {

  public IdleState() {
    System.out.println("Currently the machine is in Idle State.");
  }

  public IdleState(VendingMachine machine) {
    System.out.println("Currently the machine is in Idle State.");
    machine.setCoinList(new ArrayList<>());
  }

  /**
   * @param machine
   * @throws Exception
   */
  @Override
  public void clickToInsertCoin(VendingMachine machine) throws Exception {
    machine.setMachineState(new PaidState());
  }

  /**
   * @param machine
   * @throws Exception
   */
  @Override
  public void clickToStartProductSelection(VendingMachine machine) throws Exception {
    throw new Exception("First Click on Insert Coins.");
  }

  /**
   * @param machine
   * @param coin
   * @throws Exception
   */
  @Override
  public void insertCoin(VendingMachine machine, Coin coin) throws Exception {
    throw new Exception("Cannot insert coins in Idle State.");
  }

  /**
   * @param machine
   * @param productCode
   * @throws Exception
   */
  @Override
  public void selectProduct(VendingMachine machine, int productCode) throws Exception {
    throw new Exception("Cannot choose Product in Idle State.");
  }

  /**
   * @param change
   * @throws Exception
   */
  @Override
  public int getBackChange(int change) throws Exception {
    throw new Exception("Cannot get Change back in Idle State.");
  }

  /**
   * @param machine
   * @param productCode
   * @throws Exception
   */
  @Override
  public void dispenseProduct(VendingMachine machine, int productCode) throws Exception {
    throw new Exception("Cannot dispense Product in Idle State.");
  }

  /**
   * @param machine
   * @return
   * @throws Exception
   */
  @Override
  public List<Coin> refundFullMoney(VendingMachine machine) throws Exception {
    throw new Exception("Cannot get full refund in Idle State.");
  }

  /**
   * @param machine
   * @param item
   * @param code
   * @throws Exception
   */
  @Override
  public void updateInventory(VendingMachine machine, Item item, int code) throws Exception {
    machine.getInventory().addItem(item, code);
  }
}
