package com.sda.advanced.ex28;


import java.util.ArrayList;
import java.util.List;

public class SDAArrayList<E> extends ArrayList<E> {
    List<E> getEveryNthElement(int index, int skip) {
        List<E> result = new ArrayList<>();
        if (index < size()) {
            for (int i = index; i < size(); i = i + skip + 1) {
                result.add(get(i));
            }
        }
        return result;
    }
}