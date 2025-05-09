package com.core.innerclass;

public class OuterClass {

   int x= 10;

    class InnerClass {
//      int InnerB =20;
      int a = 30;
      public void display(){
         System.out.println("Outer A: "+ a );
         // we can't non-static member in the static class
         // -> System.out.println("Inner x: "+x);
      }
   }

}
