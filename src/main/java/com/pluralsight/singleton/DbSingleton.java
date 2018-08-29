package com.pluralsight.singleton;

public class DbSingleton  {
    private static DbSingleton instance = null;
    private DbSingleton() {
    }

    static DbSingleton getInstance() {
        if (instance == null) {
            //Lazy loaded but not thread safe  - Creating the object only when you need to use it and not when the JVM loads
            instance = new DbSingleton();
        }
        return instance;
    }
}
