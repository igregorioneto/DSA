package org.example.basic;

import org.example.util.Pair;

import java.util.Arrays;

public class TypeOfArray {
    public static void main(String[] args) {
        long N = 5,
        A[] = { 3, 4, 5, 1, 2};
        Pair p = maxNType(A, N);
        System.out.println(p.second + " " + p.first);
    }

    static Pair maxNType(long arr[], long n) {
        long min = Long.MAX_VALUE, max = Long.MIN_VALUE;
        int type = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] < min)
                min = arr[i];
            if (arr[i] > max)
                max = arr[i];
        }

        if (arr[0] == min && arr[arr.length - 1] == max) {
            type = 1;
        } else if (arr[0] == max && arr[arr.length - 1] == min) {
            type = 2;
        } else if (arr[0] < arr[arr.length - 1]) {
            type = 3;
        } else {
            type = 4;
        }
        return new Pair(type, max);
    }
}
