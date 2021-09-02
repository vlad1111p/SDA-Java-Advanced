package com.sda.advanced.ex9;


public class Circle {
    private Point2D center;
    private Point2D point;

    public Circle(Point2D center, Point2D point) {
        this.center = center;
        this.point = point;
    }

    public double getRadius() {
        //Math.sqrt((y2 - y1) * (y2 - y1) + (x2 - x1) * (x2 - x1))
        return Math.sqrt(Math.pow((point.getY() - center.getY()), 2) + Math.pow((point.getX() - center.getX()), 2));
    }

    public double getPerimeter() {
        return 2 * Math.PI * getRadius();
    }

    public double getArea() {
        return Math.PI * getRadius() * getRadius();
    }
}