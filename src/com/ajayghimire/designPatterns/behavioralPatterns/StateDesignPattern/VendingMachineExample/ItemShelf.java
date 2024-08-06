package com.ajayghimire.designPatterns.behavioralPatterns.StateDesignPattern.VendingMachineExample;

public class ItemShelf {

  private int productCode;
  private Item item;
  private boolean soldOut;

  public Item getItem() {
    return item;
  }

  public void setItem(Item item) {
    this.item = item;
  }

  public int getProductCode() {
    return productCode;
  }

  public void setProductCode(int productCode) {
    this.productCode = productCode;
  }

  public boolean isSoldOut() {
    return soldOut;
  }

  public void setSoldOut(boolean soldOut) {
    this.soldOut = soldOut;
  }
}
