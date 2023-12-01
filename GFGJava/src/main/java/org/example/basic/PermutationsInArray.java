package org.example.basic;

import java.util.Arrays;
import java.util.Collections;

public class PermutationsInArray {
    public static void main(String[] args) {
        long a[] = {1, 2, 2, 1}, b[] = { 3, 3, 3, 4 }, k = 5;
        System.out.println(isPossible(a,b,a.length, k));
    }

    static boolean isPossible(long a[], long b[], int n, long k) {
        long c[] = new long[n];
        Arrays.sort(a);
        Arrays.sort(b);
        for (int i = 0; i < n; i++) {
            c[n-i-1] = b[i];
        }
        for (int i = 0; i < n; i++) {
            if (a[i] + c[i] >= k) {
                continue;
            } else {
                return false;
            }
        }

        return true;
    }
}
