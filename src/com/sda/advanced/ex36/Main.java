package com.sda.advanced.ex36;


//Create a ThreadPlaygroundRunnableclass that implements the Runnableinterface having a name field of type Stringwith a
// public constructor for that field. The class should implement the run()method from the Runnableinterface. This method
// should contain a loop iterating up to 10 and print the name of the current thread using Thread.currentThread().getName(),
// the name given in the constructor and the current iteration number.Create a class that has two private static Threadfields and
// a standard public static void main (String [] args) method. Then initialize the Threadfields using the constructor that accepts
// the Runnableobject and pass ThreadPlaygroundRunnablecreating it using the constructor, each time giving a different name.
// On each thread (Thread) use the start()method.
public class Main {
    private static Thread firstThread;
    private static Thread secondThread;

    public static void main(String[] args) {
        firstThread = new Thread(new ThreadPlaygroundRunnable("first name"));
        secondThread = new Thread(new ThreadPlaygroundRunnable("second name"));
        firstThread.start();
        secondThread.start();
    }

}
