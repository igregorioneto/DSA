package org.example.basic;

public class EqualizationOfAnArray {
    public static void main(String[] args) {
        int N = 5;
        long arr[] = {1, 3, 2, 0, 4};
        System.out.println(minOperations(arr, N));
    }

    static long minOperations(long arr[], int N) {
        long sum = 0;
        long avg = 0;
        long result = 0;
        for (long x: arr) {
            sum += x;
        }

        avg = (sum/N);

        if (sum != (avg * N)) {
            return -1;
        }

        for (long x:arr) {
            if (x < avg) {
                result += (avg - x);
            }
        }

        return result;
    }
}

