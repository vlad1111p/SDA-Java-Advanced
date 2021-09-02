package com.sda.advanced.ex5;

/**
 * Implement the SDAHashSet<E> class that will implement the HashSet<E> logic.
 * It should support methods:
 * • add
 * • remove
 * • size
 * • contains
 * • clear
 */

public class Main {
    public static void main(String[] args) {
        SDAHashSet<String> set = new SDAHashSetImpl<>();
        set.add("aaa");
        set.add("bbb");
        set.add("ccc");
        System.out.println(set.size());
        System.out.println("===============");

        set.remove("aaa");
        System.out.println(set.size());
        System.out.println("===============");

        System.out.println(set.contains("bbb"));
        System.out.println("===============");

        set.clear();
        System.out.println(set.size());
        System.out.println("===============");
    }
}