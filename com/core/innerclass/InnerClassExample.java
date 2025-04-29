package com.core.innerclass;

public class InnerClassExample {
    public static void main(String[] args) {
        OuterClass oc= new OuterClass();
//        System.out.println(oc.a);

        // creating the object of non-static inner class below
        OuterClass.InnerClass ic = oc.new InnerClass();

        // creating the object of static inner class below
//        OuterClass.InnerClass ic = new OuterClass.InnerClass();
        ic.display();
    }


}
