package com.core.Arrays;

import java.util.ArrayList;
import java.util.Arrays;

public class Test {

    private Test(){
        System.out.println("Default Constructor");
    }

    public static void main(String[] args) {
        System.out.println("Hello world");
        new Test();
        int a[] = new int[3];
        a[0]=10;
        a[1]=20;
        a[2]=30;
        System.out.println("Array length: "+ a.length);
        a= Arrays.copyOf(a, 5);
        System.out.println("After updating the size of the array: "+a.length);


    }


}
