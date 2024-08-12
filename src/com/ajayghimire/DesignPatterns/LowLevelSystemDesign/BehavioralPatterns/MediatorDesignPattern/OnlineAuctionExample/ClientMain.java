package com.ajayghimire.DesignPatterns.LowLevelSystemDesign.BehavioralPatterns.MediatorDesignPattern.OnlineAuctionExample;

public class ClientMain {
  public static void main(String[] args) {
    IAuctionMediator mediator = new AuctionMediator();
    IBidder bidder1 = new Bidder("Ajay", mediator);
    IBidder bidder2 = new Bidder("Kumar", mediator);
    IBidder bidder3 = new Bidder("Sharma", mediator);
    bidder1.placeBid(2001);
    System.out.println("-------------");
    bidder2.placeBid(2500);
    System.out.println("-------------");
    bidder3.placeBid(3500);
  }
}
