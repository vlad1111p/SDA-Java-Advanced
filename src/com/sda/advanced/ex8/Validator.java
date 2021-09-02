package com.sda.advanced.ex8;

public interface Validator<T> {
    boolean validate(T item);
}