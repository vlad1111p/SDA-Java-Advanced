package com.sda.advanced.ex25;

public class BasketFullException extends Exception{
    public BasketFullException() {
        super("Maximum items");
    }
}