package com.ajayghimire.DesignPatterns.LowLevelSystemDesign.StructuralPatterns.ProxyDesignPattern.EmployeeExample;

public class ProxyEmployeeDAO implements IEmployeeDAO {
  EmployeeDAOImpl employeeDAO;

  public ProxyEmployeeDAO() {
    this.employeeDAO = new EmployeeDAOImpl();
  }

  /**
   * @param client
   * @param obj
   */
  @Override
  public void create(String client, EmployeeDAO obj) throws Exception {
    if (client.equalsIgnoreCase("admin")) {
      employeeDAO.create(client, obj);
      return;
    }
    throw new Exception("Access Denied!");
  }

  /**
   * @param client
   * @param employeeID
   */
  @Override
  public void delete(String client, int employeeID) throws Exception {
    if (client.equalsIgnoreCase("admin")) {
      employeeDAO.delete(client, employeeID);
      return;
    }

    throw new Exception("Access Denied!");
  }

  /**
   * @param client
   * @param employeeID
   * @return
   */
  @Override
  public EmployeeDAO get(String client, int employeeID) throws Exception {
    if (client.equalsIgnoreCase("admin") || client.equalsIgnoreCase("user")) {
      return employeeDAO.get(client, employeeID);
    }

    throw new Exception("Access Denied!");
  }
}
