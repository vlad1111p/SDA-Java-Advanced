package com.sda.conccurancy.exercise2.client;

import com.sda.conccurancy.exercise2.Main;
import com.sda.conccurancy.exercise2.model.Person;

import java.util.concurrent.atomic.AtomicInteger;

public class ClientWriter extends Thread {
    private static final AtomicInteger RANDOM = new AtomicInteger(1);

    @Override
    public void run() {

        while (true) {
            try {
                Thread.sleep(50);
                int currentIndex = RANDOM.getAndIncrement();
                Person person = new Person(
                        currentIndex,
                        "name" + currentIndex,
                        "address" + currentIndex,
                        "phonenumber" + currentIndex
                );
                Main.PERSON_REPOSITORY.addPerson(person);
                System.out.println("person added" + person);

            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }
}
