package com.ajayghimire.DesignPatterns.BehavioralPatterns.MediatorDesignPattern.OnlineAuctionExample;

public interface IBidder {
  void placeBid(int bidAmount);

  void receiveNotification(int bidAmount);

  String getName();
}
