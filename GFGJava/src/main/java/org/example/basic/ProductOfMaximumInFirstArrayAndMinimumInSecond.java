package org.example.basic;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ProductOfMaximumInFirstArrayAndMinimumInSecond {
    public static void main(String[] args) {
        int A[] = {5, 7, 9, 3, 6, 2},
                B[] = {1, 2, 6, -1, 0, 9};
        System.out.println(findMultiplication(A, B, A.length, B.length));
    }

    static long findMultiplication(int arr[], int brr[], int n, int m) {
        int max = Integer.MIN_VALUE, min = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        for (int i = 0; i < m; i++) {
            if (brr[i] < min) {
                min = brr[i];
            }
        }
        return max * min;
    }

    static long findMultiplication2(int arr[], int brr[], int n, int m) {
        Arrays.sort(arr);
        Arrays.sort(brr);
        int max = arr[n - 1], min = brr[0];
        return max * min;
    }
}
