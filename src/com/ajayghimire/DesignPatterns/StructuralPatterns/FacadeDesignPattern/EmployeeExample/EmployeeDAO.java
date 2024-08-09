package com.ajayghimire.DesignPatterns.StructuralPatterns.FacadeDesignPattern.EmployeeExample;

public class EmployeeDAO {
  void insert() {}

  void updateEmployee() {}

  Employee getEmployeeDetails(String emailID) {
    return new Employee(emailID);
  }

  Employee getEmployeeDetails(int employeeID) {
    return new Employee(employeeID);
  }
}
