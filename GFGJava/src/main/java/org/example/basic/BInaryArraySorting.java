package org.example.basic;

import java.util.Arrays;

public class BInaryArraySorting {
    public static void main(String[] args) {
        int N = 5;
        int[] arr = { 1, 0, 1, 1, 0 };
        binSort(arr, N);
        for (int e:arr) {
            System.out.print(e + " ");
        }
        System.out.println();
    }

    static void binSort(int A[], int N) {
        Arrays.sort(A);
    }
}
