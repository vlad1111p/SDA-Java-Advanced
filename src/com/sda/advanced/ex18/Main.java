package com.sda.advanced.ex18;


/**
 * Create a Computer class with fields defining computer features: processor, ram, graphics card, company and model.
 * Implement setters, getters, constructor with all fields, toString(), equals() and hashcode() methods.
 * Instantiate several objects and check how the methods work.
 */
public class Main {
    public static void main(String[] args) {
        Computer computer = new Computer("3200 Ghz", "32 GB", "1600 GT", "Intel", "HHH 321");

        System.out.println(computer);
        System.out.println(computer.getModel());
        System.out.println(computer.hashCode());

    }
}