package com.sda.advanced.ex13;


import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class CarServiceImpl implements CarService {
    private Set<Car> cars = new HashSet<>();

    @Override
    public void addCars(Set<Car> cars) {
        this.cars.addAll(cars);
    }

    @Override
    public void removeCar(Car car) {
        cars.remove(car);
    }

    @Override
    public List<Car> getCars() {
        return new ArrayList<>(cars);
    }

    @Override
    public List<Car> getCarsWithV12Engine() {
        return cars.stream()
                .filter(car -> EngineType.V12.equals(car.getEngineType()))
                .collect(Collectors.toList());
    }

    @Override
    public List<Car> getCarsBefore1999() {
        return cars.stream()
                .filter(car -> car.getYearOfManufacture() < 1999)
                .collect(Collectors.toList());
    }

    @Override
    public Car getTheMostExpensiveCar() {
        return cars.stream()
                .max((car1, car2) -> Double.compare(car1.getPrice(), car2.getPrice()))
                .orElse(null);
    }

    @Override
    public Car getTheCheapestCar() {
        return cars.stream()
                .min((car1, car2) -> Double.compare(car1.getPrice(), car2.getPrice()))
                .orElse(null);
    }

    @Override
    public List<Car> getCarWithMin3Manufacture() {
        return cars.stream()
                .filter(car -> car.getManufacturers().size() >= 3)
                .collect(Collectors.toList());
    }

    @Override
    public List<Car> getCarsSortedByPrice(boolean ascending) {
        if (ascending) {
            return cars.stream()
                    .sorted((car1, car2) -> Double.compare(car1.getPrice(), car2.getPrice()))
                    .collect(Collectors.toList());
        } else {
            return cars.stream()
                    .sorted((car1, car2) -> Double.compare(car2.getPrice(), car1.getPrice()))
                    .collect(Collectors.toList());
        }
    }

    @Override
    public boolean isCarPresent(Car car) {
        return cars.contains(car);
    }

    @Override
    public List<Car> getCarsByManufactures(Manufacturer manufacturer) {
        return cars.stream()
                .filter(car -> car.getManufacturers().contains(manufacturer))
                .collect(Collectors.toList());
    }

    @Override
    public List<Car> getCarsByYearOfEstablishment(Predicate<Integer> yearOfEstablishmentFilterCondition) {
        return cars.stream()
                .filter(car -> car.getManufacturers()
                        .stream()
                        .filter(manufacturer -> yearOfEstablishmentFilterCondition.test(manufacturer.getYearOfEstablishment()))
                        .findAny()
                        .isPresent()
                ).collect(Collectors.toList());
    }


}