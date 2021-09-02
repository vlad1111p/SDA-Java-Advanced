package com.sda.advanced.ex10;

/**
 *  Create a MoveDirection class with fields double x, double y as well as getters, setters and constructor.
 *  Create a Movable interface with the move(MoveDirection moveDirection) method.
 *  Implement the interface in the classes from the previous task (Point2D and Circle).
 *  When the move(MoveDirection moveDirection) method is called, the objects are to change their position based on
 *  the provided direction (MoveDirection).
 *  Validate the offset by calling the other Circle methods.
 */

public class Main {
    public static void main(String[] args) {
        Point2D point1 = new Point2D(12, 30);
        Point2D point2 = new Point2D(15, 35);

        Circle circle = new Circle(point1, point2);
        System.out.println(circle.getRadius());
        System.out.println(circle.getPerimeter());
        System.out.println(circle.getArea());
        System.out.println("=======================");

        MoveDirection moveDirection = new MoveDirection(2, 6);
        point2.move(moveDirection);
        System.out.println(circle.getRadius());
        System.out.println(circle.getPerimeter());
        System.out.println(circle.getArea());

    }
}
