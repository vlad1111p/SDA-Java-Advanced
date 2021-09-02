package com.sda.advanced.ex21;


/**
 * Create an abstract 3DShape class that extends the Shape class from the previous task.
 * Add an additional method calculateVolume().
 * Create Cone and Qube classes by extending the 3DShape class, properly implementing abstract methods.
 * Verify the solution correctness.
 */
public class Main {
    public static void main(String[] args) {
        Shape3D cube = new Cube(3);
        System.out.println(cube.calculatePerimeter());
        System.out.println(cube.calculateArea());
        System.out.println(cube.calculateVolume());
    }
}