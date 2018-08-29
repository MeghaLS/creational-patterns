package com.pluralsight.singleton;

public class DbSingleton  {
    private static volatile DbSingleton instance = null;
    private DbSingleton() {
        if (instance != null) {
            //Reflection class cant use constructor
            throw new RuntimeException("Use getInstance() method to create");
        }
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
