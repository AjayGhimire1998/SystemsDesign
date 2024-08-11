package com.ajayghimire.DesignPatterns.StructuralPatterns.ProxyDesignPattern.EmployeeExample;

public class ProxyEmployeeDAO implements IEmployeeDAO{

/**
*
 * @param client
 * @param obj
*/
  @Override
  public void create(String client, EmployeeDAO obj) {

  }

/**
*
 * @param client
 * @param employeeID
*/
  @Override
  public void delete(String client, int employeeID) {

  }

/**
*
 * @param client
 * @param employeeID
 * @return
*/
  @Override
  public EmployeeDAO get(String client, int employeeID) {
    return null;
  }
}
