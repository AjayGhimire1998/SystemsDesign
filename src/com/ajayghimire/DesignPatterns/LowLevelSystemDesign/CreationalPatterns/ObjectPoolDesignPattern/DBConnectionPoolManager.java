package com.ajayghimire.DesignPatterns.LowLevelSystemDesign.CreationalPatterns.ObjectPoolDesignPattern;

import java.util.ArrayList;
import java.util.List;

public final class DBConnectionPoolManager {
  private static final int INITIAL_POOL_SIZE = 3;
  private static final int MAXIMUM_POOL_SIZE = 6;
  private static DBConnectionPoolManager dbConnectionPoolManagerInstance = null;
  private List<DBConnection> freeConnectionsPool = new ArrayList<>();
  private List<DBConnection> inUseConnectionsPool = new ArrayList<>();

  public DBConnectionPoolManager() {
    for (int i = 0; i < INITIAL_POOL_SIZE; i++) {
      freeConnectionsPool.add(new DBConnection());
    }
  }

  public static DBConnectionPoolManager getInstance() {
    if (dbConnectionPoolManagerInstance == null) {
      synchronized (DBConnectionPoolManager.class) {
        if (dbConnectionPoolManagerInstance == null) {
          dbConnectionPoolManagerInstance = new DBConnectionPoolManager();
        }
      }
    }
    return dbConnectionPoolManagerInstance;
  }

  public synchronized DBConnection getDBConnection() {
    if (freeConnectionsPool.isEmpty() && inUseConnectionsPool.size() < MAXIMUM_POOL_SIZE) {
      freeConnectionsPool.add(new DBConnection());
    } else if (freeConnectionsPool.isEmpty() && inUseConnectionsPool.size() >= MAXIMUM_POOL_SIZE) {
      return null;
    }

    DBConnection dbConnection = freeConnectionsPool.remove(freeConnectionsPool.size() - 1);
    inUseConnectionsPool.add(dbConnection);
    return dbConnection;
  }

  public synchronized void releaseDBConnection(DBConnection dbConnection) {
    if (dbConnection != null) {
      inUseConnectionsPool.remove(dbConnection);
      freeConnectionsPool.add(dbConnection);
    }
  }
}
