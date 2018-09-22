package com.pluralsight.singleton;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbSingleton  {
    private static volatile DbSingleton instance = null;
    private static volatile Connection connnection = null;

    private DbSingleton() {
        try{
            DriverManager.registerDriver(new org.apache.derby.jdbc.EmbeddedDriver());
        } catch (SQLException e) {
            e.printStackTrace();
        }
        if (connnection != null) {
            //Reflection class cant use constructor
            throw new RuntimeException("Use getInstance() method to create");
        }
        if (instance != null) {
            //Reflection class cant use constructor
            throw new RuntimeException("Use getInstance() method to create");
        }
    }

    public Connection getConnnection() {
        if (connnection == null) {
            //Rather than synchronize on the whole method, which is performant
            synchronized (DbSingleton.class) {
                if (connnection == null) {
                    String dbConnString = "jdbc:derby:memory:codejava/webdb;create=true;";
                    try {
                        connnection = DriverManager.getConnection(dbConnString);
                    } catch (SQLException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
        return connnection;
    }

    static DbSingleton getInstance() {
        if (instance == null) {
            //Rather than synchronize on the whole method, which is performant
            synchronized (DbSingleton.class) {
                if (instance == null) {
                    //Lazy loaded but not thread safe  - Creating the object only when you need to use it and not when the JVM loads
                    instance = new DbSingleton();
                }
            }
        }
        return instance;
    }
}
