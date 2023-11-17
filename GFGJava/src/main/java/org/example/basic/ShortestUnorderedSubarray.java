package org.example.basic;

public class ShortestUnorderedSubarray {
    public static void main(String[] args) {
        long n = 5,
        a[] = {7, 9, 10, 8, 11};
        System.out.println(shortesUnorderedSubarray(a, n));
    }

    static long shortesUnorderedSubarray(long arr[], long n) {
        for (int i = 0; i < n - 2 ; i++) {
            if (arr[i+1] < arr[i] && arr[i+1] < arr[i + 2] ||
                    arr[i + 1] > arr[i] && arr[i + 1] > arr[i + 2]) {
                return 3;
            }
        }
        return 0;
    }
}
