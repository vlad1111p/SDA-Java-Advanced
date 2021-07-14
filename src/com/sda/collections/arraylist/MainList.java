package com.sda.collections.arraylist;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainList {

    public static void main(String[] args) {


        List<String> products = new ArrayList<String>();
        Scanner sc = new Scanner(System.in);
        System.out.println("add to add a product");
        String options = "";
        String product = "";
        while (!options.equals("stop")) {
            System.out.println("display");
            System.out.println("add");
            System.out.println("m");
            System.out.println("stop");
            options = sc.nextLine();
            switch (options) {
                case "add":
                    System.out.println("what item do you want to add");
                    product = sc.nextLine();
                    products.add(product);
                    break;
                case "display":
                    for (String prod : products) {
                        System.out.println(prod);

                    }
                    break;
                case "m":
                    for (String prod : products) {
                        if (prod.startsWith("m")) {
                            System.out.println(prod);
                        }
                    }
                  default : break;
            }
        }

    }


}

