package org.example.basic;

import java.util.ArrayList;

public class QuickLeftRotation {
    public static void main(String[] args) {
        int N = 7, K = 2;
        long arr[] = {1, 2, 3, 4, 5, 6, 7};
        leftRotate(arr, K, N);
        for (long e:arr) {
            System.out.print(e + " ");
        }
        System.out.println();
    }

    static void leftRotate(long arr[], int k, int n) {
        ArrayList<Long> array = new ArrayList<>();
        if (k % n == 0)
            return;

        int size = k % n;
        for (int i = size; i < n; i++) {
            array.add(arr[i]);
        }

        for (int i = 0; i < size; i++) {
            array.add(arr[i]);
        }

        for (int i = 0; i < array.size(); i++) {
            arr[i] = array.get(i);
        }
    }
}
