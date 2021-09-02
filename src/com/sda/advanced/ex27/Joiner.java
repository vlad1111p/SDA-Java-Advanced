package com.sda.advanced.ex27;


import java.util.Arrays;
import java.util.stream.Collectors;

public class Joiner<T> {
    private final String separator;

    public Joiner(String separator) {
        this.separator = separator;
    }

//    public String join(T...values) {
//        String result = "";
//        for (int i = 0; i < values.length; i++) {
//            if (values.length - 1 == i) {
//                result = result + values[i];
//            } else {
//                result = result + values[i] + separator;
//            }
//        }
//        return result;
//    }

    public String join(T... values) {
        return String.join(
                separator,
                Arrays.asList(values).
                        stream().
                        map(value -> value.toString())
                        .collect(Collectors.toList())
        );
    }

}