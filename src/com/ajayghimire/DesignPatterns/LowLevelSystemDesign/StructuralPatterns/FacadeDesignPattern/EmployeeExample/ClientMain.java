package com.ajayghimire.DesignPatterns.LowLevelSystemDesign.StructuralPatterns.FacadeDesignPattern.EmployeeExample;

public class ClientMain {
  public static void main(String[] args) {
    EmployeeFacade employeeFacade = new EmployeeFacade();
    Employee employeeDetails = employeeFacade.getEmployeeDetails("XYS");
    System.out.println(employeeDetails.getID());
  }
}
