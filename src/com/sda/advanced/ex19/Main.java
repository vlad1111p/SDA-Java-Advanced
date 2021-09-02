package com.sda.advanced.ex19;


import java.util.HashMap;
import java.util.Map;
/**
 * Create a Computer class with fields defining computer features: processor, ram, graphics card, company and model.
 * Implement setters, getters, constructor with all fields, toString(), equals() and hashcode() methods.
 * Instantiate several objects and check how the methods work.
 * -----------------------------------------------------------------------------------------------------------
 * Create a Laptop class extending the Computer class from the previous task.
 * The Laptop class should additionally contain the battery parameter.
 * Implement additional getters, setters, constructor and overwrite the toString(), equals() and hashcode()
 * methods accordingly.
 * Use a reference to parent class methods.
 */
public class Main {
    public static void main(String[] args) {
        Computer computer = new Computer("3200 Ghz", "32 GB", "1600 GT", "Intel", "HHH 321");

        System.out.println(computer);
        System.out.println(computer.getModel());
        System.out.println(computer.hashCode());

        Computer computer1 = new Laptop("3400", "64", "1800", "AMD", "DATASET", "5A");
        System.out.println(computer1);
        System.out.println(computer1.hashCode());

        Map<Computer, Integer> stock = new HashMap<>();
        stock.put(computer, 10);
        stock.put(computer1, 20);
        System.out.println(stock);

    }
}