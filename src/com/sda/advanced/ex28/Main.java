package com.sda.advanced.ex28;

/**
 * Extend the ArrayList<E> class by implementing the getEveryNthElement() method.
 * This method returns a list of elements and takes two parameters: the element index from which it starts
 * and a number specifying which element to choose.
 * For the list: [a, b, c, d, e, f, g] and parameters: startIndex = 2 and skip = 3 it should return [c, g]
 */
public class Main {
    public static void main(String[] args) {
        SDAArrayList<Integer> sdaArrayList = new SDAArrayList<>();
        sdaArrayList.add(1);
        sdaArrayList.add(2);
        sdaArrayList.add(3);
        sdaArrayList.add(4);
        sdaArrayList.add(5);
        sdaArrayList.add(6);
        sdaArrayList.add(7);
        sdaArrayList.add(8);
        sdaArrayList.add(9);
        sdaArrayList.add(10);
        sdaArrayList.add(11);
        sdaArrayList.add(12);
        sdaArrayList.add(13);
        sdaArrayList.add(14);
        sdaArrayList.add(15);
        sdaArrayList.add(16);


        System.out.println(sdaArrayList.getEveryNthElement(3, 2));
    }
}