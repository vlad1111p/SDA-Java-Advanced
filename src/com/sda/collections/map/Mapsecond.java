package com.sda.collections.map;

import java.util.*;

public class Mapsecond {
    public static void main(String[] args) {
        Map<Character, List<Integer> > numberOfOcc = new HashMap<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("insert a command");
        String options = sc.nextLine();
        String product = "";


        for (int i = 0; i < options.length(); i++) {

            char character = options.charAt(i);
            if (!numberOfOcc.containsKey(character)) {
                numberOfOcc.put(character, new ArrayList<Integer>());
            }
                numberOfOcc.get(character).add(i);
            }
        System.out.println(numberOfOcc);
        }

    }

