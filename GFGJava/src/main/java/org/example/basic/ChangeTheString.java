package org.example.basic;

public class ChangeTheString {
    public static void main(String[] args) {
        String S = "AbCD";
        System.out.println(modify(S));
    }

    static String modify(String s) {
        if (Character.isUpperCase(s.charAt(0))) return s.toUpperCase(); else return s.toLowerCase();
    }
}
