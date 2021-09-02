package com.sda.advanced.ex21;



public class Cube extends Shape3D{
    private double length;

    public Cube(double length) {
        this.length = length;
    }

    @Override
    double calculatePerimeter() {
        return 12 * length;
    }

    @Override
    double calculateArea() {
        return 6 * length * length;
    }


    @Override
    double calculateVolume() {
        return length * length * length;
    }
}