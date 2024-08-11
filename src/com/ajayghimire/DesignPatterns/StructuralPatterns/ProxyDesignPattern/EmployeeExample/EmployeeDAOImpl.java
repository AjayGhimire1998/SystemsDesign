package com.ajayghimire.DesignPatterns.StructuralPatterns.ProxyDesignPattern.EmployeeExample;

public class EmployeeDAOImpl implements IEmployeeDAO {

  /**
   * @param client
   * @param obj
   */
  @Override
  public void create(String client, EmployeeDAO obj) {
    System.out.println("Created new employee in the Employees table.");
  }

  /**
   * @param client
   * @param employeeID
   */
  @Override
  public void delete(String client, int employeeID) {
    System.out.println("Deleted employee from the Employees table with employeeID: " + employeeID);
  }

  /**
   * @param client
   * @param employeeID
   * @return
   */
  @Override
  public EmployeeDAO get(String client, int employeeID) {
    System.out.println("Fetching employee from the Employees table with employeeID: " + employeeID);
    return new EmployeeDAO(employeeID);
  }
}
