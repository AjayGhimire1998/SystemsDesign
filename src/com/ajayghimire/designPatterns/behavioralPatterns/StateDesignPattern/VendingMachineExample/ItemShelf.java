package com.ajayghimire.designPatterns.behavioralPatterns.StateDesignPattern.VendingMachineExample;

public class ItemShelf {

  private int productCode;
  private Item item;

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

  public void setCode(int startCode) {}

  public boolean isSoldOut() {}

  public void setSoldOut(boolean b) {}
}
