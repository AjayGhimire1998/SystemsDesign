package com.ajayghimire.DesignPatterns.StructuralPatterns.ProxyDesignPattern.EmployeeExample;

public class ClientMain {
  public static void main(String[] args) {

    try {
      IEmployeeDAO employeeDAO = new ProxyEmployeeDAO();
      EmployeeDAO employee = new EmployeeDAO();
      employeeDAO.create("admin", employee);
      employeeDAO.get("user", employee.getEmployeeID());
      System.out.println("Operation completed!");
    } catch (Exception e) {
      System.err.println(e.getMessage());
    }
  }
}
