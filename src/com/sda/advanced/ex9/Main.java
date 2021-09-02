package com.sda.advanced.ex9;

/**
 * Create a Point2D class with fields double x, double y, getters, setters and constructor.
 * Then create a Circle class that will have a constructor:
 * Circle(Point2D center, Point2D point)
 * The first parameter specifies the center of the circle, the second is any point on the circle.
 * Based on these points, the Circle class is to determine:
 * • circle radius when calling double getRadius() method
 * • circle circumference when calling double getPerimeter() method
 * • circle area when calling double getArea() method
 * • (challenging) three points on the circle every 90 degrees from the point given when
 * calling the List<Point2D> getSlicePoints() method
 */

public class Main {
    public static void main(String[] args) {
        Point2D point1 = new Point2D(12, 30);
        Point2D point2 = new Point2D(15, 35);

        Circle circle = new Circle(point1, point2);
        System.out.println(circle.getRadius());
        System.out.println(circle.getPerimeter());
        System.out.println(circle.getArea());

    }
}