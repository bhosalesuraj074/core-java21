package com.core.varargs;

import java.util.Arrays;

public class VarArgs {

    public void varArgs(boolean ...varArgs){
        System.out.println("Boolean value: "+ Arrays.toString(varArgs));
    }
    //
    public  void varArgs(int ...varArgs){
        System.out.println("single int Parameter"+ Arrays.toString(varArgs));
    }

    // varArgs parameter must place at the end
    public void varArgs(int a , int ...varArgs){
        System.out.println("Values: "+ a);
        System.out.println(Arrays.toString(varArgs));
    }



    public static void main(String[] args) {
        VarArgs v = new VarArgs();
        // Ambiguous method call. compiler got confused which should call
        //v.varArgs(10,10,20,30,40);
        v.varArgs(true, false, true, true, false);



    }
}
