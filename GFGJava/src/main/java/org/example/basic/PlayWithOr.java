package org.example.basic;

public class PlayWithOr {
    public static void main(String[] args) {
        int arr[] = {10, 11, 1, 2, 3};
        for (int e:gameWithNumber(arr, arr.length)) {
            System.out.print(e + " ");
        }
    }

    static int[] gameWithNumber(int arr[], int n) {
        for (int i = 0; i < n - 1; i++) {
            arr[i] = arr[i] | arr[i + 1];
        }
        return arr;
    }
}
