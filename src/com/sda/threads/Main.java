package com.sda.threads;

public class Main {
    public static void main(String[] args) {
        ThreadA firstThread=new ThreadA("first thread");
        ThreadA secondThread=new ThreadA("second thread");
        firstThread.start();
        secondThread.start();
        Thread thirdThread=new Thread(new ThreadGc());
        Thread forthThread=new Thread(new ThreadGc());
        thirdThread.start();
        forthThread.start();
    }
}
