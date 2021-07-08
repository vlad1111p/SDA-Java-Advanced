package com.sda.billapp;

public interface PayableType {

    int getValue();

    CurrencyType getCurrency();

    boolean isFake();

}
