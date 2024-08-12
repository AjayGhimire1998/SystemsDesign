package com.ajayghimire.DesignPatterns.LowLevelSystemDesign.CreationalPatterns.ObjectPoolDesignPattern;

public class Client {
  public static void main(String[] args) {
    DBConnectionPoolManager poolManager = new DBConnectionPoolManager();
    DBConnection connection1 = poolManager.getDBConnection();
    DBConnection connection2 = poolManager.getDBConnection();
    DBConnection connection3 = poolManager.getDBConnection();
    DBConnection connection4 = poolManager.getDBConnection();
    DBConnection connection5 = poolManager.getDBConnection();
    DBConnection connection6 = poolManager.getDBConnection();
    DBConnection connection7 = poolManager.getDBConnection();

    System.out.println(connection7);
    //    poolManager.releaseDBConnection(connection5);
    System.out.println(connection6);
    System.out.println(connection7);

    System.out.println(poolManager.getFreeConnectionsPool());
    System.out.println(poolManager.getInUseConnectionsPool());

    poolManager.releaseDBConnection(connection2);

    System.out.println(poolManager.getFreeConnectionsPool());
    System.out.println(poolManager.getInUseConnectionsPool());
  }
}
