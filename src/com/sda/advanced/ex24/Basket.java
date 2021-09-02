package com.sda.advanced.ex24;


public class Basket {
    private int items = 0;

    public void addToBasket() {
        if (items >=10) {
            throw new BasketFullException();
        } else {
            items++;
        }

    }

    public void removeFromBasket() {
        if (items < 1) {
            throw new BasketEmptyException();
        } else {
            items--;
        }

    }
}