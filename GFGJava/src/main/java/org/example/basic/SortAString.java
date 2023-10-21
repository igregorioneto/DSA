package org.example.basic;

import java.util.Arrays;

public class SortAString {
    public static void main(String[] args) {
        String S = "edcab";
        System.out.println(sort(S));
    }

    static String sort(String s) {
        char[] arr = s.toCharArray();
        Arrays.sort(arr);
        return new String(arr);
    }

    static String sort2(String s) {
        char[] arr = s.toCharArray();
        Arrays.sort(arr);
        s = "";
        for (char e:arr) {
            s += e;
        }
        return s;
    }
}
