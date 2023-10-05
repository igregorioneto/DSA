package org.example.basic;

public class LargestElementInArray {
    public static void main(String[] args) {
        int n = 5, A[] = {1, 8, 7, 56, 90};
        System.out.print(largest(A, n));
    }

    static int largest(int arr[], int n) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            if (max < arr[i]) max = arr[i];
        }
        return max;
    }
}
