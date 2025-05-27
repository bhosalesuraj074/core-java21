package com.multithreading;

public class NewThread extends Thread{
    public NewThread(){

    }
    public NewThread(String newThread) {
        super(newThread);
    }

    @Override
    public void run() {
        System.out.println("New thread Called ");
        System.out.println(Thread.currentThread());
        for (int i = 0; i < 5; i++) {
            System.out.println(i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("*");
        }
        
    }
}
