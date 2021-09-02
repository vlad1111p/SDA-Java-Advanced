package com.sda.advanced.billapp;

public interface PayableType {

    int getValue();

    CurrencyType getCurrency();

    boolean isFake();

}
