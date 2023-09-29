package org.example.school;

import java.util.Arrays;

public class PalindromicArray {
    public static void main(String[] args) {
        int[] a = {111,222,333,444,555};
        System.out.println(palinArray(a, 5));
    }

    public static int palinArray(int[] a, int n) {
        int isPalin = 0;
        if (a.length == n) {
            for (int i = 0; i < n; i++) {
                String reverse = String.valueOf(new StringBuilder(String.valueOf(a[i])).reverse());
                if (String.valueOf(a[i]).equals(reverse)){
                    isPalin = 1;
                } else {
                    isPalin = 0;
                    break;
                }
            }
        }
        return isPalin;
    }
}
