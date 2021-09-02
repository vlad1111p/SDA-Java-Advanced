package com.sda.advanced.ex35;

public class Main {

    public static void main(String[] args) {

        for (int i = 0; i < 1000; i++) {
            Thread myThread = new Thread(new MyRunnable());
            myThread.start();
        }
    }
}
