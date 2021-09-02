package com.sda.advanced.ex15;

/**
 * Create a Car enum class with FERRARI, PORSCHE, MERCEDES, BMW, OPEL, FIAT, TOYOTA etc. constants.
 * Each vehicle has its own parameters, e.g. price, power, etc.
 * Enum should contain boolean isPremium() and boolean isRegular() methods.
 * The isPremium() method should return the opposite result to the call of the isRegular() method.
 * In addition, the boolean isFasterThan() method should be declared and implemented as part of the enum class.
 * This method should accept the Car type object and display information that the indicated vehicle is faster
 * or not than the vehicle provided in the argument.
 * To do this, use the compareTo() method.
 */
public class Main {
    public static void main(String[] args) {
        System.out.println(Car.FERRARI);
        System.out.println(Car.PORSCHE);
        System.out.println(Car.MERCEDES);
        System.out.println("===============================");

        System.out.println(Car.FERRARI.name() + " is Premium?");
        System.out.println(Car.FERRARI.isPremium());
        System.out.println(Car.PORSCHE.name() + " is Premium?");
        System.out.println(Car.PORSCHE.isPremium());
        System.out.println("===============================");

        System.out.println(Car.BMW.name() + " is Regular?");
        System.out.println(Car.BMW.isRegular());
        System.out.println(Car.MERCEDES.name() + " is Regular?");
        System.out.println(Car.MERCEDES.isRegular());
        System.out.println("===============================");

        System.out.println(Car.OPEL.name() +" is faster than " + Car.FIAT.name() + "?");
        System.out.println(Car.OPEL.isFasterThan(Car.FIAT));
        System.out.println(Car.FIAT.name() +" is faster than " + Car.TOYOTA.name() + "?");
        System.out.println(Car.FIAT.isFasterThan(Car.TOYOTA));
        System.out.println("===============================");

        System.out.println("CARS PRICES (eur): ");
        System.out.println(Car.FERRARI.getPrice());
        System.out.println(Car.PORSCHE.getPrice());
        System.out.println(Car.MERCEDES.getPrice());
        System.out.println("===============================");

        System.out.println("CARS POWERS (hp): ");
        System.out.println(Car.BMW.getPower());
        System.out.println(Car.OPEL.getPower());
        System.out.println(Car.FIAT.getPower());
        System.out.println("===============================");
    }
}