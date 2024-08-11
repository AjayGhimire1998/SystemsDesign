package com.ajayghimire.DesignPatterns.StructuralPatterns.ProxyDesignPattern.EmployeeExample;




public interface IEmployeeDAO {
  void create(String client, Employee obj);
  void delete(String client, int employeeID);

}
