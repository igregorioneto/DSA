package org.example.basic;

import java.util.Arrays;

public class MaximumWeightDifference {
    public static void main(String[] args) {
        int n = 5, k = 2,
        arr[] = {8, 4, 5, 2, 10};
        System.out.println(solve(arr, n, k));
    }

    static long solve(int[] arr, int n, int k) {
        Arrays.sort(arr);

        int new_k = (k <= n/2) ? k : n - k;

        long sum1 = 0, sum2 = 0;

        for (int i = 0; i < new_k ; i++) {
            sum1 += arr[i];
        }

        for (int i = new_k; i < n; i++) {
            sum2 += arr[i];
        }

        return sum2 - sum1;
    }
}
