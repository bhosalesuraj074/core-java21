package com.string;

import java.util.regex.Pattern;

public class StringModify {
    public static void main(String[] args) {
        String s1  = new String("  Suraj Bhosale  ");
        System.out.println(s1);
        System.out.println("SubString : "+ s1.substring(6, 9));
        System.out.println("trim() : "+ s1.trim());
        System.out.println("String.join(): "+ String.join("+", "Suraj", "Bhosale", "A","B","c"));
        System.out.println("Suraj".concat(s1));

        System.out.println("Replace: "+ s1.replace("a","Don"));
        System.out.println("Replace First: "+ s1.replaceFirst("a","Suraj"));
        System.out.println("Replace All: "+ s1.replaceAll("a","Suraj"));
        System.out.println("Matches : "+ s1.trim().matches("[a-zA-Z]+"));






    }
}
