package com.sda.advanced.collections.map;

import java.util.*;

public class Mapfirst {
    public static void main(String[] args) {

        java.util.Map<Character,Integer> numberOfOcc = new HashMap<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("insert a command");
        String options = sc.nextLine();
        String product = "";

        for(int i=0;i<options.length();i++){
            char character = options.charAt(i);
            if(numberOfOcc.containsKey(character)){
                int value = numberOfOcc.get(character);
                numberOfOcc.put(character, value+1);
            }else {
                numberOfOcc.put(character, 1);
            }



        }
        System.out.println(numberOfOcc);
    }
}
