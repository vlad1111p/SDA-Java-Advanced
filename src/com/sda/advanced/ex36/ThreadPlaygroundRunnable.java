package com.sda.advanced.ex36;

public class ThreadPlaygroundRunnable implements Runnable {
    private String name;

    public ThreadPlaygroundRunnable(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
//            try {
//                Thread.sleep(50);
                System.out.println(Thread.currentThread().getName() + "  " + this.name + "  " + i);

//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }

        }
    }
}
