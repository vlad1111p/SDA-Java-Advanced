package com.sda.advanced.ex13;

import java.util.Arrays;
import java.util.HashSet;

/**
 * Create a CarService class that will contain a list of cars and implement the following methods:
 * 1. adding cars to the list,
 * 2. removing a car from the list,
 * 3. returning a list of all cars,
 * 4. returning cars with a V12 engine,
 * 5. returning cars produced before 1999,
 * 6. returning the most expensive car,
 * 7. returning the cheapest car,
 * 8. returning the car with at least 3 manufacturers,
 * 9. returning a list of all cars sorted according to the passed parameter: ascending / descending,
 * 10. checking if a specific car is on the list,
 * 11. returning a list of cars manufactured by a specific manufacturer,
 * 12. returning the list of cars manufactured by the manufacturer with the year of establishment <,>, <=,> =,
 * =,! = from the given.
 */

public class Main {
    public static void main(String[] args) {
        CarService carService = new CarServiceImpl();

        Manufacturer volvo = new Manufacturer("VOLVO", 1980, "Sweden");
        Manufacturer vw = new Manufacturer("VW", 1985, "Germany");
        Manufacturer dacia = new Manufacturer("DACIA", 1970, "Romania");
        Manufacturer renault = new Manufacturer("RENAULT", 1982, "France");

        Car carVolvo = new Car(
                "Volvo",
                "Sedan",
                25000,
                1985,
                new HashSet<>(Arrays.asList(volvo)),
                EngineType.V12
        );

        Car carVw = new Car(
                "VW",
                "Break",
                30000,
                2002,
                new HashSet<>(Arrays.asList(vw)),
                EngineType.S3
        );

        Car carDacia = new Car(
                "Dacia",
                "Sandero",
                12000,
                2012,
                new HashSet<>(Arrays.asList(dacia)),
                EngineType.S4
        );

        Car carRenault = new Car(
                "Renault",
                "Fluence",
                19000,
                2007,
                new HashSet<>(Arrays.asList(renault, dacia, volvo)),
                EngineType.S4
        );

        carService.addCars(new HashSet<>(Arrays.asList(carVolvo, carVw, carDacia, carRenault)));

        System.out.println("1. adding cars to the list");
        carService.getCars().forEach(System.out::println);
        System.out.println("=========================================================================================");

//        carService.removeCar(carDacia);
//        System.out.println("2. removing a car from the list");
//        carService.getCars().forEach(System.out::println);
//        System.out.println("=========================================================================================");

        System.out.println("3. returning a list of all cars");
        carService.getCars().forEach(System.out::println);
        System.out.println("=========================================================================================");

        System.out.println("4. returning cars with a V12 engine");
        carService.getCarsWithV12Engine().forEach(System.out::println);
        System.out.println("=========================================================================================");

        System.out.println("5. returning cars produced before 1999");
        carService.getCarsBefore1999().forEach(System.out::println);
        System.out.println("=========================================================================================");

        System.out.println("6. returning the most expensive car");
        System.out.println(carService.getTheMostExpensiveCar());
        System.out.println("=========================================================================================");

        System.out.println("7. returning the cheapest car");
        System.out.println(carService.getTheCheapestCar());
        System.out.println("=========================================================================================");

        System.out.println("8. returning the car with at least 3 manufacturers");
        carService.getCarWithMin3Manufacture().forEach(System.out::println);
        System.out.println("=========================================================================================");

        System.out.println("9. returning a list of all cars sorted: ascending / descending");
        carService.getCarsSortedByPrice(true).forEach(System.out::println);
        System.out.println("=========================================================================================");

        System.out.println("10. checking if a specific car is on the list");
        System.out.println(carService.isCarPresent(carDacia));
        System.out.println("=========================================================================================");

        System.out.println("11. returning a list of cars manufactured by a specific manufacturer");
        carService.getCarsByManufactures(volvo).forEach(System.out::println);
        System.out.println("=========================================================================================");

        System.out.println("12. returning the list of cars manufactured with the year of establishment");
        carService.getCarsByYearOfEstablishment(yearOfEstablishment -> yearOfEstablishment > 1980).forEach(System.out::println);
        System.out.println("=========================================================================================");

    }
}