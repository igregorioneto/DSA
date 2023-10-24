package org.example.basic;

import java.util.ArrayList;
import java.util.List;

public class AnagramOfString {
    public static void main(String[] args) {
        String S1 = "bcadeh", S2 = "hea";
        System.out.println(remAnagrams(S1, S2));
    }

    static int remAnagrams(String s, String s1) {
        char[] arr1 = s.toCharArray();
        char[] arr2 = s1.toCharArray();

        int[] count1 = new int[26];
        int[] count2 = new int[26];

        for (char c:arr1) {
            count1[c - 'a']++;
        }

        for (char c:arr2) {
            count2[c - 'a']++;
        }

        int diff = 0;
        for (int i = 0; i < 26; i++) {
            diff += Math.abs(count1[i] - count2[i]);
        }

        return diff;
    }

    static int remAnagrams2(String s, String s1) {
        char[] S = s.toCharArray();
        char[] S1 = s1.toCharArray();
        List<Character> arr = new ArrayList<>();
        List<Character> arr1 = new ArrayList<>();
        for (int i = 0; i < S.length; i++) {
            arr.add(S[i]);
        }
        for (int i = 0; i < S1.length; i++) {
            arr1.add(S1[i]);
        }
        int size = arr.size();
        int count = 0;
        for (Character e:arr) {
            if (arr1.contains(e)) {
                int index = arr1.indexOf(e);
                arr1.remove(index);
                count++;
            }
        }
        return (size - count) + arr1.size();
    }
}
