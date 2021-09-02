package com.sda.advanced.ex15;

public enum Car {
    FERRARI(100000, "500", true),
    PORSCHE(150000, "400", false),
    MERCEDES(50000, "250", true),
    BMW(40000, "200", false),
    OPEL(30000, "150", true),
    FIAT(25000, "120", false),
    TOYOTA(350000, "250", true);

    private int price;
    private String power;
    private boolean isPremium;

    Car(int price, String power, boolean isPremium) {
        this.price = price;
        this.power = power;
        this.isPremium = isPremium;
    }

    public int getPrice() {
        return price;
    }

    public String getPower() {
        return power;
    }

    public boolean isPremium() {
        return isPremium;
    }

    public boolean isRegular() {
        return !this.isPremium;
    }

    public boolean isFasterThan(Car car) {
        int currentCarPower = Integer.parseInt(this.power);
        int otherCarPower = Integer.parseInt(car.power);
        return Integer.compare(currentCarPower, otherCarPower) == 1;
    }

    @Override
    public String toString() {
        return "Car{" +
                "price=" + price +
                ", power='" + power + '\'' +
                ", isPremium=" + isPremium +
                '}';
    }
}