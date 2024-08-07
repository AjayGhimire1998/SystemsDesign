package com.ajayghimire.DesignPatterns.BehavioralPatterns.MediatorDesignPattern.OnlineAuctionExample;

public class Bidder implements IBidder {
  String name;
  IAuctionMediator mediator;

  public Bidder(String name, IAuctionMediator mediator) {
    this.name = name;
    this.mediator = mediator;
    this.mediator.addBidder(this);
  }

  @Override
  public String getName() {
    return this.name;
  }

  /**
   * @param bidAmount
   */
  @Override
  public void placeBid(int bidAmount) {
    mediator.placeBidForBidders(this, bidAmount);
  }

  /**
   * @param bidAmount
   */
  @Override
  public void receiveNotification(int bidAmount) {
    System.out.println(
        "Bidding notification has been sent to "
            + this.getName()
            + ". "
            + "The new amount now is "
            + bidAmount
            + "$.");
  }
}
