package com.string;

import java.util.Arrays;

public class StringAllMethods {
    public static void main(String[] args) {
        String s = new String("Hello world");
        String str[] = s.split(" ");
        str[str.length-1]= String.join("", Arrays.asList(str[str.length-1].split("")).reversed());
        System.out.println(String.join(" ", str));



    }
}
