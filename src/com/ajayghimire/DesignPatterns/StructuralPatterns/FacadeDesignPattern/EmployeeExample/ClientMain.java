package com.ajayghimire.DesignPatterns.StructuralPatterns.FacadeDesignPattern.EmployeeExample;

public class ClientMain {
  public static void main(String[] args) {
    EmployeeFacade employeeFacade = new EmployeeFacade();
    Employee employeeDetails = employeeFacade.getEmployeeDetails(2569);

  }
}
