package org.example.basic;

public class LongestIncreasingSubarray {
    public static void main(String[] args) {
        long n = 10,
        a[] = {12, 13, 1, 5, 4, 7, 8, 10, 10, 11};
        System.out.println(lenOfLongIncSubArr(a, n));
    }

    static long lenOfLongIncSubArr(long arr[], long n) {
        long count = 1;
        long max = 1;

        for (int i = 0; i < n - 1; i++) {
            if (arr[i + 1] > arr[i]) {
                count++;
                if (count > max) max = count;
            } else {
                count = 1;
            }
        }
        return max;
    }
}
