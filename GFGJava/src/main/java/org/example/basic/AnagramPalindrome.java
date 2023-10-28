package org.example.basic;

import java.util.HashMap;

public class AnagramPalindrome {
    public static void main(String[] args) {
        String S = "geeksogeeks";
        System.out.println(isPossible(S));
    }

    static int isPossible(String S) {
        HashMap<Character, Integer> charCount = new HashMap<>();
        for (char c:S.toCharArray()) {
            charCount.put(c, charCount.getOrDefault(c, 0) + 1);
        }
        int count= 0;
        for (int counter:charCount.values()) {
            if (counter % 2 != 0) {
                if (count == 1) {
                    return 0;
                }
                count++;
            }
        }
        return 1;
    }
}
