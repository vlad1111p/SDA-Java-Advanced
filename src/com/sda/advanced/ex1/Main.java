package com.sda.advanced.ex1;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Create a method that takes a string list as a parameter, then returns the list sorted alphabetically from Z to A.
 */

public class Main {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("ddd", "aaa", "fff", "zzz", "yyy", "rrr");
        List<String> sortedList = sortList(list);
        sortedList.forEach(word -> System.out.println(word));
    }

    public static List<String> sortList(List<String> list) {
        return list.stream()
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());
    }
}