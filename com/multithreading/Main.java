package com.multithreading;

public class Main {
    public static void main(String[] args) {
       System.out.println("Main "+ Thread.currentThread().getName());
        NewThread nt = new NewThread("New Thread");
        nt.setName("Suraj");
        nt.start();
        System.out.println("---------------------");
        RunnableThread rt = new RunnableThread();
        Thread t = new Thread(rt);
        t.start();
    }

}
