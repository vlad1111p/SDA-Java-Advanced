package com.sda.threads;

public class ThreadGc implements Runnable{


    @Override
    public void run() {
        System.gc();
        System.runFinalization();
        System.out.println("garbage collector has been invoked");
    }
}
