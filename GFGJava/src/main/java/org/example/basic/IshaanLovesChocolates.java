package org.example.basic;

import java.util.Arrays;

public class IshaanLovesChocolates {
    public static void main(String[] args) {
        int arr[] = {5, 9, 2, 6};
        System.out.println(chocolates(arr.length, arr));
    }

    static int chocolates(int n, int[] arr) {
        Arrays.sort(arr);
        return arr[0];
    }
}
