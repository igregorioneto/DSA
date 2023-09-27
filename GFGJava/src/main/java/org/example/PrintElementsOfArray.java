package org.example;

public class PrintElementsOfArray {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        printArray(arr, 5);
    }

    public static void printArray(int arr[], int n) {
        for (int i = 0; i < n; i++) System.out.print(arr[i] + " ");
    }
}
