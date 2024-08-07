package com.ajayghimire.DesignPatterns.BehavioralPatterns.MediatorDesignPattern.OnlineAuctionExample;

import java.util.ArrayList;
import java.util.List;

public class AuctionMediator implements IAuctionMediator {
  List<IBidder> bidders = new ArrayList<>();

  /**
   * @param bidder
   */
  @Override
  public void addBidder(IBidder bidder) {
    bidders.add(bidder);
  }

  /**
   * @param bidder
   * @param bidAmount
   */
  @Override
  public void placeBidForBidders(IBidder bidder, int bidAmount) {
    for (IBidder b : bidders) {
      if (!bidder.getName().equalsIgnoreCase(b.getName())) {
        sendNotification(b, bidAmount);
      }
    }
  }

  /** */
  @Override
  public void sendNotification(IBidder bidder, int bidAmount) {
    bidder.receiveNotification(bidAmount);
  }
}
