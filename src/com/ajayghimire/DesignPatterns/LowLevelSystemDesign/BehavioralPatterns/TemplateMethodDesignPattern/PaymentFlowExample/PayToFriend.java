package com.ajayghimire.DesignPatterns.LowLevelSystemDesign.BehavioralPatterns.TemplateMethodDesignPattern.PaymentFlowExample;

public class PayToFriend extends PaymentFlow{

/**
*
*/
  @Override
  public void validateRequest() {
   System.out.println("Validating request for payment to a friend.");
  }

/**
*
*/
  @Override
  public void calculateFees() {
    System.out.println("Calculating fees for payment to a friend.");
  }

/**
*
*/
  @Override
  public void debitTheAmount() {
    System.out.println("Debiting the amount for payment to a friend.");
  }

/**
*
*/
  @Override
  public void creditTheAmount() {
    System.out.println("Crediting the amount for payment to a friend.");
  }
}
