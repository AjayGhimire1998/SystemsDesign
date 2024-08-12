package com.ajayghimire.DesignPatterns.LowLevelSystemDesign.StructuralPatterns.FacadeDesignPattern.EmployeeExample;

public class Employee {
  String emailID;
  int employeeID;

  public Employee(String emailID) {
    this.emailID = emailID;
  }

  public Employee(int employeeID) {
    this.employeeID = employeeID;
  }

  public Object getID() {
    if (emailID != null) {
      return emailID;
    } else {
      return employeeID;
    }
  }
}
