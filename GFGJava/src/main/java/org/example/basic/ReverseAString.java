package org.example.basic;

public class ReverseAString {
    public static void main(String[] args) {
        String s = "Geeks";
        System.out.print(reverseWord(s));
    }

    static String reverseWord(String str) {
        return new StringBuilder(str).reverse().toString();
    }
}
