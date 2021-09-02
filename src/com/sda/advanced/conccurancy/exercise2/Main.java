package com.sda.advanced.conccurancy.exercise2;

import com.sda.advanced.conccurancy.exercise2.client.ClientDeleter;
import com.sda.advanced.conccurancy.exercise2.client.ClientWriter;
import com.sda.advanced.conccurancy.exercise2.repository.PersonRepository;

public class Main {

    public static final PersonRepository PERSON_REPOSITORY=new PersonRepository();
    public static void main(String[] args) {

        for (int i =0;i<5;i++){
        new ClientWriter().start();
        }
        for (int i =0;i<5;i++){
            new ClientDeleter().start();
        }
    }
}
