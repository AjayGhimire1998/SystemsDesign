package com.ajayghimire.DesignPatterns.LowLevelSystemDesign.BehavioralPatterns.TemplateMethodDesignPattern.PaymentFlowExample;

public abstract class PaymentFlow {
  public abstract  void validateRequest();
  public abstract  void calculateFees();
  public abstract  void debitTheAmount();
  public abstract  void creditTheAmount();

  public final void sendMoney(){
    validateRequest();
    debitTheAmount();
    calculateFees();
    creditTheAmount();
  }
}
