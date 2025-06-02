package com.string;

import java.util.stream.Collectors;

public class StringMatching {
    public static void main(String[] args) {
        String str= "Suraj";
        if (str.matches("[A-Za-z]+")){
            System.out.println("String contain only characters");
        }else {
            System.out.println("not string");
        }


    }
}
