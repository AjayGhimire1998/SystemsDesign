package com.ajayghimire.designPatterns.behavioralPatterns.StateDesignPattern.VendingMachineExample.MachineStates;

import com.ajayghimire.designPatterns.behavioralPatterns.StateDesignPattern.VendingMachineExample.Coin;
import com.ajayghimire.designPatterns.behavioralPatterns.StateDesignPattern.VendingMachineExample.Item;
import com.ajayghimire.designPatterns.behavioralPatterns.StateDesignPattern.VendingMachineExample.VendingMachine;
import java.util.List;

public interface State {
  void clickToInsertCoin(VendingMachine machine) throws Exception;

  void clickToStartProductSelection(VendingMachine machine) throws Exception;

  void insertCoin(VendingMachine machine, Coin coin) throws Exception;

  void selectProduct(VendingMachine machine, int productCode) throws Exception;

  void getBackChange(int change) throws Exception;

  void dispenseProduct(VendingMachine machine, int productCode) throws Exception;

  List<Coin> refundFullMoney(VendingMachine machine) throws Exception;

  void updateInventory(VendingMachine machine, Item item, int code) throws  Exception;
}
