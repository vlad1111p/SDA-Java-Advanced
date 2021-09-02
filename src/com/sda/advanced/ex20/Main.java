package com.sda.advanced.ex20;


/**
 * Create an abstract Shape class with the abstract methods calculatePerimeter() for calculating the perimeter
 * and calculateArea() for calculating the area.
 * Create Rectangle, Triangle, Hexagon classes, extending the Shape class, and implementing abstract methods accordingly.
 * Verify the solution correctness.
 */
public class Main {
    public static void main(String[] args) {
        Shape triangle = new Triangle(5, 3, 4);
        Shape rectangle = new Rectangle(2, 4);


        System.out.println("Triangle perimeter = " + triangle.calculatePerimeter());
        System.out.println("Triangle area = " + triangle.calculateArea());
        System.out.println("--------------------------------------------------");
        System.out.println("Rectangle perimeter = " + rectangle.calculatePerimeter());
        System.out.println("Rectangle area = " + rectangle.calculateArea());

    }
}