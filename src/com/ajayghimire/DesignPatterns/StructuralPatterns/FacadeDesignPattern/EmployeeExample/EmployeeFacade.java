package com.ajayghimire.DesignPatterns.StructuralPatterns.FacadeDesignPattern.EmployeeExample;

public class EmployeeFacade {
  EmployeeDAO employeeDAO;

  public EmployeeFacade() {
    this.employeeDAO = new EmployeeDAO();
  }

  void insert() {
    employeeDAO.insert();
  }

  Employee getEmployeeDetails(int employeeID) {
    return employeeDAO.getEmployeeDetails(employeeID);
  }
}
