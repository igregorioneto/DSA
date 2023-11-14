package org.example.basic;

import java.util.Arrays;

public class SortFirstHalfInAscendingAndSecondHalfInDescending {
    public static void main(String[] args) {
        int n = 5,
        arr[] = {10, 20, 30, 40, 3};
        customSort(arr, n);
        for (int e:arr) {
            System.out.print(e + " ");
        }
    }

    static void customSort(int[] arr, int n) {
        Arrays.sort(arr, 0, n / 2);
        Arrays.sort(arr, n/2, n);

        int i = n/2;
        int j = n - 1;

        while (i <= j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;

            i++;
            j--;
        }
    }
}
