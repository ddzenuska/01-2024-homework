package io.codelex.multithreading.examples;

public class ExtendingThread extends Thread {
    public void run() {
        System.out.println("It is alive!");
    }

    public static void main(String args[]) {
        ExtendingThread obj = new ExtendingThread();
        obj.start();
    }
}
