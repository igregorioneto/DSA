package org.example.basic;

import java.util.Arrays;

public class ThirdLargestElement {
    public static void main(String[] args) {
        int N = 5;
        int[] A = {2,4,1,3,5};
        System.out.print(thirdLargest(A, N));
    }

    static int thirdLargest(int a[], int n) {
        Arrays.sort(a);
        return a[a.length - 3];
    }
}
