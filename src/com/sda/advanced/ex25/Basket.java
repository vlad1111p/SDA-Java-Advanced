package com.sda.advanced.ex25;



public class Basket {
    private int items = 0;

    public void addToBasket() throws BasketFullException{
        if (items >=10) {
            throw new BasketFullException();
        } else {
            items++;
        }

    }

    public void removeFromBasket() throws BasketEmptyException{
        if (items < 1) {
            throw new BasketEmptyException();
        } else {
            items--;
        }

    }
}