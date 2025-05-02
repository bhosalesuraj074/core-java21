package com.core.basics;

public class Casting {
    public static void main(String[] args) {
        byte b;
        int i=-1002;
        b = (byte) i;
        //casting int to character , 65 replaced by ASCII values which A
        char c = 65;
        System.out.println("int to char: "+c);
        double d = 320.234;
        System.out.println("int to byte casting: "+b);
        // casting double into the int
        i= (int) d;
        System.out.println("double to int casting: "+i);

    }
}
