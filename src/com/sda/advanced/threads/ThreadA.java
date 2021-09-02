package com.sda.advanced.threads;

public class ThreadA extends Thread {

    private String customMessage;

    public ThreadA(String customMessage) {
        this.customMessage = customMessage;
    }

    @Override
    public void run() {


        try {
            for (int i = 0; i < 50; i++) {
                System.out.println("Hi i am thread a");
                Thread.sleep(100);
                System.out.println(customMessage);
            }

        } catch (InterruptedException e) {

            e.printStackTrace();

        }
    }
}
