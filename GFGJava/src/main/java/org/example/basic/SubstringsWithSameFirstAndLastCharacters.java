package org.example.basic;

import java.util.HashMap;

public class SubstringsWithSameFirstAndLastCharacters {
    public static void main(String[] args) {
        String s = "abcab";
        System.out.println(countSubstringWithEqualsEnds(s));
    }

    static int countSubstringWithEqualsEnds(String s) {
        HashMap<Character, Integer> arr = new HashMap<>();
        int n = s.length();
        for (int i = 0; i < s.length(); i++) {
            arr.put(s.charAt(i), arr.getOrDefault(s.charAt(i), 0) + 1);
            n += arr.get(s.charAt(i)) - 1;
        }
        return n;
    }
}
