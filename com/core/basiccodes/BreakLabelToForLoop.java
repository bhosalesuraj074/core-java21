package com.core.basiccodes;

public class BreakLabelToForLoop {
    public static void main(String[] args) {
       outer: for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 20; j++) {
                if (j ==10)
                    break outer;
                System.out.println("J value: "+j);
            }
           System.out.println("Outer scope");
        }
        System.out.println("loop completed");
    }
}
