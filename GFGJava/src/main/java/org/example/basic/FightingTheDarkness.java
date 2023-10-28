package org.example.basic;

import java.util.Arrays;

public class FightingTheDarkness {
    public static void main(String[] args) {
        int N = 3; long arr[] = {1,1,2};
        System.out.println(maxDays(arr, N));
    }

    static long maxDays(long arr[], int n) {
        Arrays.sort(arr);
        return arr[n - 1];
    }
}
