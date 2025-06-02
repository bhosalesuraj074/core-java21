package com.string;
import java.util.regex.Matcher;

public class StringNumberMatches {
    public static void main(String[] args) {
//        String  regex = "\\d";     // A single digit (0–9)
//        String  regex = "\\d+";    // One or more digits
//        String regex = "\\d*";     // 
        String  regex = "\\d{10}";
        String input ="1234567890";
        System.out.println(input.matches(regex));
    }

}
