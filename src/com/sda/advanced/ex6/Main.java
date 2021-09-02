package com.sda.advanced.ex6;
import java.util.TreeMap;

/**
 *  Create a method that accepts TreeMap and prints the first and last EntrySet in the console.
 */

public class Main {
    public static void main(String[] args) {
        TreeMap<String, Integer> map = new TreeMap<>();
        map.put("key0", 0);
        map.put("key1", 1);
        map.put("key2", 2);
        map.put("key3", 3);

        System.out.println(map.firstEntry());
        System.out.println(map.lastEntry());
    }
}