package com.ajayghimire.DesignPatterns.LowLevelSystemDesign.CreationalPatterns.ObjectPoolDesignPattern;

public class DBConnection {
  String connection;

  public DBConnection(String conn) {
    try {
      connection = conn;
    } catch (Exception e) {
      System.err.println(e.getMessage());
    }
  }

  @Override
  public String toString() {
    return "DBConnection{" + "connection=" + connection + '}';
  }
}
