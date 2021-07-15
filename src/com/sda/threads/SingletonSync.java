package com.sda.threads;

public class SingletonSync {
    private static SingletonSync instance;

    private SingletonSync() {

    }

    public static SingletonSync get() {
        if (instance == null) {
            synchronized (instance) {
                if (instance == null)
                    instance = new SingletonSync();
            }
        }
        return instance;
    }
}
