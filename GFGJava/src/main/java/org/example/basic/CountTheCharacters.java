package org.example.basic;

import java.util.HashMap;

public class CountTheCharacters {
    public static void main(String[] args) {
        String S = "geeksforgeeks"; int N = 2;
        System.out.println(getCount(S, N));
    }

    static int getCount(String S, int N) {
        HashMap<Character, Integer> charCount = new HashMap<>();
        charCount.put(S.charAt(0), 1);
        for (int i = 1; i < S.length(); i++) {
            if (S.charAt(i) != S.charAt(i - 1)) {
                charCount.put(S.charAt(i), charCount.getOrDefault(S.charAt(i), 0) + 1);
            }
        }

        int count = 0;
        for (Integer i:charCount.values()) {
            if (i == N) {
                count++;
            }
        }
        return count;
    }

    static int getCount3(String S, int N) {
        HashMap<Character, Integer> charCount = new HashMap<>();
        int count = 0;
        for (int i = 0; i < S.length(); i++) {
            char c = S.charAt(i);
            if (c >= 'a' && c <= 'z') {
                charCount.put(c, charCount.getOrDefault(c, 0) + 1);
            }

            if (charCount.get(c) == N) {
                count++;
            }
        }
        return count;
    }

    // Complexidade de tempo O(N * M) onde M = Número de caracteres 26 de 'a' até 'z'
    static int getCount2(String S, int N) {
        int[] a = new int[26];
        for (int i = 0; i < S.length(); i++) {
            char c = S.charAt(i);
            if (c >= 'a' && c <= 'z') {
                a[c - 'a']++;
            }
        }
        int count = 0;
        for (int i:a) {
            if (i == N) count++;
        }
        return count;
    }
}
