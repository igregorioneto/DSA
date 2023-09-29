package org.example.school;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PrintTheLeftElement {
    public static void main(String[] args) {
        long A[] = {8, 1, 2, 9, 4, 3, 7, 5};
        System.out.print(leftElement(A,8));
    }

    public static long leftElement(long arr[], long n) {
        // 1,2,3,4,5,7,8,9
        Arrays.sort(arr);
        if (n % 2 == 0) return arr[(arr.length/2) -1];
        return arr[arr.length / 2];
    }
}
