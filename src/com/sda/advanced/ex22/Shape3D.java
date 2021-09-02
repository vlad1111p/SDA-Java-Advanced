package com.sda.advanced.ex22;


public abstract class Shape3D extends Shape implements Fillable{
    abstract double calculateVolume();

    @Override
    public void fill(double water) {
        if (calculateVolume() > water) {
            System.out.println("NOT ENOUGH WATER");
        } else if (calculateVolume() < water) {
            System.out.println("TO MUCH WATER");
        } else {
            System.out.println("WATER TO THE BRIM");
        }
    }
}