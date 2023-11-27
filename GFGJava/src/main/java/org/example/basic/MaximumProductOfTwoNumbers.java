package org.example.basic;

import java.util.Arrays;

public class MaximumProductOfTwoNumbers {
    public static void main(String[] args) {
        int N = 6,
        Arr[] = {1, 4, 3, 6, 7, 0};
        System.out.println(maxProduct(Arr, N));
    }

    static int maxProduct(int arr[], int n) {
        Arrays.sort(arr);
        int prod = arr[n - 1] * arr[n-2];
        return prod;
    }
}
