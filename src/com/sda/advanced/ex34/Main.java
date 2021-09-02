package com.sda.advanced.ex34;


/**
 * Create a class that extends the Threadclass, e.g. MyThread, overload the run()method so it displays the thread name
 * in the console by reading it from the static method of the current thread:Thread.currentThread().getName()Create a class
 * with the public static void main (String [] args)method. Inside the main method create a type variable of our class created
 * above, e.g. MyThreadand initialize the class. Perform the start()method on the variable.
 */

public class Main {
    public static void main(String[] args) {
//        MyThread thread=new MyThread();
//        thread.start();
//        MyThread thread1=new MyThread();
//        thread1.start();
//        MyThread thread2=new MyThread();
//        thread2.start();

        for(int i=0;i<1000;i++){
            MyThread thread=new MyThread();
            thread.start();
        }
    }
}
