package com.sda.advanced.ex20;


public class Triangle extends Shape {
    private double hypotenuse;
    private double height;
    private double base;

    public Triangle(double hypotenuse, double height, double base) {
        this.hypotenuse = hypotenuse;
        this.height = height;
        this.base = base;
    }

    @Override
    double calculatePerimeter() {
        return hypotenuse + height + base;
    }

    @Override
    double calculateArea() {
        return height * base / 2;
    }

    public double getHypotenuse() {
        return hypotenuse;
    }

    public double getHeight() {
        return height;
    }

    public double getBase() {
        return base;
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "hypotenuse=" + hypotenuse +
                ", height=" + height +
                ", base=" + base +
                "} " + super.toString();
    }
}