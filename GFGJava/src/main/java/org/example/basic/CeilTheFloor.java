package org.example.basic;

import java.util.Arrays;
import java.util.OptionalInt;

public class CeilTheFloor {

    static class Pair {
        int floor, ceil;

        Pair() {
            this.floor = 0;
            this.ceil = 0;
        }

        Pair(int floor, int ceil) {
            this.floor = floor;
            this.ceil = ceil;
        }
    }

    public static void main(String[] args) {
        int N = 8, X = 7,
        Arr[] = {5, 6, 8, 9, 6, 5, 5, 6};
        Pair p = getFloorAndCeil(Arr, N, X);
        System.out.println(p.floor + " " + p.ceil);
    }

    static Pair getFloorAndCeil(int[] arr, int n, int x) {
        Pair p = new Pair();
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            if (arr[i] <= x && arr[i] > max) {
                max = arr[i];
            }

            if (arr[i] >= x && arr[i] < min) {
                min = arr[i];
            }

        }

        if (min == Integer.MAX_VALUE) {
            min = -1;
        }

        if (max == Integer.MIN_VALUE) {
            max = -1;
        }

        p.floor = max;
        p.ceil = min;

        return p;
    }
}
