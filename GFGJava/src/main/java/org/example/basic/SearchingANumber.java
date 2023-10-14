package org.example.basic;

public class SearchingANumber {
    public static void main(String[] args) {
        int N = 5, K = 16, Arr[] = {9, 7, 2, 16, 4};
        System.out.println(search(Arr, N, K));
    }

    static int search(int arr[], int n, int k) {
        int occurence = -1;
        for (int i = 0; i < n; i++) {
            if (arr[i] == k) {
                occurence = i + 1;
                break;
            }
        }
        return occurence;
    }
}
