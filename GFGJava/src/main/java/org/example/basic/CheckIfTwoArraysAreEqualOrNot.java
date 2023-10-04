package org.example.basic;

import java.util.Arrays;

public class CheckIfTwoArraysAreEqualOrNot {
    public static void main(String[] args) {
        int N = 5;
        long A[] = {1,2,5,4,0};
        long B[] = {2,4,5,0,2};
        System.out.print(check(A, B, N));
    }

    static boolean check(long A[], long B[], int N) {
        Arrays.sort(A);
        Arrays.sort(B);
        boolean equals = false;
        for (int i = 0; i < N; i++) {
            if (A[i] == B[i]) {
                equals = true;
            } else {
                equals = false;
                break;
            }
        }
        return equals;
    }
}
