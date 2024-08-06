package com.ajayghimire.DesignPatterns.BehavioralPatterns.StateDesignPattern.VendingMachineExample.MachineStates.StateImplementations;

import com.ajayghimire.DesignPatterns.BehavioralPatterns.StateDesignPattern.VendingMachineExample.Coin;
import com.ajayghimire.DesignPatterns.BehavioralPatterns.StateDesignPattern.VendingMachineExample.Item;
import com.ajayghimire.DesignPatterns.BehavioralPatterns.StateDesignPattern.VendingMachineExample.MachineStates.State;
import com.ajayghimire.DesignPatterns.BehavioralPatterns.StateDesignPattern.VendingMachineExample.VendingMachine;
import java.util.List;

public class PaidState implements State {

  public PaidState() {
    System.out.println("Currently the machine is in Paid State.");
  }

  /**
   * @param machine
   * @throws Exception
   */
  @Override
  public void clickToInsertCoin(VendingMachine machine) throws Exception {
    throw new Exception("Click to insert Coins have already been done.");
  }

  /**
   * @param machine
   * @throws Exception
   */
  @Override
  public void clickToStartProductSelection(VendingMachine machine) throws Exception {
    machine.setMachineState(new SelectionState());
  }

  /**
   * @param machine
   * @param coin
   * @throws Exception
   */
  @Override
  public void insertCoin(VendingMachine machine, Coin coin) throws Exception {
    System.out.println("Accepted the inserted coins.");
    machine.getCoinList().add(coin);
  }

  /**
   * @param machine
   * @param productCode
   * @throws Exception
   */
  @Override
  public void selectProduct(VendingMachine machine, int productCode) throws Exception {
    throw new Exception("Click on select product button first.");
  }

  /**
   * @param change
   * @throws Exception
   */
  @Override
  public int getBackChange(int change) throws Exception {
    throw new Exception("Cannot get change back in Paid State.");
  }

  /**
   * @param machine
   * @param productCode
   * @throws Exception
   */
  @Override
  public void dispenseProduct(VendingMachine machine, int productCode) throws Exception {
    throw new Exception("Cannot dispense product in Paid State.");
  }

  /**
   * @param machine
   * @return
   * @throws Exception
   */
  @Override
  public List<Coin> refundFullMoney(VendingMachine machine) throws Exception {
    System.out.println("Cancelling purchase, refunding full coins now in the tray.");
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
    throw new Exception("Cannot update Inventory in Paid State.");
  }
}
