package com.sda.advanced.ex13;

import java.util.List;
import java.util.Set;
import java.util.function.Predicate;
/**
 *  Entity that handles the car operation
 */
public interface CarService {
    /**
     * adding cars to the list.
     *
     * @param cars, a set of cars that will be added to service
     */
    void addCars(Set<Car> cars);

    /**
     * removing a car from the list,
     *
     * @param car, the car will
     */

    void removeCar(Car car);

    /**
     * Get all cars
     *
     * @return, returning a list of all cars
     */
    List<Car> getCars();

    /**
     * Get card with V12 Engine
     *
     * @return, returning cars with a V12 engine
     */
    List<Car> getCarsWithV12Engine();

    /**
     * getting Cars 1999
     *
     * @return, returning cars produced before 1999,
     */

    List<Car> getCarsBefore1999();

    /**
     * Get the most expensive Car
     *
     * @return, the expensive car, or null
     */
    Car getTheMostExpensiveCar();

    /**
     * Get the cheapest Car
     *
     * @return, the cheapest car, or null
     */
    Car getTheCheapestCar();

    /**
     * Get cars with min 3 Manufactures;
     *
     * @return, returning the car with at least 3 manufacturers
     */

    List<Car> getCarWithMin3Manufacture();

    /**
     * Get cars ascending / descending
     *
     * @param ascending, returning a list of all cars sorted according to the passed parameter: ascending / descending
     * @return
     */
    List<Car> getCarsSortedByPrice(boolean ascending);

    /**
     * get a specific car
     *
     * @param car, checking if a specific car is on the list
     * @return
     */
    boolean isCarPresent(Car car);

    /**
     * Get car by Manufacture
     *
     * @return, returning a list of cars manufactured by a specific manufacturer
     */
    List<Car> getCarsByManufactures(Manufacturer manufacturer);

    /**
     * returning the list of cars manufactured by the manufacturer
     *
     * @param yearOfEstablishmentFilterCondition,
     * @return, returning the list of cars manufactured by the manufacturer
     *          with the year of establishment <,>, <=,> =, *  *  =,! = from the given
     */
    List<Car> getCarsByYearOfEstablishment(Predicate<Integer> yearOfEstablishmentFilterCondition);

}