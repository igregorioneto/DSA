package org.example.basic;

public class RotatingAnArray {
    public static void main(String[] args) {
        int N = 7, Arr[] = {1, 2, 3, 4, 5, 6, 7} ,D = 2;
        leftRotate(Arr, N, D);
        System.out.println();
        for (int i = 0; i < N; i++) {
            System.out.print(Arr[i] + " ");
        }
    }

    static void leftRotate(int[] arr, int n, int d) {
        int array[] = new int[n];
        for (int i = d; i < n; i++) {
            array[i - d] = arr[i];
        }
        int count = 1;
        for (int i = d - 1; i >= 0; i--) {
            array[n - count] = arr[i];
            count++;
        }
        for (int i = 0; i < n; i++) {
            arr[i] = array[i];
        }
    }
}
