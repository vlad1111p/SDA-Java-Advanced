package com.sda.advanced.ex24;

public class BasketFullException extends RuntimeException{
    public BasketFullException() {
        super("Maximum items");
    }
}