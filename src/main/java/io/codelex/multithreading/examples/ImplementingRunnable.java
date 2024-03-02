package io.codelex.multithreading.examples;

public class ImplementingRunnable implements Runnable {
    public void run() {
        System.out.println("It is alive!");
    }

    public static void main(String args[]) {
        ImplementingRunnable obj = new ImplementingRunnable();
        Thread thread = new Thread(obj);
        thread.start();
    }
}
