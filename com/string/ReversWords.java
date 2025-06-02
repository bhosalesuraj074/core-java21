package com.string;

import java.util.Arrays;

public class ReversWords {
    // reversing the word character without the changing the position
    public static void main(String[] args) {

            String str = "Hi this is Suraj Bhosale";
//        System.out.println(String.join("",Arrays.asList(str.split("")).reversed()));
            for (String s : str.split(" ")){
                System.out.print(String.join("",Arrays.asList(s.split("")).reversed())+" ");
            }
    }
}
