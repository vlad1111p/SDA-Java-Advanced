package com.sda.advanced.ex4;


public interface Storage {

    void addToStorage(String key, String value);

    void printValues(String key);

    void findValues(String value);
}