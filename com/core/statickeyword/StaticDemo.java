package com.core.statickeyword;

public class StaticDemo {
    int a=10;
    static int b=10;

    // static block
    static {
        System.out.println("Static block");
    }
    // initialization block
    {
        System.out.println("Initialization block");
    }
   public  StaticDemo(){
       System.out.println("Static Demo constructor");
   }
   public  static  void staticMethod(){
       // System.out.println(a); - can't access the non-static members in the static blocks or method
       System.out.println(b);
   }

    public static void main(String[] args) {
    new StaticDemo();
    StaticDemo.staticMethod();
    }
}
