package com.sunil.designpatterns;

public class SingletonExample {

}

class SingletonEager {
    private static SingletonEager instance = new SingletonEager();

    private SingletonEager() {}

    public static SingletonEager getInstance() {
        return instance;
    }
}

class Singleton {
    private static Singleton instance;

    private Singleton() {}
}