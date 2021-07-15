package com.sda.conccurancy;

import java.time.Instant;
import java.util.concurrent.atomic.AtomicLong;

public class Employee extends Thread {
    private static final AtomicLong SLEEP_TIME = new AtomicLong(10000);
    private String name;

    public Employee(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        System.out.printf("<%s: I came to work at <time %s>.\n", name, Instant.now().toString());
        try {

            while (true) {

                Thread.sleep(SLEEP_TIME.get());
                System.out.println(name + " im still working");

            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public synchronized void stopEmployee() {
        System.out.println(name + " is time to go home");
        if (SLEEP_TIME.get() > 21) {
            SLEEP_TIME.set(SLEEP_TIME.get() - 20);
        }
        stop();

    }
}
