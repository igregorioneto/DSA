package org.example.basic;

public class IndexOfFirst1InASortedArrayOf0sAnd1s {
    public static void main(String[] args) {
        long arr[] = {0, 0, 0, 0, 0, 0, 1, 1, 1, 1}, n = arr.length;
        System.out.println(firstIndex(arr, n));
    }

    static long firstIndex(long arr[], long n) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) return i;
        }
        return -1;
    }
}
