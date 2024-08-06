package com.ajayghimire.DesignPatterns.BehavioralPatterns.StateDesignPattern.VendingMachineExample;

import com.ajayghimire.DesignPatterns.BehavioralPatterns.StateDesignPattern.VendingMachineExample.MachineStates.StateImplementations.IdleState;
import com.ajayghimire.DesignPatterns.BehavioralPatterns.StateDesignPattern.VendingMachineExample.MachineStates.State;
import java.util.ArrayList;
import java.util.List;

public class VendingMachine {
  private State machineState;
  private Inventory inventory;
  private List<Coin> coinList;

  public VendingMachine() {
    this.machineState = new IdleState();
    this.inventory = new Inventory(10);
    this.coinList = new ArrayList<>();
  }

  public State getMachineState() {
    return machineState;
  }

  public void setMachineState(State machineState) {
    this.machineState = machineState;
  }

  public Inventory getInventory() {
    return inventory;
  }

  public void setInventory(Inventory inventory) {
    this.inventory = inventory;
  }

  public List<Coin> getCoinList() {
    return coinList;
  }

  public void setCoinList(List<Coin> coinList) {
    this.coinList = coinList;
  }
}
