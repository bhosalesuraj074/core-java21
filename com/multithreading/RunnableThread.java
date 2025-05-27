package com.multithreading;

public class RunnableThread implements Runnable {



    public void run() {
        System.out.println("Runnable Thread "+ Thread.currentThread().getName());
    }
}
