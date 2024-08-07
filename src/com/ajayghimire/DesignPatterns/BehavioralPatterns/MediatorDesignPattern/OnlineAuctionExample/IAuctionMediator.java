package com.ajayghimire.DesignPatterns.BehavioralPatterns.MediatorDesignPattern.OnlineAuctionExample;

public interface IAuctionMediator {

  void addBidder(IBidder bidder);

  void placeBidForBidders(IBidder bidder, int bidAmount);

  void sendNotification(IBidder bidder, int bidAmount);
}
