package com.sda.advanced.ex37;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {

    public static void main(String[] args) {
        Executor executor = Executors.newFixedThreadPool(10);
        for (int i = 0; i < 1000; i++) {
            executor.execute(new ThreadPlaygroundRunnable("name " + i));

        }
        ((ExecutorService) executor).shutdown();
    }
}
