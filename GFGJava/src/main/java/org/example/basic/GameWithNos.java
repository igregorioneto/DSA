package org.example.basic;

public class GameWithNos {
    public static void main(String[] args) {
        int n=5, arr[ ] = {10, 11, 1, 2, 3};
        for (int e: game_with_number(arr,n)) {
            System.out.print(e + " ");
        }
    }

    static int[] game_with_number(int arr[], int n) {
        int array [] = new int[n];
        for (int i = 0; i < n - 1; i++) {
            array[i] = arr[i] ^ arr[i + 1];
        }
        array[n - 1] = arr[n - 1];
        return array;
    }
}
