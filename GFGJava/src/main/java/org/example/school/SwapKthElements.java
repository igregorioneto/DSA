package org.example.school;

public class SwapKthElements {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        swapKth(arr, 5, 2);
        for (int n:arr) {
            System.out.print(n + " ");
        }
    }

    public static void swapKth(int arr[], int n, int k) {
        //1,2,3,4,5 => 1,4,3,2,5
        int a = arr[k - 1];
        arr[k - 1] = arr[arr.length - k];
        arr[arr.length - k] = a;
    }
}
