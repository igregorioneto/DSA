package org.example.basic;

import java.util.Arrays;

public class ToughCompetitions {
    public static void main(String[] args) {
        int n = 5,
        arr[] = {4, 9, 1, 32, 12};
        System.out.println(toughCompetitor(arr, n));
    }

    static int toughCompetitor(int[] arr, int n) {
        Arrays.sort(arr);
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < n - 1; i++) {
            int difference = arr[i + 1] - arr[i];
            min = Math.min(min, difference);
        }
        return min;
    }

    static int toughCompetitor2(int[] arr, int n) {
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                int sub = 0;
                if (arr[i] < arr[j]) {
                    sub = arr[j] - arr[i];
                } else {
                    sub = arr[i] - arr[j];
                }

                if (sub < min)
                    min = sub;
            }
        }
        return min;
    }
}
