package org.example;

public class CountOfSmallerElements {
    public static void main(String[] args) {
        long[] arr = {1,2,4,5,8,10};
        System.out.println(countOfElements(arr, 6,9));
    }

    public static long countOfElements(long arr[], long n, long x) {
        long count = 0;
        if (arr.length == n) {
            for (int i = 0; i < n; i++) {
                if (arr[i] <= x) count++;
            }
        }
        return count;
    }
}
