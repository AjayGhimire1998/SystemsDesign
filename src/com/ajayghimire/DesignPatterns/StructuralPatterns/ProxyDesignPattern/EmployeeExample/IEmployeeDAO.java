package com.ajayghimire.DesignPatterns.StructuralPatterns.ProxyDesignPattern.EmployeeExample;

public interface IEmployeeDAO {
  void create(String client, EmployeeDAO obj);

  void delete(String client, int employeeID);

  EmployeeDAO get(String client, int employeeID);
}
