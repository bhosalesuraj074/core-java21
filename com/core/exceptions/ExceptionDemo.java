package com.core.exceptions;

public class ExceptionDemo {
    public static void main(String[] args) {
        int a  = 45;
        int b =0;
        try {
            a=a/b;
        }
        finally {
            System.out.println("Finally");
        }
    }
}
