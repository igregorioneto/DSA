package org.example.DSA;

import java.util.Arrays;

public class RandomNumbers {
    public static void main(String[] args) {
        int n = 400, arr[] = new int[n], intervalRandom = 1000;
        for (int i = 0; i < n; i++) {
            int number = (int) (Math.random() * intervalRandom);
            arr[i] = number;
        }
        Arrays.sort(arr);
        double avg = ((double) arr[0] + arr[n - 1]) / 2;
        System.out.println("Média: " + avg);
    }
}
