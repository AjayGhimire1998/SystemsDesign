package com.ajayghimire.DesignPatterns.LowLevelSystemDesign.StructuralPatterns.ProxyDesignPattern.EmployeeExample;

public interface IEmployeeDAO {
  void create(String client, EmployeeDAO obj) throws Exception;

  void delete(String client, int employeeID) throws Exception;

  EmployeeDAO get(String client, int employeeID) throws Exception;
}
