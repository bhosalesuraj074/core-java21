package com.core.call;

public class CallByReference {
    int a=10;
    public  void add(CallByReference c){
        this.a = c.a* c.a;
    }

    public static void main(String[] args) {
        CallByReference c = new CallByReference();
        System.out.println("Before passing the reference: "+ c.a);
        c.add(c);
        System.out.println("After passing the reference: "+ c.a);

    }
}
