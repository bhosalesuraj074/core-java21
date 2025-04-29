package com.core.innerclass;

public class OuterClass {

   int a= 10;

    class InnerClass {
//      int InnerB =20;
      int a = 30;
      public void display(){
         System.out.println("Outer A: "+ a );
         System.out.println("Inner A: "+a);
      }
   }

}
