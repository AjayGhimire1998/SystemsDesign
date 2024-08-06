package com.ajayghimire.designPatterns.behavioralPatterns.StateDesignPattern.VendingMachineExample;

public class Inventory {
  private ItemShelf[] inventory;

  public Inventory(int count) {
    this.inventory = new ItemShelf[count];
    emptyInitialInventory();
  }

  public ItemShelf[] getInventory() {
    return inventory;
  }

  public void setInventory(ItemShelf[] inventory) {
    this.inventory = inventory;
  }

  private void emptyInitialInventory() {
    int startCode = 101;
    for (int i = 0; i < inventory.length; i++) {
      ItemShelf space = new ItemShelf();
      space.setCode(startCode);
      space.setSoldOut(true);
      inventory[i] = space;
      startCode++;
    }
  }

  public void addItem(Item item, int productCode) throws Exception {
    for (ItemShelf itemShelf : inventory) {
      if (itemShelf.getProductCode() == productCode) {
        if (itemShelf.isSoldOut()) {
          itemShelf.setItem(item);
          itemShelf.setSoldOut(false);
        } else {
          throw new Exception("already item is present, you can not add item here");
        }
      }
    }
  }

  public Item getItem(int productCode) throws Exception {
    for (ItemShelf itemShelf : inventory) {
      if (itemShelf.getProductCode() == productCode) {
        if (itemShelf.isSoldOut()) {
          throw new Exception("item already sold out");
        } else {

          return itemShelf.getItem();
        }
      }
    }
    throw new Exception("Invalid Code");
  }

  public void updateSoldOutItem(int productCode) {
    for (ItemShelf itemShelf : inventory) {
      if (itemShelf.getProductCode() == productCode) {
        itemShelf.setSoldOut(true);
      }
    }
  }
}
