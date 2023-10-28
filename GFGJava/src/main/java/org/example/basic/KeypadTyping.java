package org.example.basic;

import java.util.HashMap;
import java.util.Map;

public class KeypadTyping {
    public static void main(String[] args) {
        String S = "geeksforgeeks";
        System.out.println(printNumber(S, S.length()));
    }

    static final Map<Character, String> letterToNumber = new HashMap<>();
    static {
        letterToNumber.put('a', "2");
        letterToNumber.put('b', "2");
        letterToNumber.put('c', "2");
        letterToNumber.put('d', "3");
        letterToNumber.put('e', "3");
        letterToNumber.put('f', "3");
        letterToNumber.put('g', "4");
        letterToNumber.put('h', "4");
        letterToNumber.put('i', "4");
        letterToNumber.put('j', "5");
        letterToNumber.put('k', "5");
        letterToNumber.put('l', "5");
        letterToNumber.put('m', "6");
        letterToNumber.put('n', "6");
        letterToNumber.put('o', "6");
        letterToNumber.put('p', "7");
        letterToNumber.put('q', "7");
        letterToNumber.put('r', "7");
        letterToNumber.put('s', "7");
        letterToNumber.put('t', "8");
        letterToNumber.put('u', "8");
        letterToNumber.put('v', "8");
        letterToNumber.put('w', "9");
        letterToNumber.put('x', "9");
        letterToNumber.put('y', "9");
        letterToNumber.put('z', "9");
    }

    static String printNumber(String s, int n) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            String number = letterToNumber.get(s.charAt(i));
            if (number != null) {
                sb.append(number);
            }
        }

        return sb.toString();
    }

    static String printNumber2(String s, int n) {
        String res = "";
        for (int i = 0; i < n; i++) {
            res += returnNumberFormat(String.valueOf(s.charAt(i)));
        }
        return res;
    }

    static String returnNumberFormat(String s) {
        if ("abc".contains(s)) {
            return "2";
        } else if ("def".contains(s)) {
            return "3";
        } else if ("ghi".contains(s)) {
            return "4";
        } else if ("jkl".contains(s)) {
            return "5";
        } else if ("mno".contains(s)) {
            return "6";
        } else if ("pqrs".contains(s)) {
            return "7";
        } else if ("tuv".contains(s)) {
            return "8";
        } else if ("wxyz".contains(s)) {
            return "9";
        } else {
            return "";
        }
    }
}
