package org.example.DSA;

import java.util.Arrays;

public class AscendingOrder {
    public static void main(String[] args) {
        int n = 6, arr[] = new int[n], intervalNumbers = 1000;
        for (int i = 0; i < n; i++) {
            int number = (int) (Math.random() * intervalNumbers);
            arr[i] = number;
        }
        Arrays.sort(arr);
        for (int e:arr) {
            System.out.print(e + " ");
        }
    }
}
