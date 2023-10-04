package org.example.basic;

public class BinarySearch {
    public static void main(String[] args) {
        int N = 5, arr[] = {1, 2 ,3 ,4 ,5}, K = 400;
        System.out.print(binarysearch(arr, N, K));
    }

    static int binarysearch(int arr[], int n, int k) {
        int index = -1;
        for (int i = 0; i < n; i++) {
            if (arr[i] == k) index = i;
        }
        return index;
    }
}
