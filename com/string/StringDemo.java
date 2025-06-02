package com.string;

public class StringDemo {
    public static void main(String[] args) {
        // 1. Creating Default String
        String defaultString =  new String();

        // 2. Creating the String
        char chars[] = { 'a', 'b', 'c' };
        String stringFromChars = new String(chars);
       System.out.println("String from characters: " + stringFromChars.toCharArray());
        System.out.println("charAt : "+ stringFromChars.charAt(1));

        // 3. Creating String from byte array
        byte bytes[] = { 65, 66, 67 };
        String stringFromBytes = new String(bytes);
        System.out.println("String from bytes: " + stringFromBytes);

        // 4. Creating String from another String
        String originalString = "Hello World";
        String stringFromOriginal = new String(originalString);
        System.out.println("String from original: " + stringFromOriginal);

        // 5. Creating String using StringBuilder
        StringBuilder stringBuilder = new StringBuilder("Hello");
        stringBuilder.append(" World");
        String stringFromBuilder = stringBuilder.toString();


    }
}
