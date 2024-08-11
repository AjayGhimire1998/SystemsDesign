package com.ajayghimire.DesignPatterns.StructuralPatterns.ProxyDesignPattern.EmployeeExample;

import java.util.Random;

public class EmployeeDAO {
  int employeeID;
  String employeeName = "Employee";

  public EmployeeDAO(int employeeID, String name) {
    this(employeeID);
    this.employeeName = name;
  }

  public EmployeeDAO(int employeeID) {
    this.employeeID = employeeID;
  }

  public EmployeeDAO() {
    this.employeeID = new Random().nextInt(99);
    this.employeeName = "Default Employee";
  }

  public int getEmployeeID() {
    return employeeID;
  }

  public void setEmployeeID(int employeeID) {
    this.employeeID = employeeID;
  }

  public String getEmployeeName() {
    return employeeName;
  }

  public void setEmployeeName(String employeeName) {
    this.employeeName = employeeName;
  }

  @Override
  public String toString() {
    return "EmployeeDAO{"
        + "employeeID="
        + employeeID
        + ", employeeName='"
        + employeeName
        + '\''
        + '}';
  }
}
