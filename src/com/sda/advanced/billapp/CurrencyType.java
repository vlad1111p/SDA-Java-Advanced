package com.sda.advanced.billapp;

public enum CurrencyType {
    EUR("Euro"),
    USD("Dollar"),
    RON("Leu");
    private String name;

    CurrencyType(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return  name ;
    }
}
