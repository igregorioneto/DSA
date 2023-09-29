package org.example.school;

public class SumArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        System.out.println(sum(arr, 4));
    }

    public static int sum(int arr[], int n) {
        int r = 0;
        if (arr.length == n) {
            for (int i = 0; i < n; i++) r += arr[i];
        }
        return r;
    }
}
