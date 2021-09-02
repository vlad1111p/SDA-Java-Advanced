package com.sda.advanced.ex17;


public enum ConversionType {
    METERS_TO_YARDS(meter -> meter * 1.093),
    YARDS_TO_METERS(yards -> yards * 0.9144),
    CENTIMETERS_TO_INCHES(centimeter -> centimeter * 0.39),
    INCHES_TO_CENTIMETERS(inch -> inch * 2.54),
    KILOMETERS_TO_MILES(kilometer -> kilometer * 0.62),
    MILES_TO_KILOMETERS(mile -> mile * 1.6);

    private final Converter converter;

    ConversionType(Converter converter) {
        this.converter = converter;
    }

    public Converter getConverter() {
        return converter;
    }
}