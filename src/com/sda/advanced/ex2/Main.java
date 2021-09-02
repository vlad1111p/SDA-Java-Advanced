package com.sda.advanced.ex2;

import java.util.*;

/**
 * Create a method that takes a string list as a parameter, then returns that list sorted alphabetically from Z to A,
 * case-insensitive.
 */

public class Main {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Car", "boat", "train", "Bike");
        System.out.println(reverseSortListCaseInsensitive(list));
    }

    public static List<String> reverseSortListCaseInsensitive(List<String> list) {
        Collections.sort(list, (o1, o2) -> o2.compareToIgnoreCase(o1));
        return list;
    }

}