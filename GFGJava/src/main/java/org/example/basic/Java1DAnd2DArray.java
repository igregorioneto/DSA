package org.example.basic;

import java.util.ArrayList;
import java.util.Arrays;

public class Java1DAnd2DArray {
    public static void main(String[] args) {
        int arr[][] = {{1,2,3}, {4,5,6}, {7, 8,9}},
        N = 3,
        brr[] = {3, 6, 9};

        for (Integer e:array(arr, brr, N)) {
            System.out.print(e + " ");
        }
    }

    static ArrayList<Integer> array(int a[][], int b[], int n) {
        ArrayList<Integer> arr = new ArrayList<>();
        int sumDiagonal = 0, maxElement = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j) {
                    sumDiagonal += a[i][j];
                }
            }
        }

        Arrays.sort(b);

        maxElement = b[b.length - 1];

        arr.add(sumDiagonal);
        arr.add(maxElement);

        return arr;
    }
}
