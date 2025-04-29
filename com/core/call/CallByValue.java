package com.core.call;

public class CallByValue {
    public void add(int a){
        System.out.println("Square: "+ a*a);
    }

    public static void main(String[] args) {
        CallByValue c  =new CallByValue();
        int a = 10;
        System.out.println("Before passing the value: "+a);
        c.add(a);
        System.out.println("After passing the value: "+a);
    }
}
